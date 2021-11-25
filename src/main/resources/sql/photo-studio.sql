use petrushkoPhotoStudio;
INSERT INTO clients (fName, lName, phone) 
VALUES ('Nastya', 'Kovalenko', '380959223876');

INSERT INTO clients (fName, lName, phone) 
 VALUES ('Masha', 'Petrenko', '380508392345'); 

 INSERT INTO clients (fName, lName, phone) 
 VALUES ('Ivan', 'Popov', '380951239876');
 
 INSERT INTO clients (fName, lName, phone) 
 VALUES ('Emma', 'Dokal', '380681149566');
 
 INSERT INTO clients (fName, lName, phone) 
 VALUES ('Pavlo', 'Dokal', '380681223500');
 
 SELECT *
 FROM clients;

 INSERT INTO positions (name) 
 VALUES ('photographer');

 INSERT INTO positions (name) 
 VALUES ('videographer');

 INSERT INTO positions (name) 
 VALUES ('administrator');
 
 INSERT INTO positions (name) 
 VALUES ('manager');

 SELECT *
 FROM positions;

 INSERT INTO passport (seria, code) 
 VALUES ('KT', '120768');

 INSERT INTO passport (seria, code) 
 VALUES ('KT', '132239');

 INSERT INTO passport (seria, code) 
 VALUES ('KT', '110209');

 INSERT INTO passport (seria, code) 
 VALUES ('KT', '190223');

 SELECT *
 FROM passport;

 INSERT INTO employeesInfo (birthDate, address, phone) 
 VALUES ('1992-07-12', '17 Golovna St', '380951230900');

 INSERT INTO employeesInfo (birthDate, address, phone) 
 VALUES ('1995-01-11', '23 Kobula St', '380959234001');

 INSERT INTO employeesInfo (birthDate, address, phone) 
 VALUES ('1998-12-01', '286 Golovna St', '380503409281');

 INSERT INTO employeesInfo (birthDate, address, phone) 
 
 VALUES ('1997-03-28', '1 Soborna St', '380951001564');

 SELECT *
 FROM employeesInfo;
 
 INSERT INTO employees (fName, lName, salary, positions_id, passport_id, employeesInfo_id) 
 VALUES ('Ivan', 'Makarenkov', '27000',1, 1, 1);

 INSERT INTO employees (fName, lName, salary, positions_id, passport_id, employeesInfo_id) 
 VALUES ('Bohdan', 'Voyevoda', '28000', 2, 2, 2);

 INSERT INTO employees (fName, lName, salary, positions_id, passport_id, employeesInfo_id) 
 VALUES ('Misha', 'Ohotov', '24000', 3, 3, 3);

 INSERT INTO employees (fName, lName, salary, positions_id, passport_id, employeesInfo_id) 
 VALUES ('Kostya', 'Ivanov', '30000', 4, 4, 4);

 SELECT *
 FROM employees;

 INSERT INTO location (name) 
 VALUES ('inTheStudio');

 INSERT INTO location (name) 
 VALUES ('inTheCity');

 INSERT INTO location (name) 
 VALUES ('outsideTheCity');

 SELECT *
 FROM location;

 INSERT INTO equipment (name, amortization)
 VALUES ('canonEos', '20');

 INSERT INTO equipment (name, amortization)
 VALUES ('SonyHdr', '50');
 
 INSERT INTO equipment (name, amortization)
 VALUES ('lightGodox', '0');

 INSERT INTO equipment (name, amortization)
 VALUES ('reflectorsGodox', '0');

 SELECT *
 FROM equipment;
 
 insert into productsDetails (description)
 values ('photoAndMakeUp');
 
 insert into productsDetails (description)
 values ('videoAndMakeUp');
 
 select *
 from productsDetails;
 
 insert into products (name, productsDetails_id)
 values ('photosession', 1);
 
 insert into products (name, productsDetails_id)
 values ('video', 2);
 
 select *
 from products;
 
 insert into orders (orderDate, quantity, price, equipment_id, clients_id, location_id, employees_id, products_id)
 values ('2021-10-02', 1, 700, 1, 1, 1, 1, 1);
 
 insert into orders (orderDate, quantity, price, equipment_id, clients_id, location_id, employees_id, products_id)
 values ('2021-10-07', 1, 1500, 2, 2, 3, 2, 2);
 
 insert into orders (orderDate, quantity, price, equipment_id, clients_id, location_id, employees_id, products_id)
 values ('2021-10-17', 1, 750, 1, 3, 2, 1, 1);
  
 select *
 from orders;
 
 update employees
 set salary = salary + 300
 where id > 0;
 select *
 from employees;
 
 update productsDetails
 set description = 'photoAndMakeUpAndDress'
 where id > 0 AND description = 'photoAndMakeUp';
 select *
 from productsDetails;
 
 update clients
 set fName = 'Anastasia'
 where id > 0 AND fName = 'Nastya';
 select *
 from clients;
 
 update orders
 set orderDate = '2021-10-01'
 where id > 0 AND orderDate = '2021-10-02';
 select *
 from orders;
 
 delete from clients
 where fName = 'Ivan' AND id > 0;
 select *
 from clients;
 
 delete from equipment
 where amortization = '100' AND id > 0;
 select *
 from equipment;

 delete from clients
 where phone = '380681149566' AND id > 0;
 select *
 from clients;
 
 select *
 from orders
 where id = 6;
 
 select id, name
 from equipment 
 where amortization = '50';
 
 select avg(price) as averagePrice
 from orders
 group by orderDate;
 
 select sum(salary) 
 from employees
 group by lName;
 
 select distinct lName
 from clients
 group by lName;
 
 select orderDate, max(price)
 from orders
 group by orderDate
 having max(price) = 750;
 

 select sum(salary) 
 from employees
 group by lName
 having sum(salary) > 109800;
 
 select *
 from orders
 having orderDate = '2021-10-17';
 
 select c.lName, o.price
 from clients c
 left outer join orders o
 on o.clients_id = c.id;
 
 select l.name, o.price
 from location l 
 left outer join orders o
 on o.location_id = l.id;
 
 select eq.name, o.orderDate
 from equipment eq
 left outer join orders o
 on o.equipment_id = eq.id;
 
 select o.orderDate, c.lName
 from orders o
 right outer join clients c
 on o.clients_id = c.id;
 
 select p.name, e.lName
 from positions p
 right outer join employees e
 on e.positions_id = p.id;
 
 select p.name, e.salary
 from positions p
 right outer join employees e
 on e.positions_id = p.id;
 
 select c.lName, o.price
 from clients c
 inner join orders o
 on c.id = o.clients_id;
 
 select p.name, o.quantity
 from products p
 inner join orders o
 on p.id = o.products_id;
 
 select p.code, e.lName
 from passport p 
 inner join employees e
 on e.passport_id = p.id;
 
  
 

 
 
 
 
 
 