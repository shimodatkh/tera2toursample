/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a01_01.blogic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Map;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicMessage;
import jp.terasoluna.fw.service.thin.BLogicMessages;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.toursample.common.util.DateUtil;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_01_02Input;
import jp.terasoluna.toursample.uc_a01_01.dto.RP_A01_01_01_02Output;
import jp.terasoluna.toursample.uc_a01_01.dto.SelectTourInfoInput;
import jp.terasoluna.toursample.uc_a01_01.dto.TourInfo;

/**
 * <p>
 * �c�A�[�������擾�r�W�l�X���W�b�N�B
 * �c�A�[�\��o�^�������N�G�X�g�ƃc�A�[�\��y�[�W�����N�J�ڃ��N�G�X�g��<br>
 * ���킹���N���X�B
 * </p>
 * 
 * 
 * 
 */
public class RP_A01_01_01_02BLogicImpl 
    implements BLogic<RP_A01_01_01_02Input> {

    /**
     * �������ʃ��R�[�h����0���̏ꍇ�̃��b�Z�[�W�B
     */
    public static final String INFO_NOT_TOUR = "info.UC_A01_01.00003";

    /**
     * �������ʃ��R�[�h����1���ȏ�̏ꍇ�̃��b�Z�[�W�B
     */
    public static final String INFO_TOUR = "info.common.00001";

    /**
     * ���O�N���X�B
     */
    private static final Log log = 
        LogFactory.getLog(RP_A01_01_01_02BLogicImpl.class);

    /**
     * DAO�N���X�B Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    protected QueryDAO queryDAO = null;

    /**
     * ���������̃R�[�h��ϊ�����Map�B
     */
    private Map<String, Integer> daysMap = null;

    /**
     * ��{�����̃R�[�h��ϊ�����Map�B
     */
    private Map<String, Integer> priceMap = null;

    /**
     * QueryDAO��ݒ肷��B
     * 
     * @param queryDAO �ݒ肷��QueryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {
        this.queryDAO = queryDAO;
    }

    /**
     * ���������̃R�[�h��ϊ�����Map��ԋp����B
     * 
     * @return ���������̃R�[�h��ϊ�����Map
     */
    public Map<String, Integer> getDaysMap() {
        return daysMap;
    }

    /**
     * ���������̃R�[�h��ϊ�����Map��ݒ肷��B
     * 
     * @param daysMap �ݒ肷����������̃R�[�h��ϊ�����Map
     */
    public void setDaysMap(Map<String, Integer> daysMap) {
        this.daysMap = daysMap;
    }

    /**
     * ��{�����̃R�[�h��ϊ�����Map��ԋp����B
     * 
     * @return ��{�����̃R�[�h��ϊ�����Map
     */
    public Map<String, Integer> getPriceMap() {
        return priceMap;
    }

    /**
     * ��{�����̃R�[�h��ϊ�����Map��ݒ肷��B
     * 
     * @param priceMap �ݒ肷���{�����̃R�[�h��ϊ�����Map
     */
    public void setPriceMap(Map<String, Integer> priceMap) {
        this.priceMap = priceMap;
    }

    /**
     * 1:���͏��ƃR�[�h���X�g��񂩂猟�������𐶐����āA���������擾����B
     * <br>
     * 2:�y�[�W�����N�@�\����������B
     * 
     * @param param ����������ێ�����Dto�N���X
     * @return �������ʁB
     */
    public BLogicResult execute(RP_A01_01_01_02Input param) {

        // ���s���ʂ�p�ӂ���B
        BLogicResult result = new BLogicResult();

        // �c�A�[�������邽�߂̃N���X�𐶐�����B
        SelectTourInfoInput selectInput = new SelectTourInfoInput();

        // ����������ϊ�����B
        Integer days = daysMap.get(param.getTourDaysCondition());

        // ��{������ϊ�����B
        Integer price = priceMap.get(param.getBasePriceCondition());

        // �����������Z�b�g����B
        // (�o���n����,�ړI�n����,�c�A�[�o����,��������,��{����,)
        selectInput.setDepCodeCondition(param.getDepCodeCondition());
        selectInput.setArrCodeCondition(param.getArrCodeCondition());
        String jointDepDay = 
            param.getDepDayYearCondition() + "/" + 
            param.getDepDayMonthCondition() + "/" + 
            param.getDepDayDayCondition();
        selectInput.setDepDayCondition(jointDepDay);
        selectInput.setTourDays(days);
        selectInput.setAdultCountCondition(param.getAdultCountCondition());
        selectInput.setChildCountCondition(param.getChildCountCondition());
        selectInput.setBasePrice(price);

        // �o�͏����i�[����N���X�𐶐�����B
        RP_A01_01_01_02Output rp_a01_01_01_02Output = 
            new RP_A01_01_01_02Output();

        // �f�[�^�x�[�X����c�A�[������񂩂�10�����擾����B
        Integer startIndex = param.getStartIndex();
        Integer row = param.getRow();

        // 10�����c�A�[�̌����Ǝ��s����
        TourInfo[] tourInfo = 
            queryDAO.executeForObjectArray("UC_A01_01.selectTourInfo", 
                    selectInput, TourInfo.class, startIndex, row);

        // �c�A�[�������ʑ��������擾����B
        Integer tourCount = 
            queryDAO.executeForObject("UC_A01_01.selectTourInfoCount", 
                    selectInput, Integer.class);

        // ���b�Z�[�W��ݒ肷��B
        BLogicMessages messages = new BLogicMessages();

        // ��������0������
        if (tourCount == 0) {
            messages.add(this.getClass().getName(), 
                    new BLogicMessage(INFO_NOT_TOUR));

            if (log.isDebugEnabled()) {
                log.debug(INFO_NOT_TOUR + "�c�A�[�������� 0��");
            }

        } else {

            // �����ϊ������B
            for (int i = 0; i < tourInfo.length; i++) {
                tourInfo[i].setTourDays(DateUtil.convertNightDays(tourInfo[i]
                        .getTourIntDays()));
            }

            messages.add(this.getClass().getName(), 
                    new BLogicMessage(INFO_TOUR, tourCount));

            if (log.isDebugEnabled()) {
                log.debug(INFO_TOUR + "�c�A�[��������" + tourCount + "��");
            }

        }

        // �c�A�[���������o�͒l�ɃZ�b�g����B
        rp_a01_01_01_02Output.setTourInfoList(tourInfo);
        rp_a01_01_01_02Output.setAllListInfoLineCount(tourCount);

        // ���ʂ��Z�b�g����B
        result.setMessages(messages);
        result.setResultObject(rp_a01_01_01_02Output);
        result.setResultString("success");

        return result;
    }

}