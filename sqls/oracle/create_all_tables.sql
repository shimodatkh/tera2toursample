/** 出発地テーブル **/
CREATE TABLE DEPARTURE (
    DEP_CODE        CHAR(2)         NOT NULL,
    DEP_NAME        VARCHAR2(20)    NOT NULL,
    CONSTRAINT TOUR_PK3 PRIMARY KEY(DEP_CODE)
)
;

/** 目的地テーブル **/
CREATE TABLE ARRIVAL (
    ARR_CODE        CHAR(2)         NOT NULL,
    ARR_NAME        VARCHAR2(20)    NOT NULL,
    CONSTRAINT TOUR_PK4 PRIMARY KEY(ARR_CODE)
)
;

/** 宿泊施設テーブル **/
CREATE TABLE ACCOMMODATION (
    ACCOM_CODE      CHAR(4)         NOT NULL,
    ACCOM_NAME      VARCHAR2(100)   NOT NULL,
    ACCOM_TEL       VARCHAR2(13)    NOT NULL,
    CONSTRAINT TOUR_PK5 PRIMARY KEY(ACCOM_CODE)
)
;

/** 年令区分テーブル **/
CREATE TABLE AGE (
    AGE_CODE        CHAR(1)         NOT NULL,
    AGE_NAME        VARCHAR2(10)    NOT NULL,
    AGE_RATE        NUMBER(3,0)     NOT NULL,
    CONSTRAINT TOUR_PK9 PRIMARY KEY(AGE_CODE)
)
;

/** 社員テーブル **/
CREATE TABLE EMPLOYEE (
    STAFF_CODE      CHAR(8)         NOT NULL,
    STAFF_NAME      VARCHAR2(100)   NOT NULL,
    STAFF_KANA      VARCHAR2(100)   NOT NULL,
    STAFF_PASS      VARCHAR2(20)    NOT NULL,
    CONSTRAINT TOUR_PK6 PRIMARY KEY(STAFF_CODE)
)
;

/** 顧客テーブル **/
CREATE TABLE CUSTOMER (
    CUSTOMER_CODE   CHAR(8)         NOT NULL,
    CUSTOMER_NAME   VARCHAR2(100)   NOT NULL,
    CUSTOMER_KANA   VARCHAR2(100)   NOT NULL,
    CUSTOMER_PASS   VARCHAR2(20)    NOT NULL,
    CUSTOMER_BIRTH  DATE            NOT NULL,
    CUSTOMER_JOB    VARCHAR2(100)   NOT NULL,
    CUSTOMER_MAIL   VARCHAR2(300)   NULL,
    CUSTOMER_TEL    VARCHAR2(13)    NOT NULL,
    CUSTOMER_POST   VARCHAR2(8)     NOT NULL,
    CUSTOMER_ADD    VARCHAR2(300)   NOT NULL,
    CONSTRAINT TOUR_PK8 PRIMARY KEY(CUSTOMER_CODE)
)
;

/** ツアーテーブル **/
CREATE TABLE TOURINFO (
    TOUR_CODE       CHAR(10)         NOT NULL,
    PLANNED_DAY     DATE            NOT NULL,
    PLAN_NO         CHAR(4)         NOT NULL,
    TOUR_NAME       VARCHAR2(300)   NOT NULL,
    TOUR_DAYS       NUMBER(2,0)     NOT NULL,
    DEP_DAY         DATE            NOT NULL,
    AVA_REC_MAX     NUMBER(10,0)     NOT NULL,
    DEP_CODE        CHAR(2)         NOT NULL,
    ARR_CODE        CHAR(2)         NOT NULL,
    ACCOM_CODE      CHAR(4)         NOT NULL,
    BASE_PRICE      NUMBER(7,0)     NOT NULL,
    CONDUCTOR       CHAR(1)         DEFAULT '0' NOT NULL,
    TOUR_ABS        VARCHAR2(4000)  NULL,
    CONSTRAINT TOUR_PK1 PRIMARY KEY(TOUR_CODE),
       FOREIGN KEY (DEP_CODE) REFERENCES DEPARTURE,
       FOREIGN KEY (ARR_CODE) REFERENCES ARRIVAL,
       FOREIGN KEY (ACCOM_CODE) REFERENCES ACCOMMODATION
)
;

/** ツアー担当者テーブル **/
CREATE TABLE TOURCON (
    TOUR_CODE       CHAR(10)         NOT NULL,
    TOUR_CON_CODE   CHAR(10)         NOT NULL,
    TOUR_CON_NAME   VARCHAR2(100)   NOT NULL,
    TOUR_CON_MAIL   VARCHAR2(300)   NOT NULL,
    CONSTRAINT TOUR_PK2 PRIMARY KEY(TOUR_CODE,TOUR_CON_CODE),
       FOREIGN KEY (TOUR_CODE) REFERENCES TOURINFO
)
;

/** 予約テーブル **/
CREATE TABLE RESERVE (
    RESERVE_NO      CHAR(8)         NOT NULL,
    TOUR_CODE       CHAR(10)         NOT NULL,
    RESERVED_DAY    DATE            NOT NULL,
    ADULT_COUNT     NUMBER(2,0)     NOT NULL,
    CHILD_COUNT     NUMBER(2,0)     NOT NULL,
    CUSTOMER_CODE   CHAR(8)         NOT NULL,
    TRANSFER        CHAR(1)         DEFAULT '0' NOT NULL,
    SUM_PRICE       NUMBER(7,0)     NOT NULL,
    REMARKS         VARCHAR2(1000)  NULL,
    CONSTRAINT TOUR_PK7 PRIMARY KEY(RESERVE_NO),
       FOREIGN KEY (TOUR_CODE) REFERENCES TOURINFO,
       FOREIGN KEY (CUSTOMER_CODE) REFERENCES CUSTOMER
)
;

COMMIT;

