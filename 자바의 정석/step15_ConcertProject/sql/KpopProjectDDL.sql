--콘서트 정보

CREATE TABLE scott.concert_info (
                                    concert_id    VARCHAR2(20 BYTE) NOT NULL,
                                    concert_name  VARCHAR2(20 BYTE) NOT NULL,
                                    concert_date  DATE NOT NULL,
                                    concert_hall  VARCHAR2(20 BYTE) NOT NULL,
                                    concert_price NUMBER NOT NULL
);

ALTER TABLE scott.concert_info
    ADD CONSTRAINT concert_info_pk PRIMARY KEY ( concert_id );

===============================
-- 예매자 정보

CREATE TABLE scott.user_info (
                                 user_id      VARCHAR2(20 BYTE) NOT NULL,
                                 user_name    VARCHAR2(20 BYTE) NOT NULL,
                                 user_age     NUMBER NOT NULL,
                                 user_gender  VARCHAR2(1 BYTE) NOT NULL,
                                 user_address VARCHAR2(20 BYTE) NOT NULL
);

ALTER TABLE scott.user_info
    ADD CONSTRAINT user_info_pk PRIMARY KEY ( user_id );

===============================
-- 예매 정보

CREATE TABLE scott.resrv_info (
                                  ticket_no  NUMBER NOT NULL,
                                  concert_id VARCHAR2(20 BYTE),
                                  user_id    VARCHAR2(20 BYTE),
                                  resrv_date DATE NOT NULL,
                                  resrv_seat VARCHAR2(20 BYTE) NOT NULL
);

ALTER TABLE scott.resrv_info
    ADD CONSTRAINT resrv_info_pk PRIMARY KEY ( ticket_no );

ALTER TABLE scott.resrv_info
    ADD CONSTRAINT resrv_info_concert_info_fk FOREIGN KEY ( concert_id )
        REFERENCES scott.concert_info ( concert_id );

ALTER TABLE scott.resrv_info
    ADD CONSTRAINT resrv_info_user_info_fk FOREIGN KEY ( user_id )
        REFERENCES scott.user_info ( user_id );


