DROP DATABASE IF EXISTS final_exam_04;
CREATE DATABASE final_exam_04;
USE final_exam_04;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
    id          INT PRIMARY KEY AUTO_INCREMENT  NOT NULL,
    full_name   VARCHAR(50)                     NOT NULL,
    email       VARCHAR(50) UNIQUE KEY          NOT NULL,
    password    VARCHAR(50)                     NOT NULL DEFAULT '123456Q',
    role        ENUM('EMPLOYEE', 'MANAGER')     NOT NULL DEFAULT 'EMPLOYEE',
    pro_skill   VARCHAR(50),
    exp_in_year INT,
    project_id  INT
);

INSERT INTO users (full_name        , email              , password  , role		 , pro_skill, exp_in_year, project_id)
VALUES            ('Nguyễn Văn Khoa', 'khoa.nv@gmail.com', '123456Q' , 'EMPLOYEE', 'Java'   , NULL       , 1         ),
				  ('Nguyễn Ngọc Duy', 'duy.nn@gmail.com' , '123456Q' , 'MANAGER' , NULL     , 10         , 1         );