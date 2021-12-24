CREATE DATABASE polyclinic;
USE polyclinic;
CREATE TABLE doctors
(
id INT PRIMARY KEY auto_increment,
firstName VARCHAR (20) NOT NULL, 
lastName VARCHAR (20) NOT NULL,
category VARCHAR (45) NOT NULL
);

CREATE TABLE cases
(
id INT PRIMARY KEY auto_increment,
firstName VARCHAR (20) NOT NULL,
lastName VARCHAR (20) NOT NULL,
age VARCHAR (3) NOT NULL,
diagnosis VARCHAR (45) NOT NULL,
doctorsId INT,
foreign key (doctorsId) References doctors (id)
);

INSERT INTO doctors (firstName, lastName, category) 
VALUES ('Petrenko', 'Ivan', 'surgery');

INSERT INTO doctors (firstName, lastName, category)
VALUES ('Ivanov', 'Ostap', 'pediatrician');

SELECT *
FROM doctors;

INSERT INTO cases ( firstName, lastName, age, diagnosis )
VALUES ('Stepanopva', 'Lida', '89', 'broken arm');

INSERT INTO cases ( firstName, lastName, age, diagnosis )
VALUES ('Kotova', 'Angela', '7', 'angina');

INSERT INTO cases ( firstName, lastName, age, diagnosis )
VALUES ('Vilenko', 'Igor', '5', 'gastritis' );

SELECT *
FROM cases;

CREATE table rooms (
id INT PRIMARY KEY auto_increment,
numberOfRoom VARCHAR(20));

DROP table rooms;







