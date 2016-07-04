
--  �����f�[�^�o�^�p�̃v���V�[�W���𐶐�����B  --
CREATE OR REPLACE FUNCTION C_TOURCON(
    --  �c�A�[�S���҃e�[�u���ւ̓o�^�f�[�^  --
    IN tourConName1 VARCHAR,
    IN tourConMail1 VARCHAR,
    IN tourConName2 VARCHAR,
    IN tourConMail2 VARCHAR)
RETURNS 
    INT AS $$
DECLARE
    tourConCode CHAR(10);
    i INT;
BEGIN
    i := 1;
    
    FOR i IN 1..6099 LOOP
       --  �S���҃R�[�h�V�[�P���X����S���҃R�[�h���擾  --
      SELECT
          TO_CHAR(nextval('TOUR_CON_CODE_SEQ'), 'FM0000000999') INTO tourConCode;
      --FROM
      --  DUAL ;
      
      --  �c�A�[�S���ҏ��̓o�^  --
      INSERT INTO TOURCON(
        TOUR_CODE,
        TOUR_CON_CODE,
        TOUR_CON_NAME,
        TOUR_CON_MAIL
      ) VALUES (
        TO_CHAR(i, 'FM0000000999'),
        tourConCode,
        tourConName1,
        tourConMail1
      );
      
      IF mod(i,11) = 0 THEN
        --  �S���҃R�[�h�V�[�P���X����S���҃R�[�h���擾  --
	    SELECT
	        TO_CHAR(nextval('TOUR_CON_CODE_SEQ'), 'FM0000000999') INTO tourConCode;
	    --FROM
	    --  DUAL ;
	      
        --  �c�A�[�S���ҏ��̓o�^  --
        INSERT INTO TOURCON(
          TOUR_CODE,
          TOUR_CON_CODE,
          TOUR_CON_NAME,
          TOUR_CON_MAIL
        ) VALUES (
          TO_CHAR(i, 'FM0000000999'),
          tourConCode,
          tourConName2,
          tourConMail2
        );
      END IF;
      
      IF mod(i,12) = 0 THEN
        --  �S���҃R�[�h�V�[�P���X����S���҃R�[�h���擾  --
        SELECT
          TO_CHAR(nextval('TOUR_CON_CODE_SEQ'), 'FM0000000999') INTO tourConCode;
        --FROM
        --  DUAL ;
        
        --  �c�A�[�S���ҏ��̓o�^  --
        INSERT INTO TOURCON(
          TOUR_CODE,
          TOUR_CON_CODE,
          TOUR_CON_NAME,
          TOUR_CON_MAIL
        ) VALUES (
          TO_CHAR(i, 'FM0000000999'),
          tourConCode,
          tourConName2,
          tourConMail2
        );
      END IF;
    END LOOP;
    RETURN 0;
END;
$$ LANGUAGE plpgsql;


--  �����c�A�[�S���ҏ��𐶐�����B  --
SELECT  C_TOURCON('�G�k�e�B�e�B�@���Y', 'ntt1@example.com', '�G�k�e�B�e�B�@���Y', 'ntt2@example.com');

--  �����f�[�^�o�^�p�̃v���V�[�W�����폜����B  --
DROP FUNCTION C_TOURCON(VARCHAR,VARCHAR,VARCHAR,VARCHAR);

COMMIT;

