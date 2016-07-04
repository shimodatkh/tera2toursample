/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.common.blogic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.toursample.common.dto.PriceCalculateOutput;
import jp.terasoluna.toursample.common.exception.TourSystemException;

/**
 * �P�������Z�o�r�W�l�X���W�b�N�N���X�B<br>
 * �f�[�^�x�[�X�����l�A�q�ǂ��̔N�ߋ敪�ʊ��������擾���A�P���A�y�ї����� �Z�o����B<br>
 * �f�[�^�x�[�X�ɂ͢��l��ɑ΂��颔N�ߋ敪�R�[�h��Ƃ��Ģ0��A��q�ǂࣂɑ΂��� ��N�ߋ敪�R�[�h��Ƃ��Ģ1����ݒ肳��Ă���B<br>
 * �����0��Ƣ1��̃f�[�^�����݂��Ȃ���{@link TourSystemException}����������B<br>
 * 
 * <br>
 * �E���ʏ���CP0009�F�P�������Z�o���� <br>
 * <br>
 * �E�v�Z��<br>
 * &nbsp;&nbsp;- ��{�����F10,000�~<br>
 * &nbsp;&nbsp;- ��l���F3��<br>
 * &nbsp;&nbsp;- �q�ǂ����F1��<br>
 * &nbsp;&nbsp;- ��l�̔N�ߋ敪�ʊ������F100<br>
 * &nbsp;&nbsp;- �q�ǂ��̔N�ߋ敪�ʊ������F60<br>
 * 
 * �E����<br>
 * &nbsp;&nbsp;- ��l�̒P���F��{�����~��l�̔N�ߋ敪�ʊ������^100��10,000�~ <br>
 * &nbsp;&nbsp;- �q�ǂ��̒P���F��{�����~�q�ǂ��̔N�ߋ敪�ʊ������^100��6,000�~ <br>
 * &nbsp;&nbsp;- ��l�̗����F��l�̒P���~��l����30,000�~<br>
 * &nbsp;&nbsp;- �q�ǂ��̗����F�q�ǂ��̒P���~�q�ǂ�����6,000�~<br>
 * &nbsp;&nbsp;- ���v�����F��l�̗����{�q�ǂ��̗�����36,000�~<br>
 * <br>
 * 
 * 
 */
public class PriceCalculateBLogicImpl implements PriceCalculateBLogic {

    /**
     * ���O�N���X�B
     */
    private static final Log log = 
        LogFactory.getLog(PriceCalculateBLogicImpl.class);

    /**
     * �f�[�^�x�[�X����̔N�ߋ敪�ʊ������擾�Ɏ��s�����ꍇ�� �G���[���b�Z�[�W�R�[�h�B
     */
    private static final String GET_RATE_ERROR = "error.common.00007";

    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    protected QueryDAO queryDAO = null;

    /**
     * QueryDAO��ݒ肷��B
     * 
     * @param queryDAO
     *            QueryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {

        this.queryDAO = queryDAO;
    }

    /**
     * �P���A�����̎Z�o���s�Ȃ��B
     * 
     * @param basePrice
     *            ��{����
     * @param adultCount
     *            �l��(��l)
     * @param childCount
     *            �l��(�q�ǂ�)
     * @return �P�������Z�o����
     * @exception TourSystemException
     *                �N�ߋ敪�ʊ������̎擾���s��
     */
    public PriceCalculateOutput execute(Integer basePrice, Integer adultCount,
            Integer childCount) {

        // �������ʂ��i�[����I�u�W�F�N�g
        PriceCalculateOutput result = new PriceCalculateOutput();

        Integer adultRate = null;
        Integer childRate = null;

        // ��l�̔N�ߋ敪�ʊ��������擾����B
        // �0��͢��l��ɑ΂��颔N�ߋ敪�R�[�h��ł���B
        adultRate = queryDAO.executeForObject("common.selectAgeRate", "0",
                                              Integer.class);

        // �q�ǂ��̔N�ߋ敪�ʊ��������擾����B
        // �1��͢�q�ǂࣂɑ΂��颔N�ߋ敪�R�[�h��ł���B
        childRate = queryDAO.executeForObject("common.selectAgeRate", "1",
                                              Integer.class);

        // �N�ߋ敪�ʊ��������擾����Ȃ������ꍇ�A�G���[�𔭐�����B
        if (adultRate == null || childRate == null) {

            if (log.isErrorEnabled()) {
                log
                    .error(GET_RATE_ERROR + ": �f�[�^�x�[�X����N�ߋ敪�ʊ�����"
                            + "�̎擾�����s���܂����B");
            }

            throw new TourSystemException(GET_RATE_ERROR);
        }

        // ��l�̒P�����v�Z���A�������ʂɊi�[����B
        // �v�Z���ʂɏ����_���o��ꍇ�͐؂�̂Ă�B
        int adultUnitPrice = basePrice * adultRate / 100;

        result.setAdultUnitPrice(adultUnitPrice);

        // ��l�̗������v�Z���A�������ʂɊi�[����B
        int adultPrice = adultCount * adultUnitPrice;
        result.setAdultPrice(adultPrice);

        // �q�ǂ��̒P�����v�Z���A�������ʂɊi�[����B
        // �v�Z���ʂɏ����_���o��ꍇ�͐؂�̂Ă�B
        int childUnitPrice = basePrice * childRate / 100;

        result.setChildUnitPrice(childUnitPrice);

        // �q�ǂ��̗������v�Z���A�������ʂɊi�[����B
        int childPrice = childCount * childUnitPrice;
        result.setChildPrice(childPrice);

        // �������ʂɐl��(��l)���i�[����B
        result.setAdultCount(adultCount);

        // �������ʂɐl��(�q�ǂ�)���i�[����B
        result.setChildCount(childCount);

        // ���v�������v�Z���A�������ʂɊi�[����B
        result.setSumPrice(adultPrice + childPrice);

        return result;

    }

}
