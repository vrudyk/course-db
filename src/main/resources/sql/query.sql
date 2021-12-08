USE `motovylets-bank`;

INSERT INTO bank  VALUE (1, 'Prinat');
INSERT INTO bank  VALUE (2, 'Oschadbank');
INSERT INTO bank  VALUE (3, 'MonoBank');

INSERT INTO atm  VALUE (1, 10000 , 1);
INSERT INTO atm  VALUE (2, 5000 , 1);
INSERT INTO atm  VALUE (3, 7000 , 2);

insert into salary value (1 , 16000);
insert into salary value (2 , 20000);

INSERT INTO passport VALUE (123456, 2123456, 7323, '','M', 12/12/1996);
INSERT INTO passport VALUE (123457, 2123457, 1823, '','M', 12/12/2001);
INSERT INTO passport VALUE (123458, 2123458, 1122, '','M', 12/12/1990);

INSERT INTO passport VALUE (223456, 3123456, 7322, '','M', 12/12/1995);
INSERT INTO passport VALUE (223457, 3123457, 1823, '','W', 12/12/2000);
INSERT INTO passport VALUE (223458, 3123458, 1122, '','M', 12/12/1992);

INSERT INTO client VALUE (1, 'Vasia', 25, 123456, 2123456);
insert into client value (2, 'Arra', 20, 123457, 2123457);
insert into client value (3, 'Roman', 31, 123458, 2123458);

insert into departmens value (1, 1, 'accounting');
insert into departmens value (2, 2, 'Legal Department');
insert into departmens value (3, 3, 'accounting');

insert into `employee position` value (1, 'accounter');
insert into `employee position` value (2, 'lawyer');
insert into `employee position` value (3, 'accounter');

insert into employee value (1, 'Mischa', 26, 1, 1, 1, 223456, 3123456);
insert into employee value (2, 'Katia', 21, 2, 2, 2, 223457, 3123457 );
insert into employee value (3, 'Oleg', 29, 1, 1, 1, 223458, 3123458 );

update Client
set Name = 'Andrii'
where (idClient = 2);

update salary
set Salary = 18000
where(idSalary = 1);

update bank
set Name = 'Privatbank'
where idBank = 1;

delete FROM `employee position` 
where idEmployee = 3;

delete FROM `motovylets-bank`.client
where idClient = '2';

SELECT bank.Name, atm.`Amount of money`
FROM bank
LEFT JOIN atm
ON bank.idBank = atm.Bank_idBank
ORDER BY atm.`Amount of money`;

SELECT bank.Name, atm.`Amount of money`
FROM bank
RIGHT JOIN atm
ON bank.idBank = atm.Bank_idBank;

SELECT bank.Name, atm.`Amount of money`
FROM bank
RIGHT JOIN atm
ON bank.idBank = atm.Bank_idBank
HAVING atm.`Amount of money` > 5000;

SELECT employee.Name, departmens.`Name Departmen`, departmens.Bank_idBank
FROM employee
inner JOIN departmens
ON employee.Departmens_idDepartmens = departmens.idDepartmens;

SELECT bank.Name, atm.`Amount of money`
FROM bank
INNER JOIN atm
ON bank.idBank = atm.Bank_idBank;

SELECT bank.Name, atm.`Amount of money`
FROM bank
INNER JOIN atm
ON bank.idBank = atm.Bank_idBank
GROUP by Bank.Name;
