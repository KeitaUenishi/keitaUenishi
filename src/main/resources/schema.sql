--DDL
--usersテーブルが存在しなければ作成
CREATE TABLE IF NOT EXISTS test.users(
	id serial PRIMARY KEY ,
 	user VARCHAR(30) ,
 	email VARCHAR(50),
 	address VARCHAR(255) ,
 	sex VARCHAR(1) ,
 	remark VARCHAR(255)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;