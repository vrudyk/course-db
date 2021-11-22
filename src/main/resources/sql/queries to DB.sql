USE bloshkoarmy;

SELECT * FROM bloshkoarmy.militarybase;

SELECT * FROM bloshkoarmy.militarybase
WHERE idArmyBase=5;

UPDATE bloshkoarmy.militarybase
SET nameBase ='Rivne'
WHERE idArmyBase = 1;

SELECT militarybase.nameBase, officership.firstName, officership.lastName
FROM bloshkoarmy.militarybase
LEFT OUTER JOIN bloshkoarmy.officership
ON militarybase.idArmyBase = officership.militaryBaseid;


SELECT militarybase.localAddress, officership.firstName, officership.lastName
FROM bloshkoarmy.militarybase
RIGHT OUTER JOIN bloshkoarmy.officership
ON militarybase.idArmyBase = officership.militaryBaseid;

SELECT militarybase.localAddress, officership.rankk
FROM bloshkoarmy.militarybase
INNER JOIN bloshkoarmy.officership
ON militarybase.idArmyBase = officership.militaryBaseid
ORDER BY rankk;

SELECT * FROM bloshkoarmy.officership;

SELECT * FROM bloshkoarmy.officership
WHERE idOfficerShip=5;

UPDATE bloshkoarmy.officership
SET firstName ='Natalia'
WHERE idOfficerShip = 4;

DELETE FROM bloshkoarmy.officership
WHERE idOfficerShip = 3;

SELECT AVG (age) 
FROM bloshkoarmy.officership
WHERE idOfficerShip=5;

SELECT officership.firstName, officership.lastName, officership.rankk, soldiers.firstName, soldiers.lastName, soldiers.rankk
FROM bloshkoarmy.officership
RIGHT OUTER JOIN bloshkoarmy.soldiers
ON officership.militaryBaseid = soldiers.officershipId;

SELECT officership.firstName, officership.lastName, officership.rankk, soldiers.firstName, soldiers.lastName, soldiers.rankk
FROM bloshkoarmy.officership
INNER JOIN bloshkoarmy.soldiers
ON officership.militaryBaseid = soldiers.officershipId
ORDER BY idOfficerShip;

SELECT * FROM bloshkoarmy.soldiers;

SELECT rankk
FROM bloshkoarmy.soldiers
WHERE rankk LIKE 'sen%';

UPDATE bloshkoarmy.soldiers
SET firstName ='Claus'
WHERE idSoldiers = 1;

DELETE FROM bloshkoarmy.soldiers
WHERE idSoldiers = 3;

SELECT AVG (age) 
FROM bloshkoarmy.soldiers;

SELECT firstName, lastName, age, rankk
FROM bloshkoarmy.soldiers
WHERE age=18 AND rankk LIKE 'soldier'
ORDER BY age DESC;

SELECT * FROM bloshkoarmy.weapon;

SELECT * FROM bloshkoarmy.weapon
WHERE name = 'firearm' OR classs = 'longcombat'
order by name;

UPDATE bloshkoarmy.weapon
SET classs ='unicombat'
WHERE idweapon = 5;

SELECT weapon.name, weapon.classs, ammunition.nameAmmunition, ammunition.quantityWeapon
FROM bloshkoarmy.weapon
INNER JOIN bloshkoarmy.ammunition
ON weapon.idWeapon = ammunition.weaponIdweapon
ORDER BY ammunition.quantityWeapon ASC;

SELECT weapon.name, ammunition.nameAmmunition
FROM bloshkoarmy.weapon
LEFT OUTER JOIN bloshkoarmy.ammunition
ON weapon.idWeapon = ammunition.weaponIdweapon
ORDER BY weapon.name DESC;

SELECT * FROM bloshkoarmy.ammunition;

SELECT * FROM bloshkoarmy.ammunition
WHERE quantityWeapon > 20;

UPDATE bloshkoarmy.ammunition
SET quantityWeapon = 45
WHERE idAmmunition = 104;

DELETE FROM bloshkoarmy.ammunition
WHERE idAmmunition = 107;

SELECT nameAmmunition
FROM bloshkoarmy.ammunition
WHERE nameAmmunition LIKE 'b%';

SELECT ammunition.nameAmmunition, weapon.name
FROM bloshkoarmy.ammunition 
RIGHT OUTER JOIN bloshkoarmy.weapon
ON ammunition.weaponIdweapon = weapon.idWeapon
ORDER BY ammunition.nameAmmunition;

SELECT * FROM bloshkoarmy.aviaweapon;

SELECT * FROM bloshkoarmy.aviaweapon
WHERE idAviaweapon = 3;

SELECT aviaweapon.name, aviaweapon.quantity, weapon.name, weapon.classs
FROM bloshkoarmy.aviaweapon
LEFT OUTER JOIN bloshkoarmy.weapon
ON aviaweapon.idAviaweapon = weapon.idWeapon
WHERE quantity>2;

SELECT aviaweapon.name, weapon.classs
FROM bloshkoarmy.aviaweapon
INNER JOIN bloshkoarmy.weapon
ON aviaweapon.idAviaweapon = weapon.idWeapon
ORDER BY aviaweapon.name;

SELECT * FROM bloshkoarmy.landweapon;

SELECT * FROM bloshkoarmy.landweapon
WHERE quantityLandweapon > 10 AND namelandweapon = 'knife';

UPDATE bloshkoarmy.landweapon
SET nameLandweapon = 'rocket fire'
WHERE idlandweapon = 5;

DELETE FROM bloshkoarmy.landweapon
WHERE idlandweapon = 5;

SELECT Landweapon.nameLandweapon, weapon.name, weapon.classs
FROM bloshkoarmy.Landweapon
LEFT OUTER JOIN bloshkoarmy.weapon
ON Landweapon.weaponIdland = weapon.idWeapon;

SELECT * FROM bloshkoarmy.navyweapon;

SELECT DISTINCT (quantityNavyweapon)
FROM bloshkoarmy.navyweapon;

SELECT nameNavyweapon, quantityNavyweapon
FROM bloshkoarmy.navyweapon
WHERE quantityNavyweapon>5 AND nameNavyweapon LIKE '% %'
ORDER BY quantityNavyweapon DESC;

SELECT navyweapon.nameNavyweapon, weapon.classs
FROM bloshkoarmy.navyweapon
RIGHT OUTER JOIN bloshkoarmy.weapon
ON navyWeapon.weaponIdnavy = weapon.idWeapon
WHERE nameNavyweapon IS NOT NULL;

SELECT * FROM bloshkoarmy.militaryequipment;

SELECT nameEquipment, quantityEquipment, classEquipment
FROM bloshkoarmy.militaryequipment
WHERE quantityEquipment>5 AND classEquipment= 'air'
ORDER BY quantityEquipment ASC;

SELECT COUNT(idMilitaryequipment), classEquipment
FROM militaryequipment
GROUP BY classEquipment
HAVING COUNT(idMilitaryequipment) < 4;

SELECT * FROM bloshkoarmy.army;

SELECT nameArmy, classArmy
FROM bloshkoarmy.army
WHERE quantityArmy<10 OR classArmy= '%-%'
ORDER BY quantityArmy ASC;

SELECT COUNT(idArmy) AS QUANTITY, nameArmy
FROM army
GROUP BY nameArmy
HAVING COUNT(idArmy) < 5;

SELECT * FROM bloshkoarmy.weaponhasarmy;




