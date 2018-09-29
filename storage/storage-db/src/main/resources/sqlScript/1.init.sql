CREATE DATABASE IF NOT EXISTS framework;

USE framework;

CREATE USER IF NOT EXISTS framework_write
  IDENTIFIED BY 'framework_write';

# 查看用户权限
SHOW GRANTS FOR 'framework_write'@'%';

GRANT ALL PRIVILEGES ON framework.* TO 'framework_write'@'%';

GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';

FLUSH PRIVILEGES;

# 在MySQL 5.7中，支持两种Generated Column，即Virtual Generated Column和Stored Generated Column，
# 前者只将Generated Column保存在数据字典中（表的元数据），
# 并不会将这一列数据持久化到磁盘上；后者会将Generated Column持久化到磁盘上
# ，而不是每次读取的时候计算所得。很明显，后者存放了可以通过已有数据计算而得的数据，
# 需要更多的磁盘空间，与Virtual Column相比并没有优势，因此，MySQL 5.7中，
# 不指定Generated Column的类型，默认是Virtual Column。此外：
#
# Stored Generated Column性能较差，见这里
#
# 如果需要Stored Generated Golumn的话，可能在Generated Column上建立索引更加合适，
# 综上，一般情况下，都使用Virtual Generated Column，这也是MySQL默认的方式，
# 如果使用Stored Generated Column，前面的建表语句将会是下面这样，即多了一个stored关键字：

CREATE TABLE IF NOT EXISTS framework.test (
  id         INT AUTO_INCREMENT NOT NULL PRIMARY KEY
  COMMENT '主键id',
  NAME       VARCHAR(10)        NOT NULL
  COMMENT 'test-name ',
  age        INTEGER(3)         NOT NULL
  COMMENT 'test age',
  money      INTEGER(5)         NULL
  COMMENT '钱', # https://www.cnblogs.com/lixigang/articles/5082589.html 关于5.7特性,动态生成列的介绍
  genMoney   INTEGER(8) AS (age * money) #     INTEGER(8) AS (sqrt(age * money))
  COMMENT '虚拟动态生成列,钱*age ',
  genMoney2  INTEGER(8) GENERATED ALWAYS AS (age * money * 2) STORED

  COMMENT '虚拟动态生成持久列,钱*age*2 ',

  createTime DATETIME   DEFAULT now()
  COMMENT '创建日期'
);

INSERT INTO framework.test (NAME, age, money)
VALUES (
  'hanxu',
  22,
  1000), (
  'hx940929',
  23,
  2000);



