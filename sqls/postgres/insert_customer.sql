
--  �����f�[�^�o�^�p�̃v���V�[�W���𐶐�����B  --
CREATE OR REPLACE FUNCTION C_CUSTOMER(
    --  �ڋq�e�[�u���ւ̓o�^�f�[�^  --
    IN customerName VARCHAR,
    IN customerKana VARCHAR,
    IN customerPass VARCHAR,
    IN customerBirth DATE,
    IN customerJob VARCHAR,
    IN customerMail VARCHAR,
    IN customerTel VARCHAR,
    IN customerPost VARCHAR,
    IN customerAdd VARCHAR)
RETURNS 
     CHAR(8) AS $$
DECLARE
     customerCode CHAR(8);
BEGIN

     --  �ڋq�R�[�h�V�[�P���X����ڋq�R�[�h���擾  --
    SELECT
        TO_CHAR(nextval('CUSTOMER_CODE_SEQ'), 'FM09999999') INTO customerCode;
    --FROM
      --DUAL ;
      
    --  �ڋq���̓o�^  --
    INSERT INTO CUSTOMER(
      CUSTOMER_CODE,
      CUSTOMER_NAME,
      CUSTOMER_KANA,
      CUSTOMER_PASS,
      CUSTOMER_BIRTH,
      CUSTOMER_JOB,
      CUSTOMER_MAIL,
      CUSTOMER_TEL,
      CUSTOMER_POST,
      CUSTOMER_ADD
    ) VALUES (
      customerCode,
      customerName,
      customerKana,
      customerPass,
      customerBirth,
      customerJob,
      customerMail,
      customerTel,
      customerPost,
      customerAdd
    );
    RETURN customerCode;
END;
$$ LANGUAGE plpgsql;

--  �����ڋq���𐶐�����B  --
SELECT  C_CUSTOMER('�ؑ��@���Y', '�L�����@�^���E', 'password', '1975/01/05', '�v���O���}', 'tarou@example.com', '111-1111-1111', '276-0022', '��t�������s�㍂��');
SELECT  C_CUSTOMER('�O�c�@�ܘY', '�}�G�_�@�S���E', 'password', '1980/12/13', '���݋�', 'gorou@example.com', '222-2222-2222', '135-8671', '�����s�]����L�F3-3-9');
SELECT  C_CUSTOMER('��؁@�Ԏq', '�X�Y�L�@�n�i�R', 'password', '1960/10/21', '��w', '', '333-3333-3333', '616-0000', '���s�s�E����');
SELECT  C_CUSTOMER('�����@��Y', '�J�g�E�@�C�`���E', 'password', '1965/03/12', '���c��', 'irasyai@example.com', '444-4444-4444', '039-1500', '�O�ˌS�܌˒�');
SELECT  C_CUSTOMER('�c���@��s��', '�^�i�J�@�i���g�J', 'password', '1970/06/30', '���c��', 'nantoka@example.com', '555-5555-5555', '039-1500', '�O�ˌS�܌˒�');
SELECT  C_CUSTOMER('�n�Ӂ@��', '���^�i�x�@�t�N���E', 'password', '1966/11/03', '���c��', 'watanabehu@example.com', '666-6666-6666', '135-8671', '�����s�]����L�F3-3-9');
SELECT  C_CUSTOMER('�f�[�^�@���Y', '�f�[�^�@�^���E', 'password', '1970/04/05', '�c��', 'data1@example.com', '123-1234-1234', '135-8671', '�����s�]����L�F3-3-9');
SELECT  C_CUSTOMER('�f�[�^�@���Y', '�f�[�^�@�W���E', 'password', '1972/05/15', '�c��', 'data2@example.com', '123-1234-1234', '135-8671', '�����s�]����L�F3-3-9');
SELECT  C_CUSTOMER('�f�[�^�@�O�Y', '�f�[�^�@�T�u���E', 'password', '1974/06/02', '�c��', 'data3@example.com', '123-1234-1234', '135-8671', '�����s�]����L�F3-3-9');
SELECT  C_CUSTOMER('�f�[�^�@�l�Y', '�f�[�^�@�V���E', 'password', '1976/12/30', '�c��', 'data4@example.com', '123-1234-1234', '135-8671', '�����s�]����L�F3-3-9');
SELECT  C_CUSTOMER('�f�[�^�@�ܘY', '�f�[�^�@�S���E', 'password', '1978/05/25', '�c��', 'data5@example.com', '123-1234-1234', '135-8671', '�����s�]����L�F3-3-9');

--  �����f�[�^�o�^�p�̃v���V�[�W�����폜����B  --
DROP FUNCTION C_CUSTOMER(VARCHAR,VARCHAR,VARCHAR,DATE,VARCHAR,VARCHAR,VARCHAR,VARCHAR,VARCHAR);

COMMIT;

