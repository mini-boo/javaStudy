-- 테스트 데이터

INSERT INTO concert_info VALUES ('concert1','aespa','2022-01-01','hall1',131000);
INSERT INTO concert_info VALUES ('concert2','ive','2023-01-01','hall2',132000);

INSERT INTO user_info VALUES ('user1','winter',22,'M','Seoul');
INSERT INTO user_info VALUES ('user2','liz',20,'W','Busan');

INSERT INTO resrv_info VALUES (1001,'concert1','user1','2022-01-01','S1');
INSERT INTO resrv_info VALUES (2002,'concert2','user2','2023-01-01','S2');

SELECT * FROM concert_info;
SELECT * FROM resrv_info;
SELECT * FROM user_info;

COMMIT;