USE db3;

CREATE TABLE classes
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(20)
);

CREATE TABLE student
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(20),
    age  INT,
    cid  INT,
    CONSTRAINT sc_fk1 FOREIGN KEY (cid) REFERENCES classes (id)
);

INSERT INTO classes
VALUES (NULL, '高三一班'),
       (NULL, '高三二班');

INSERT INTO student
VALUES (NULL, '张三', 23, 1),
       (NULL, '李四', 24, 1),
       (NULL, '王五', 25, 2),
       (NULL, '赵六', 26, 2);