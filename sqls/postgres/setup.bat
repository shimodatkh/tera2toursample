rem �g�p����DB���[�U�A�p�X���[�h�A�ڑ��������ύX����ꍇ�́A
rem ���L�L�q�������Q�l�ɂ��Ă��������B
rem �y�L�q�����z
rem createlang -U <�g�p����DB���[�U> plpgsql <�g�p����DB>
rem psql -h <DB�T�[�oIP> -U <�g�p����DB���[�U> -d <�g�p����DB> -f setup.sql


set path=C:\Program Files\PostgreSQL\8.4\bin\;%path%
createlang -U sample plpgsql teradb
psql -h 127.0.0.1 -U sample -d teradb -f setup.sql

pause
