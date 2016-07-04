
--  �����f�[�^���͂̂��߂̃c�A�[�R�[�h�𐶐�����V�[�P���X  --
CREATE SEQUENCE TOUR_CODE_SEQ
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9999999999
    START WITH 1
    NO CYCLE
;

--  �k�C������u01�F�k�C���A02�F�X���A03�F��茧�A04�F�{�錧�A05�F�H�c���A06�F�R�`���A
--   07�F�������A08�F��錧�A09�F�Ȗ،��A10�F�Q�n���v�ւ�1�����Ԃ̃c�A�[���𐶐�����v���V�[�W��  --
CREATE OR REPLACE FUNCTION C_TOURINFO(
    IN tourName CHAR)
RETURNS 
     INT AS $$
DECLARE
    tourCode CHAR(10);
    i INT;
    j INT;
BEGIN
    i := 1;
    j := 1;
    FOR i IN 1..365 LOOP
      FOR j IN 1..10 LOOP
        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(���A��)01'), '1', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '14000', '1', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(���A��)02'), '1', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '11000', '0', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(1��2��)01'), '2', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '19000', '1', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(1��2��)02'), '2', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '16000', '0', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(2��3��)01'), '3', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '23000', '1', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(2��3��)02'), '3', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '20000', '0', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(3��4��)01'), '4', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '30000', '1', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(3��4��)02'), '4', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '27000', '0', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(4��5��)01'), '5', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '37000', '1', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(4��5��)02'), '5', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '34000', '0', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(5��6��)'), '6', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '45000', '1', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

        SELECT
            TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
        --FROM
        --    DUAL ;
  
        INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
        ) VALUES (
          tourCode, CURRENT_DATE, ('01'||TO_CHAR(j, 'FM09')), (tourName||'(6��7��)'), '7', (CURRENT_DATE + i + 5), '2147483647', '01', TO_CHAR(j, 'FM09'), '0001', '75000', '1', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
        );

      END LOOP;
    END LOOP;
	RETURN i*j;
END;
$$ LANGUAGE plpgsql;

--  �k�C������u01�F�k�C���v�ւ̓��A��c�A�[���𐶐�����v���V�[�W��  --
CREATE OR REPLACE FUNCTION C_TOURINFO2(
    IN tourName CHAR)
RETURNS 
     INT AS $$
DECLARE
    tourCode CHAR(10);
    i INT;
BEGIN
    i := 1;
    FOR i IN 1..99 LOOP
      SELECT
        TO_CHAR(nextval('TOUR_CODE_SEQ'), 'FM0000000999') INTO tourCode;
      --FROM
      --  DUAL ;
  
      INSERT INTO TOURINFO(TOUR_CODE, PLANNED_DAY, PLAN_NO, TOUR_NAME, TOUR_DAYS, DEP_DAY, AVA_REC_MAX, DEP_CODE, ARR_CODE, ACCOM_CODE, BASE_PRICE, CONDUCTOR, TOUR_ABS
      ) VALUES (
        tourCode, CURRENT_DATE, '0101', (tourName||TO_CHAR(i, 'FM09')), '1', (CURRENT_DATE) + 7, '2147483647', '01', '01', '0001', '20000', '1', '�����͕ʓV�n�A�Î�Ɠ����ނ�̑҂h�ցc'||CHR(13)||CHR(10)||'�ڂ������͂���荇�킹�����肢�v���܂��B'
      );
    END LOOP;
	RETURN i;
END;
$$ LANGUAGE plpgsql;

--  �����c�A�[���𐶐�����B  --
SELECT  C_TOURINFO('�y�������߁zTerasoluna�c�A�[');
SELECT  C_TOURINFO('�y���Ԍ���z�X�y�V�����c�A�[');
SELECT  C_TOURINFO2('�y�k�C������z���A��ʓV�n�c�A�[');

--  �����f�[�^�o�^�p�̃v���V�[�W���ƃV�[�P���X���폜����B --
DROP FUNCTION C_TOURINFO(CHAR);
DROP FUNCTION C_TOURINFO2(CHAR);
DROP SEQUENCE TOUR_CODE_SEQ;

COMMIT;

