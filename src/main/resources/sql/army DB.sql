USE bloshkoarmy;
INSERT INTO weapon (idWeapon, name, classs)
VALUES (1, 'firearm', 'longcombat'),
(2, 'cold weapon', 'nearcombat'),
(3, 'metal aweapon', 'nearcombat'),
(4, 'pneumatic weapon', 'longcombat'),
(5, 'rocket weapon', 'longcombat');

INSERT INTO ammunition (idAmmunition, nameAmmunition, quantityWeapon, weaponIdweapon)
VALUES (101, 'bullet', 20, 1),
(102, 'grenade', 5, 2),
(103, 'rocket', 1, 3),
(104, 'torpedo', 45, 3),
(105, 'bomb', 25, 2),
(106, 'shotshell', 12, 4);

INSERT INTO army (idArmy, nameArmy, classArmy, quantityArmy, militaryBaseidArmybase)
VALUES (1, 'land', 'land-air', 10, 1),
(2, 'avia', 'navy-air', 7, 2),
(3, 'navy', 'under-navy', 9, 3),
(4, 'special', 'land', 15, 4),
(5, 'civil', 'uny-class', 5, 5);

INSERT INTO aviaweapon (idAviaweapon, name, quantity, weaponIdavia)
VALUES (1, 'aviabomb', 10, 1),
(2, 'rocket', 7, 2),
(3, 'aircraft', 9, 3),
(4, 'shotgun', 5, 4),
(5, 'mina', 7, 5);

INSERT INTO landweapon (idLandweapon, nameLandweapon, quantityLandweapon, weaponIdland)
VALUES (1, 'automat', 8, 1),
(2, 'gun', 12, 2),
(3, 'knife', 16, 3),
(4, 'granade gun', 7, 4),
(5, 'PRK', 11, 5);

INSERT INTO militarybase (idArmybase, nameBase, number, localAddress)
VALUES (1, 'Kyiv', 17, 'Obolon region, st.Golovna 10'),
(2, 'Odessa', 18, 'Port region, st.Derubasivska 4'),
(3, 'Mykolaiv', 19, 'Elevator region, st.Centralna 22'),
(4, 'Chernivtsi', 20, 'Chernivtsi region, st.Kushunivska 18'),
(5, 'Dnipro', 21, 'Dnipro region, st. Privokzalna 5');

INSERT INTO militaryequipment (idMilitaryequipment, nameEquipment, quantityEquipment, classEquipment, armyIdarmy)
VALUES (1, 'helicopter', 10, 'air', 1),
(2, 'airplane', 20, 'air', 2),
(3, 'ship', 12, 'navy', 3),
(4, 'submarine', 17, 'navy', 4),
(5, 'tank', 20, 'land', 5);

INSERT INTO navyweapon (idNavyweapon, nameNavyweapon, quantityNavyweapon, weaponIdnavy)
VALUES (1, 'waterbomb', 14, 1),
(2, 'underwater torpeda', 10, 2),
(3, 'underwater mine', 16, 3),
(4, 'raket', 7, 4);

INSERT INTO officership (idOfficership, firstName, lastName, age, rankk, gender, militaryBaseid)
VALUES (1, 'Ivan', 'Ivanov', 36, 'captain', 'male', 1),
(2, 'Petro', 'Petrov', 48, 'major', 'male', 2),
(3, 'Aleksandr', 'Shmatko', 52, 'lieutenant', 'male', 3),
(4, 'Oksana', 'Flower', 44, 'colonel', 'female', 3),
(5, 'David', 'Kasparov', 47, 'senior lieutenant', 'male', 4),
(6, 'Paul', 'Brown', 39, 'sergeant', 'male', 1);

INSERT INTO soldiers (idSoldiers, firstName, lastName, age, rankk, gender, officerShipId)
VALUES (1, 'Keith', 'Flint', 18, 'soldier', 'male', 2),
(2, 'Liam', 'Thornill', 17, 'soldier', 'male', 2),
(3, 'Antonio', 'Banderas', 18, 'senior soldier', 'male', 4),
(4, 'John', 'Red', 17, 'soldier', 'male', 5),
(5, 'Tony', 'Stark', 18, 'senior soldier', 'male', 6),
(6, 'Klaus', 'Main', 17, 'soldier', 'male', 1);

INSERT INTO weapon (idWeapon, name, class)
VALUES (1, 'firearm', 'longcombat'),
(2, 'cold weapon', 'nearcombat'),
(3, 'metal aweapon', 'nearcombat'),
(4, 'pneumatic weapon', 'longcombat'),
(5, 'rocket weapon', 'longcombat');

INSERT INTO weaponhasarmy (weaponIdweapon, armyIdarmy, weaponHasarmy)
VALUES (1, 1, 1),
(2, 2, 1),
(3, 3, 2),
(4, 4, 3),
(5, 5, 4);

