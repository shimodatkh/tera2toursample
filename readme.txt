*******************************************************************************
      TERASOLUNA Server Framework for Java �iWeb�Łj
      TERASOLUNA�g���x�� �c�A�[�\��V�X�e�� �\�z�菇

      Copyright (C) 2007, 2010 NTT DATA Corporation.
*******************************************************************************


��  �T�v�F

  ����readme�́ATERASOLUNA Server Framework for Java (Web��) 
  �̃c�A�[�\��V�X�e�����\�z����菇���ł��B
  ���L�菇�ɏ]�����ƂŁATERASOLUNA�g���x�� �c�A�[�\��V�X�e�������s���邱�Ƃ���
  ���܂��B



��  �O������F

  �������ɂ́A���炩���߉��L�̂��̂��p�ӂ���Ă���K�v������܂��B 

�@�EOS�FMicrosoft Windows XP Professional SP3
�@�EJDK�FSunJDK 6.0
�@�EDB�T�[�o�FPostgreSQL 8.4��������Oracle Database 11g
�@�EAP�T�[�o�FApache Tomcat 6.0.20
�@�E�����J�����FEclipse SDK 3.4.1
�@�EEclipse plugin�FWTP 3.0.4, Apache Ant 1.7.0
�@�EWeb�u���E�U�FInternet Explorer 7.0
    
  ���L����Ă���o�[�W���������ɓ���m�F���s���Ă��܂����A���̃o�[�W�����ȊO�̊�
  ���ł̓���𐧌�������̂ł͂���܂���B
  �܂��A�����̃C���X�g�[���y�ѐݒ�̎菇�ɂ��ẮA�ʓrWeb��̗��p�K�C�h����
  �Q�Ƃ��Ă��������B 


��  Ant�^�X�N�ꗗ�F

  �v���W�F�N�g�́u/ant�v�f�B���N�g���ɂ́AAnt�^�X�N���L�q���ꂽ�ubuild.xml�v�����݂�
  �܂��B�ȉ���Ant�^�X�N�̈ꗗ�ł��B 

  �Eclean
      �쐬����war�t�@�C���A�R���p�C�����ꂽ�N���X�t�@�C���̍폜���s���܂��B
  �Ecompile
      �R���p�C�����s���܂��B
  �Enative2ascii
      native2ascii�ɂăv���p�e�B�t�@�C���̃R�[�h�ϊ����s���܂��B
  �Edeploy
      �v���W�F�N�g�̃f�v���C���s���܂��B
  �EcreateJavaDoc
      JavaDoc�̐������s���܂��B



��  �T�[�o�̒ǉ��iWTP���j�F

  Eclipse��WTP�v���O�C������������Ă���ꍇ�A�ȉ��̎菇�ŃT�[�o��ǉ����܂��B 

  1.Eclipse��ʂɂāu�E�B���h�E�v���u�r���[�̕\���v���u���̑��v�����s���A�u�T�[
    �o�[�v��I�����uOK�v���N���b�N���܂��B 
  2.�T�[�o�[�r���[�ŉE�N���b�N�u�V�K�v���u�T�[�o�[�v�����s���܂��B 
  3.�uApache�v���uTomcat v6.0 �T�[�o�[�v��I�����A�u���ցv���N���b�N���܂��B 
  4.�uTomcat�v��I�����A�u���ցv���N���b�N���܂��B 
  5.���[���̊��ɍ������uTomcat �C���X�g�[����f�B���N�g���[�v��I�����܂��B
  6.�u�I���v���N���b�N���܂��B 



��  �v���W�F�N�g�̎��s�i���ʁj�F

  TERASOLUNA�g���x�� �c�A�[�\��V�X�e����Eclipse�ɃC���|�[�g���܂��B�܂��A�f�[�^
  �x�[�X�̐ݒ���s���܂��B 

  �@ZIP�t�@�C���̓W�J
  
    toursample-javaweb.zip���uC:/�v�����ɓW�J���܂��B 
    �E��uC:/toursample-javaweb/�v
    �i���j�w�肳�ꂽ�f�B���N�g���͌Œ�ł͂Ȃ����߁A�K�X�ǂݑւ��Ď��s���Ă�����
    ���B
    �����ł́A�iWindows XP�́jC:/�ɓW�J����Ɖ��肵�A�菇��i�߂Ă����܂��B 

  �AEclipse�ւ̃C���|�[�g
  
    1.Eclipse��ʂɂāu�t�@�C���v���u�C���|�[�g�v��I�����܂��B
    2.�u�����v���W�F�N�g�����[�N�X�y�[�X�ցv��I�����u���ցv���N���b�N���܂��B
    3.�u���[�g�E�f�B���N�g���[�̑I���v�Ƀ`�F�b�N����������ԂŁu�Q�Ɓv���N���b�N
      ���A�u�����N�v���W�F�N�g��W�J�����e�f�B���N�g�����w�肵�܂��B 
    4.�utoursample-javaweb�v�Ƀ`�F�b�N�������Ă��邱�Ƃ��m�F���A�u�I���v���N��
      �b�N���܂��B 

    �G���[���o��ꍇ�́u�����l�v���Q�Ƃ��A�ݒ��ύX���Ă��������B 

  �BJDBC�h���C�o�̔z�u
  
    Tomcat���f�[�^�x�[�X�ɐڑ��ł���悤��JDBC�h���C�o���u<TOMCAT_HOME>/lib�v
    �ɃR�s�[���܂��BJDBC�h���C�o�͕t������Ă��Ȃ��̂ŁA���p�Ҋe���łŕʓr
    ���肷��K�v������܂��B 
    �EPostgreSQL �c http://jdbc.postgresql.org/download.html
    �EOracle �c http://www.oracle.com/technology/software/tech/java/sqlj_jdbc/index.html
    
    ���o�[�W�����������Ă���΁A�N���C�A���g�����C���X�g�[�������ۂɕt�����Ă���
      JDBC�h���C�o�������p���������܂��B 

  �C�f�[�^�x�[�X���̐ݒ�
  
    1.�O�����(���ɂ��ύX�\)
        �f�[�^�x�[�X��(�C���X�^���X��)���teradb
        DB���[�U�[��/�p�X���[�h���sample/sample

    2.�usetup.bat�v�̕ҏW
        �u/sql/postgres/setup.bat�v�������́u/sql/oracle/setup.bat�v�����[���̊���
        �������l�ɏ��������܂��B�usetup.bat�v���Q�Ƃ��Ă��������B

    3.�e�[�u���A�T���v���f�[�^�̍쐬
      �u/sql/(��)/setup.bat�v�����s���܂��B(Eclipse������s�s��)
      �uSQL> �v���\�����ꂽ�� exit�Ɠ��͂��ďI�����Ă��������B
      �����s���p�X�̐��������Ƃ邽�߁A�K�����Y�t�@�C�������݂���f�B���N�g���Ŏ��s
        ���Ă��������B


  �D�ݒ�t�@�C���̕ҏW
  
    �E�ucontext.xml�v�̕ҏW
        �u/webapps/META-INF/context.xml�v�����[���̊��ɍ������l�ɏ��������܂��B
        �ڍׂ́ucontext.xml�v���Q�Ƃ��Ă��������B
        
    �E�usqlMapConfig.xml�v�̕ҏW
		PostgreSQL�𗘗p���邩�AOracle Database�𗘗p���邩�ŁA
		�u/webapps/WEB-INF/sqlMapConfig.xml�v�̃R�����g�A�E�g����؂�ւ��܂��B
		���ڍׂ́usqlMapConfig.xml�v���Q�Ƃ��Ă��������B
        
        

��  �v���W�F�N�g�̎��s�iWTP���j�F

    WTP�v���O�C���𗘗p����ꍇ�A�ȉ��̎菇�Ńv���W�F�N�g�����s���܂��B 

  �E�T�[�o�ւ̒ǉ�
    �E�T�[�o�[�r���[�Łutoursample-javaweb�v�̃v���W�F�N�g��ǉ����܂��B
    
  �FTomcat�̋N������сA���s�m�F
    1.�T�[�o���n�����܂��B
    2.http://localhost:8080/toursample-javaweb/�ɃA�N�Z�X���A
      ���j���[��ʂ��\�������΁A�f�v���C�����ł��B
  
  
  
��  �v���W�F�N�g�̎��s�i��WTP���j�F

  �EAnt�^�X�N�̎��s
  
    1.�v���W�F�N�g�́u/ant/build.properties�v�����[���̊��ɍ������l�ɏ�������
      �܂��B
      �E�ڍׂ�build.properties���Q�Ƃ��Ă��������B���Ƀp�X�֘A�Ɋւ��Ă͏\���m�F
        ���Ă��������B 
    2.�ubuild.properties�v�̏C����A�u/ant/build.xml�v���E�N���b�N��Ant�^�X�N��
      �udeploy�v��I�����Ď��s���܂��B 
      
  �FTomcat�̋N������сA���s
  
    1.�f�v���C���Tomcat���N�����܂��B 
    2.http://localhost:8080/<context.name>/�ɃA�N�Z�X���܂��B 
      �E�u<context.name>�v�́Abuild.properties���ɋL�q�����l�ł���A�f�t�H���g��
        toursample-javaweb�ƂȂ��Ă��܂��B      
    3.���j���[��ʂ��\�������΁A�f�v���C�����ł��B


���@����m�F
  
  �@�E����m�F���@
    �@���O�C������ꍇ�͂Q�̕��@������܂��B
   �@ ��ڂ͉���o�^�@�\�𗘗p���V�������O�C�����[�U���쐬���邱�Ƃł��B
    �@��ڂ͈ȉ��̃��O�C�����[�U���g�p���邱�Ƃł��B
    �@�S�Ẵ��O�C�����[�U�ɂ��Ă�
    �@���v���W�F�N�g�f�B���N�g����/sql/insert_customer.sql���Q�Ƃ��Ă��������B
    �@
    �@�E�\�񗚗������݂��郆�[�U
    �@�@�@���[�UID: 00000001
   �@�@ �@�p�X���[�h: password

  �@�@�E�������@
    �@�@�@�c�A�[������ʂɂČ�����������͂���K�v������܂����A�ȉ��̃c�A�[��񂪑���
    �@�@�@���Ă��܂��B
    �@�@�@�E�o���n�F�k�C��(����������Ԗ�)
    �@�@�@�E�ړI�n�F�k�C���A�X���A��茧�A�{�錧�A�H�c���A�R�`���A�������A��錧�A
              �@�@�@�Ȗ،��A�Q�n��(����������`�\�Ԗ�)
    �@�@�@�E�o�����FSQL�����s���̘Z���ォ����s���̈ꃖ����
        �@�@�@�@�@�@��)SQL�����s����5/10�̏ꍇ��2010/5/16�`2011/5/15�̃c�A�[���
       �@�@�@�@�@�@�@�@���݂��Ă��܂��B
          
-------------------------------------------------------------------------------
Copyright (C) 2007, 2010 NTT DATA Corporation.


