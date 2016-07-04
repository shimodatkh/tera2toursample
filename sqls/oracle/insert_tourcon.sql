/** �����f�[�^�o�^�p�̃v���V�[�W���𐶐�����B **/
CREATE OR REPLACE PROCEDURE C_TOURCON(
    /* �c�A�[�S���҃e�[�u���ւ̓o�^�f�[�^ */
    tourConName1 IN VARCHAR,
    tourConMail1 IN VARCHAR,
    tourConName2 IN VARCHAR,
    tourConMail2 IN VARCHAR)
AS
    tourConCode CHAR(10);
    i INT;
BEGIN
    i := 1;
    
    FOR i IN 1..6099 LOOP
       /* �S���҃R�[�h�V�[�P���X����S���҃R�[�h���擾 */
      SELECT
          TO_CHAR(TOUR_CON_CODE_SEQ.NEXTVAL, 'FM0000000999') INTO tourConCode
      FROM
        DUAL ;
      
      /* �c�A�[�S���ҏ��̓o�^ */
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
      
      IF i MOD 11 = 0 THEN
        /* �S���҃R�[�h�V�[�P���X����S���҃R�[�h���擾 */
	    SELECT
	        TO_CHAR(TOUR_CON_CODE_SEQ.NEXTVAL, 'FM0000000999') INTO tourConCode
	    FROM
	      DUAL ;
	      
        /* �c�A�[�S���ҏ��̓o�^ */
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
      
      IF i MOD 12 = 0 THEN
        /* �S���҃R�[�h�V�[�P���X����S���҃R�[�h���擾 */
        SELECT
          TO_CHAR(TOUR_CON_CODE_SEQ.NEXTVAL, 'FM0000000999') INTO tourConCode
        FROM
          DUAL ;
        
        /* �c�A�[�S���ҏ��̓o�^ */
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
END;
/

/** �����c�A�[�S���ҏ��𐶐�����B **/
EXECUTE C_TOURCON('�G�k�e�B�e�B�@���Y', 'ntt1@example.com', '�G�k�e�B�e�B�@���Y', 'ntt2@example.com');

/** �����f�[�^�o�^�p�̃v���V�[�W�����폜����B **/
DROP PROCEDURE C_TOURCON;

COMMIT;

