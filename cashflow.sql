CREATE DATABASE IF NOT EXISTS cashflow;
 
USE cashflow;
 
DROP TABLE IF EXISTS income;
DROP TABLE IF EXISTS expense;
 
CREATE TABLE income (
  id int(11) NOT NULL AUTO_INCREMENT,
  description varchar(128) NOT NULL,
  amount DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE expense (
  id int(11) NOT NULL AUTO_INCREMENT,
  description varchar(128) NOT NULL,
  amount DECIMAL(6,2) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO income (description, amount) values ('salary', 1000);  
INSERT INTO expense (description, amount) values ('rent', 400); 