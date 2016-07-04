/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.blogic;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.dao.UpdateDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.fw.util.PropertyUtil;
import jp.terasoluna.toursample.common.Constants;
import jp.terasoluna.toursample.common.blogic.PriceCalculateBLogic;
import jp.terasoluna.toursample.common.blogic.TourDetailAcquireBLogic;
import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.dto.TourDetailAcquireOutput;
import jp.terasoluna.toursample.common.exception.RecordNotFoundException;
import jp.terasoluna.toursample.common.util.DateUtil;
import jp.terasoluna.toursample.uc_a01_01.dto.InsertReserveInput;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_03_01Input;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_03_01Output;
import jp.terasoluna.toursample.uc_a01_01.exception.ReservationDeadlinePassedException;
import jp.terasoluna.toursample.uc_a01_01.exception.TourMemberOverException;

/**
 * 
 * �c�A�[�\��̓o�^���s���N���X�B
 * 
 * 
 * 
 * 
 */
public class RP_A01_01_03_01BLogicImpl implements BLogic<RP_A01_01_03_01Input> {

    /**
     * ���ʏ������s��Null���ԋp���ꂽ�ꍇ�̃G���[���b�Z�[�W�B
     */
    public static final String ERROR_NOT_TOURCODE = "error.UC_A01_01.00002";
	
    /**
     * �c�Ȑ�������Ȃ��ꍇ�̃G���[���b�Z�[�W�B
     */
    public static final String ERROR_NOT_ENOUGH_SEAT = "warn.UC_A01_01.00001";

    /**
     * ���O�N���X�B
     */
    private static final Log log = 
        LogFactory.getLog(RP_A01_01_03_01BLogicImpl.class);

    /**
     * �ڍ׏��擾���W�b�N(���ʏ���)
     */
    protected TourDetailAcquireBLogic tourDetailAcquireBLogic = null;
    
    /**
     * �ڍ׏��擾���W�b�N�̏�����
     * 
     * @param tourDetailAcquireBLogic �ڍ׏��擾���W�b�N
     */
    public void setTourDetailAcquireBLogic(
            TourDetailAcquireBLogic tourDetailAcquireBLogic) {

        this.tourDetailAcquireBLogic = tourDetailAcquireBLogic;
    }
    
    /**
     * �����Z�o���W�b�N (���ʏ���)
     */
    protected PriceCalculateBLogic priceCalculateBLogic = null;
    
    /**
     * �����Z�o���W�b�N�̏������B
     * 
     * @param priceCalculateBLogic �����Z�o���W�b�N
     */
    public void setPriceCalculateBLogic(
            PriceCalculateBLogic priceCalculateBLogic) {

        this.priceCalculateBLogic = priceCalculateBLogic;
    }
    
    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B queryDAO �B
     */
    private QueryDAO queryDAO = null;

    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B updateDAO �B
     */
    private UpdateDAO updateDAO = null;

    /**
     * queryDAO���擾����B
     * 
     * @return queryDAO
     */
    public QueryDAO getQueryDAO() {

        return queryDAO;
    }

    /**
     * queryDAO��ݒ肷��B
     * 
     * @param queryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {

        this.queryDAO = queryDAO;
    }

    /**
     * updateDAO���擾����B
     * 
     * @return updateDAO
     */
    public UpdateDAO getUpdateDAO() {

        return updateDAO;
    }

    /**
     * updateDAO��ݒ肷��B
     * 
     * @param updateDAO
     */
    public void setUpdateDAO(UpdateDAO updateDAO) {

        this.updateDAO = updateDAO;
    }

    /**
     * �c�Ȑ��̊m�F�����A����Ȃ���Η�O�������s���B<br>
     * �c�A�[�̗\����s���B<br>
     * 
     * @exception TourMemberOverException
     * @param rp_a01_01_03_01Input
     * @return �r�W�l�X���W�b�N�̎��s���ʁABLogicResult�C���X�^���X�B
     */
    public BLogicResult execute(RP_A01_01_03_01Input rp_a01_01_03_01Input) {

        //���͒l���擾����
    	int adultCount = rp_a01_01_03_01Input.getPriceOutput().getAdultCount();
    	int childCount = rp_a01_01_03_01Input.getPriceOutput().getChildCount();
    	
    	// ���ʂ��i�[����B
        BLogicResult result = new BLogicResult();

        // �c�A�[�ڍ׏��̎擾
        TourDetailAcquireOutput tourDetail = tourDetailAcquireBLogic
            .execute(rp_a01_01_03_01Input.getTourCode());

        // �c�A�[�ڍ׏�񂪎擾�ł��Ȃ��ꍇ�A��O�������s���B       
        if (tourDetail == null) {
            if (log.isErrorEnabled()) {
                log.error(ERROR_NOT_TOURCODE
                          + ":�c�A�[�ڍ׏�񂪎擾�ł��܂���ł����B");
            }
            throw new RecordNotFoundException(ERROR_NOT_TOURCODE);
        }
        
        //���݂̓��t���擾����B
        Date today = DateUtil.getTodayDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        
        calendar.set(Calendar.HOUR_OF_DAY, 0); 
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        calendar.clear(Calendar.MILLISECOND);
        
        //�o�������擾����B
        Date depDay = tourDetail.getDepDay();
        
        //�o���������݂̓��t����7���ȓ��̏ꍇ�̓G���[��ʂ֑J�ڂ���
        if(calendar.getTime().after(DateUtil.getChangedByDaysDate(depDay, -7))){
            if (log.isWarnEnabled()) {
                log.warn("warn.UC_A01_01.00002:�o���������݂̓��t����7���ȏ�ł͂���܂���B");
            }
            throw new ReservationDeadlinePassedException("warn.UC_A01_01.00002");
        }
        
        // �����̌v�Z ���ʏ����𗘗p���ăc�A�[��{�����A�l�����P���A�����Ȃǂ��擾����
        PriceCalculateOutput priceOutput = priceCalculateBLogic
            .execute(tourDetail.getBasePrice(), adultCount, childCount);
        
        // �\��l���B
        int reserveMember = 0;

        // �\��l����ݒ肷��B
        reserveMember = adultCount + childCount;

        // �c�A�[�̍ő�Ís�l�����擾����B
        Integer aveRecMax = queryDAO.executeForObject(
                "UC_A01_01.selectAveRecMaxForUpdate", rp_a01_01_03_01Input,
                Integer.class);

        // �c�A�[�̍ő�Ís�l����null�̏ꍇ�B
        if (aveRecMax == null) {

            if (log.isErrorEnabled()) {
                log.error("error.UC_A01_01.00002:�c�A�[�ő�Ís�l�����擾�ł��܂���B");
            }

            throw new RecordNotFoundException(ERROR_NOT_TOURCODE);
        }

        // ���݂̗\��l���̍��v�����擾����B
        Integer sumCount = 
            queryDAO.executeForObject("UC_A01_01.selectSumCount", 
                                      rp_a01_01_03_01Input, 
                                      Integer.class);

        // �c�A�[�ɗ\�񂪂Ȃ����B
        if (sumCount == null) {

            sumCount = 0;

        }

        // ���݂̗\��\�l���B
        int vacantCount = aveRecMax - sumCount;

        // �\��\�l�����\��l���������Ƃ���O�������s���B
        if (vacantCount < reserveMember) {

            if (log.isWarnEnabled()) {
                log.warn(ERROR_NOT_ENOUGH_SEAT + ":�c�Ȑ�������܂���B");
            }

            throw new TourMemberOverException(ERROR_NOT_ENOUGH_SEAT);

        }

        // �\������擾����B
        Date reservedDay = DateUtil.getTodayDate();

        // �\��ԍ����擾����B
        String reserveNo = 
            queryDAO.executeForObject("UC_A01_01.selectReserveNo", 
                                      rp_a01_01_03_01Input, 
                                      String.class);

        // �\������邽�߂̃N���X�̐����B
        InsertReserveInput input = new InsertReserveInput();

        // �}�����ڂ��Z�b�g����B
        input.setReserveNo(reserveNo);
        input.setReservedDay(reservedDay);
        input.setUSER_VALUE_OBJECT(rp_a01_01_03_01Input.getUSER_VALUE_OBJECT());
        input.setAdultCount(adultCount);
        input.setChildCount(childCount);
        input.setRemarks(rp_a01_01_03_01Input.getRemarks());
        input.setTourCode(rp_a01_01_03_01Input.getTourCode());
        input.setSumPrice(priceOutput.getSumPrice());

        // �\����s���B
        updateDAO.execute("UC_A01_01.insertReserve", input);

        // �o�̓N���X�𐶐�����B
        RP_A01_01_03_01Output rp_a01_01_03_01Output = new RP_A01_01_03_01Output();

        // �x���������Z�o����B
        Date paymentTimeLimit = DateUtil
                .getOneWeekBeforeDate(depDay);

        // �o�͒l�̐ݒ�B
        rp_a01_01_03_01Output.setTourDetail(tourDetail);
        rp_a01_01_03_01Output.setPriceOutput(priceOutput);
        rp_a01_01_03_01Output.setReserveNo(reserveNo);
        rp_a01_01_03_01Output.setReservedDay(reservedDay);
        rp_a01_01_03_01Output.setPaymentMethod(PropertyUtil
                .getProperty(Constants.PAYMENT_METHOD));
        rp_a01_01_03_01Output.setPaymentAccount(PropertyUtil
                .getProperty(Constants.PAYMENT_ACCOUNT));
        rp_a01_01_03_01Output.setPaymentCompanyName(PropertyUtil
                .getProperty(Constants.PAYMENT_COMPANY_NAME));
        rp_a01_01_03_01Output.setReferenceName(PropertyUtil
                .getProperty(Constants.COMPANY_NAME));
        rp_a01_01_03_01Output.setReferenceTel(PropertyUtil
                .getProperty(Constants.COMPANY_TEL));
        rp_a01_01_03_01Output.setReferenceEmail(PropertyUtil
                .getProperty(Constants.COMPANY_MAIL));
        rp_a01_01_03_01Output.setPaymentTimeLimit(paymentTimeLimit);

        // ���ʂ��Z�b�g����B
        result.setResultObject(rp_a01_01_03_01Output);
        result.setResultString("success");

        return result;
    }

}
