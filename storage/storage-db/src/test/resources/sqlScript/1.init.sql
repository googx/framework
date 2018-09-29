SELECT
  now();

CREATE DATABASE apiTester;

USE apiTester;

CREATE USER apitest_write
  IDENTIFIED BY 'apitest_write';

SELECT
  mysql.user.Host
  ,
  mysql.user.User
  ,
  mysql.user.authentication_string
FROM
  mysql.user
WHERE mysql.user.User = 'apitest_write';

# 查看用户权限
SHOW GRANTS FOR 'apitest_write'@'%';

GRANT ALL PRIVILEGES ON apiTester.* TO 'apitest_write'@'%';

FLUSH PRIVILEGES;

CREATE TABLE apiTester.test1 (
  tid   INT AUTO_INCREMENT NOT NULL PRIMARY KEY
  COMMENT '主键id',
  tname VARCHAR(10)        NOT NULL
  COMMENT 'test 字段'
);


SELECT
  *
FROM
  test1


