USE bloshkoarmy;
INSERT INTO ammunition (idAmmunition, nameAmmunition, quantityWeapon, weaponIdweapon)
VALUES (101, 'bullet', 20, 9),
(102, 'grenade', 5, 11),
(103, 'rocket', 1, 12),
(104, 'torpedo', 1, 13),
(105, 'bomb', 25, 14),
(106, 'shotshell', 12, 15),  
(107, 'arrow', 1, 16);

INSERT INTO army (idArmy, nameArmy, classArmy, quantityArmy, militaryBaseidArmybase)
VALUES (1, 'land', 'land-air', 10, 17),
(2, 'avia', 'navy-air', 7, 18),
(3, 'navy', 'under-navy', 9, 19),
(4, 'special', 'land', 15, 20),
(5, 'civil', 'uny-class', 5, 21);

INSERT INTO aviaweapon (idAviaweapon, name, quantity)
VALUES (1, 'aviabomb', 10),
(2, 'rocket', 7),
(3, 'aircraft', 9),
(4, 'shotgun', 5),
(5, 'mina', 7);

INSERT INTO landweapon (idLandweapon, nameLandweapon, quantityLandweapon, weaponIdland)
VALUES (1, 'automat', 8, 22),
(2, 'gun', 12, 23),
(3, 'knife', 16, 24),
(4, 'granade gun', 7, 25),
(5, 'PRK', 11, 26);

INSERT INTO militarybase (idArmybase, nameBase, number, localAddress)
VALUES (1, 'Kyiv', 17, 'Obolon region, st.Golovna 10'),
(2, 'Odessa', 18, 'Port region, st.Derubasivska 4'),
(3, 'Mykolaiv', 19, 'Elevator region, st.Centralna 22'),
(4, 'Chernivtsi', 20, 'Chernivtsi region, st.Kushunivska 18'),
(5, 'Dnipro', 21, 'Dnipro region, st. Privokzalna 5');

INSERT INTO militaryequipment (idMilitaryequipment, nameEquipment, quantityEquipment, classEquipment, armyIdarmy)
VALUES (1, 'helicopter', 10, 'air', 26),
(2, 'airplane', 20, 'air', 27),
(3, 'ship', 12, 'navy', 28),
(4, 'submarine', 17, 'navy', 29),
(5, 'tank', 20, 'land', 30),
(6, 'btr', 12, 'land', 31);

INSERT INTO navyweapon (idNavyweapon, nameNavyweapon, quantityNavyweapon, weaponIdnavy)
VALUES (1, 'waterbomb', 14, 32),
(2, 'underwater torpeda', 10, 33),
(3, 'underwater mine', 16, 34),
(4, 'raket', 7, 35);

INSERT INTO officership (idOfficership, firstName, lastName, age, rankk, gender, miltaryBaseid)
VALUES (1, 'Ivan', 'Ivanov', 36, 'captain', 'male', 36),
(2, 'Petro', 'Petrov', 48, 'major', 'male', 37),
(3, 'Aleksandr', 'Shmatko', 52, 'lieutenant', 'male', 38),
(4, 'Oksana', 'Flower', 44, 'colonel', 'female', 39),
(5, 'David', 'Kasparov', 47, 'senior lieutenant', 'male', 40),
(6, 'Paul', 'Brown', 39, 'sergeant', 'male', 41);

INSERT INTO soldiers (idSoldiers, firstName, lastName, age, rankk, gender, officerShipId)
VALUES (1, 'Keith', 'Flint', 18, 'soldier', 'male', 42),
(2, 'Liam', 'Thornill', 17, 'soldier', 'male', 43),
(3, 'Antonio', 'Banderas', 18, 'senior soldier', 'male', 44),
(4, 'John', 'Red', 17, 'soldier', 'male', 45),
(5, 'Tony', 'Stark', 18, 'senior soldier', 'male', 46),
(6, 'Klaus', 'Main', 17, 'soldier', 'male', 47);

INSERT INTO weapon (idWeapon, name, class)
VALUES (1, 'firearm', 'longcombat'),
(2, 'cold weapon', 'nearcombat'),
(3, 'metal aweapon', 'nearcombat'),
(4, 'pneumatic weapon', 'longcombat'),
(5, 'rocket weapon', 'longcombat');

INSERT INTO weaponhasarmy (weaponIdweapon, armyIdarmy, weaponHasarmy)
VALUES (1, 1, 0),
(2, 2, 1),
(3, 3, 2),
(4, 4, 3),
(5, 5, 4);

