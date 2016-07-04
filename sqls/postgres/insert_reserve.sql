
--  �����f�[�^�o�^�p�̃v���V�[�W���𐶐�����B  --
CREATE OR REPLACE FUNCTION C_RESERVE(
    --  �\��e�[�u���ւ̓o�^�f�[�^  --
    IN tourCode CHAR,
    IN adultCount INT,
    IN childCount INT,
    IN customerCode CHAR,
    IN transferChar CHAR,
    IN remarksVChar VARCHAR)
RETURNS 
    INT AS $$
DECLARE
    reserveCode CHAR(8);
    adultRate INT;
    childRate INT;
    basePrice INT;
BEGIN
    adultRate := 0;
    childRate := 0;
    basePrice := 0;
    
     --  �\��R�[�h�V�[�P���X����\��R�[�h���擾  --
    SELECT
        TO_CHAR(nextval('RESERVE_NO_SEQ'), 'FM09999999') INTO reserveCode;
    --FROM
    --  DUAL ;
    
     --  �c�A�[�e�[�u�������{�������擾  --
    SELECT
        BASE_PRICE INTO basePrice
    FROM
      TOURINFO
    WHERE
      TOUR_CODE = tourCode;

     --  �N�ߋ敪�e�[�u�������l�̔N�ߋ敪�ʊ��������擾  --
    SELECT
        AGE_RATE INTO adultRate
    FROM
      AGE
    WHERE
      AGE_CODE = '0';

     --  �N�ߋ敪�e�[�u�����珬�l�̔N�ߋ敪�ʊ��������擾  --
    SELECT
        AGE_RATE INTO childRate
    FROM
      AGE
    WHERE
      AGE_CODE = '1';
      
    --  �\����̓o�^  --
    INSERT INTO RESERVE(
        RESERVE_NO, TOUR_CODE, RESERVED_DAY, ADULT_COUNT, CHILD_COUNT, CUSTOMER_CODE, TRANSFER, SUM_PRICE, REMARKS
    ) VALUES (
      reserveCode,
      tourCode,
      CURRENT_DATE - 7,
      adultCount,
      childCount,
      customerCode,
      transferChar,
      (basePrice * adultRate / 100 * adultCount) + (basePrice * childRate / 100 * childCount),
      remarksVChar
    );

    RETURN 0;
END;
$$ LANGUAGE plpgsql;

--  �����\����𐶐�����B  --
SELECT  C_RESERVE('0000003012', '5', '3', '00000001', '1', '���ɂȂ�');
SELECT  C_RESERVE('0000003012', '4', '0', '00000002', '0', '');
SELECT  C_RESERVE('0000003012', '1', '3', '00000003', '0', '���ɂȂ�');
SELECT  C_RESERVE('0000003012', '2', '5', '00000004', '0', '���ɂȂ�');
SELECT  C_RESERVE('0000003012', '2', '0', '00000005', '0', '���ɂȂ�');
SELECT  C_RESERVE('0000003012', '2', '2', '00000006', '0', '���ɂȂ�');
SELECT  C_RESERVE('0000000002', '5', '3', '00000001', '1', '���ɂȂ�');
SELECT  C_RESERVE('0000000003', '4', '0', '00000002', '0', '');
SELECT  C_RESERVE('0000000003', '1', '3', '00000003', '0', '���ɂȂ�');
SELECT  C_RESERVE('0000000005', '2', '2', '00000004', '0', '���ɂȂ�');
SELECT  C_RESERVE('0000000005', '2', '1', '00000005', '0', '���ɂȂ�');
SELECT  C_RESERVE('0000000008', '2', '0', '00000006', '0', '���ɂȂ�');
SELECT  C_RESERVE('0000000008', '2', '0', '00000007', '0', '���ɂȂ�');
SELECT  C_RESERVE('0000000008', '2', '0', '00000008', '0', '���ɂȂ�');
SELECT  C_RESERVE('0000000008', '4', '0', '00000001', '0', '���ɂȂ�');

--  �����f�[�^�o�^�p�̃v���V�[�W�����폜����B  --
DROP FUNCTION C_RESERVE(CHAR,INT,INT,CHAR,CHAR,VARCHAR);

COMMIT;

