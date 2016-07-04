/*
 *
 *
 * Copyright (c) 2007, 2010 NTT DATA Corporation
 *
 */
package jp.terasoluna.toursample.uc_a99_03.blogic;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.dao.UpdateDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.toursample.uc_a99_03.dto.RP_A99_03_02_01Input;
import jp.terasoluna.toursample.uc_a99_03.dto.RP_A99_03_02_01Output;

/**
 * <p>
 * �ڋq�o�^��BLogic�N���X�B
 * </p>
 * <ul>
 * <li>UC_A99_03�F�ڋq�o�^
 * </ul>
 * 
 * 
 */
public class RP_A99_03_02_01BLogicImpl 
    implements BLogic<RP_A99_03_02_01Input> {

    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    private QueryDAO queryDAO = null;

    /**
     * DAO�N���X�B<br>
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    private UpdateDAO updateDAO = null;

    /**
     * �V�K�ڋq�����ڋq�e�[�u���ɓo�^����B
     * <p>
     * ���͂������[�U����o�^���� �N�A���A���𐶔N�����ň�ɂ܂Ƃ߂�<br>
     * �ڋqID��DB�̃V�[�P���X�Ŏ�����������B
     * </p>
     * 
     * @param params
     *            ���͒l
     * @return �V�K�ڋqID
     */
    public BLogicResult execute(RP_A99_03_02_01Input params) {

        // ���͒l����N�A���A�����擾����B
        String customerBirthYear = params.getCustomerBirthYear();
        String customerBirthMonth = params.getCustomerBirthMonth();
        String customerBirthDay = params.getCustomerBirthDay();

        // �N�A���A���𐶔N�����ɃZ�b�g����B
        params.setCustomerBirth(customerBirthYear + "/" + 
                                customerBirthMonth + 
                                "/" + customerBirthDay);

        // �V�K�ڋqID��������������B
        RP_A99_03_02_01Output result = 
            queryDAO.executeForObject("UC_A99_03.selectCustomerCode", 
                                      null,
                                      RP_A99_03_02_01Output.class);
        params.setCustomerCode(result.getCustomerCode());

        // �V�K�ڋq��o�^����B
        updateDAO.execute("UC_A99_03.insertCustomer", params);

        // �o�͒l�𐶐�����B
        BLogicResult bResult = new BLogicResult();
        bResult.setResultObject(result);
        bResult.setResultString("success");

        return bResult;
    }

    /**
     * queryDAO��ݒ肷��B
     * 
     * @param queryDAO
     *            �N�G���[DAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {

        this.queryDAO = queryDAO;
    }

    /**
     * updateDAO��ݒ肷��B
     * 
     * @param updateDAO
     *            �A�b�v�f�[�gDAO
     */
    public void setUpdateDAO(UpdateDAO updateDAO) {

        this.updateDAO = updateDAO;
    }

}