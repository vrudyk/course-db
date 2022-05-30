insert into OnlineShopes(Name,Link,`Phone number`)
values('Rozetka','http://rozetka.com.ua/','472971752');
insert into OnlineShopes(Name,Link,`Phone number`)
values('Allo','http://allo.ua/','153758224');
insert into OnlineShopes(Name,Link,`Phone number`)
values('Comfy','http://comfy.ua/','1575426523');
insert into OnlineShopes(Name,Link,`Phone number`)
values('MTA','http://mta.ua/','391085171');

insert into clients(`First name`,`Second name`,`E-mail`,NumberOfPhone,`OnlineShopes_id`)
values('Vitalii','Ariichuk','drakyla965@gmail.com','0994401152',1);
insert into clients(`First name`,`Second name`,`E-mail`,NumberOfPhone,`OnlineShopes_id`)
values('Petro','Invanov','petro19842@gmail.com','167357375',1);
insert into clients(`First name`,`Second name`,`E-mail`,NumberOfPhone,`OnlineShopes_id`)
values('Ivan','Petrov','ivpetr@gmail.com','537252516',2);
insert into clients(`First name`,`Second name`,`E-mail`,NumberOfPhone,`OnlineShopes_id`)
values('Alex','Zet','sashko39581@gmail.com','325265251',3);

insert into listofgoods(NameOfThing,Price,InStock,Warranty,`OnlineShopes_id`)
values('Playstation 5',25000,3,'2022-12-5',1);
insert into listofgoods(NameOfThing,Price,InStock,Warranty,`OnlineShopes_id`)
values('Playstation 5',22500,12,'2022-12-5',2);
insert into listofgoods(NameOfThing,Price,InStock,Warranty,`OnlineShopes_id`)
values('Xbox Series S',9700,160,'2022-6-5',1);
insert into listofgoods(NameOfThing,Price,InStock,Warranty,`OnlineShopes_id`)
values('Xbox Series S',10500,128,'2022-12-5',3);

insert into employees(`First Name`,`Second Name`,Position,`OnlineShopes_id`)
values('Renat','Havrilov','Manager',1);
insert into employees(`First Name`,`Second Name`,Position,`OnlineShopes_id`)
values('Markiz','Markizovich','Consultant',1);
insert into employees(`First Name`,`Second Name`,Position,`OnlineShopes_id`)
values('Oleg','Petrovich','Owner',1);

insert into suppliers(NameOfSuppliers,`OnlineShopes_id`)
values('Apple',1);
insert into suppliers(NameOfSuppliers,`OnlineShopes_id`)
values('Microsoft',1);
insert into suppliers(NameOfSuppliers,`OnlineShopes_id`)
values('Samsung',1);
insert into suppliers(NameOfSuppliers,`OnlineShopes_id`)
values('Xiaomi',2);
insert into suppliers(NameOfSuppliers,`OnlineShopes_id`)
values('Honor',2);
insert into suppliers(NameOfSuppliers,`OnlineShopes_id`)
values('Samsung',2);

insert into `credit cards`(CardNumber,CVV,ValidityPeriod,`Clients_id`)
values('4466746823456578','564','2024-11-1',1);
insert into `credit cards`(CardNumber,CVV,ValidityPeriod,`Clients_id`)
values('7678923245365455','642','2023-5-1',2);
insert into `credit cards`(CardNumber,CVV,ValidityPeriod,`Clients_id`)
values('5738285467854534','525','2022-1-1',3);
insert into `credit cards`(CardNumber,CVV,ValidityPeriod,`Clients_id`)
values('7665544332212334','853','2024-2-1',4);

select NameOfThing,COUNT(NameOfThing) as Count_name,
AVG(Price) as AVG_price
From listofgoods
group by NameOfThing
having AVG (price)>5000;

select *
from listofgoods
group by NameOfThing
order by price asc;

SET SQL_SAFE_UPDATES=0;

update onlineshopes
set `Phone number`='00000' where name='Rozetka';

delete from listofgoods
where price>20000;

SET SQL_SAFE_UPDATES=1;

select *
from listofgoods;

select *
from clients left join `credit cards`
on clients.id = `credit cards`.`Clients_id`;
select *
from clients right join `credit cards`
on clients.id = `credit cards`.`Clients_id`;
select *
from clients inner join `credit cards`
on clients.id = `credit cards`.`Clients_id`;

