use petrushkoPhotoStudio;
INSERT INTO clients (fName, lName, phone) 
VALUES ('Nastya', 'Kovalenko', '380959223876');

INSERT INTO clients (fName, lName, phone) 
 VALUES ('Masha', 'Petrenko', '380508392345'); 

 INSERT INTO clients (fName, lName, phone) 
 VALUES ('Ivan', 'Popov', '380951239876');

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
 values ('2021-10-02', 1, 700, 4, 1, 1, 1, 1);
 