USE `chulei-university`;

INSERT INTO University (name, acreditation)
VALUE ('Chernivtsi National University', '4');

INSERT INTO University (name, acreditation)
VALUE ('Bukovinian State Medical University', '4');

INSERT INTO University
VALUE (3, 'Unnamed University', '3');

INSERT INTO Faculty (name, location, university_id, acreditation)
VALUE ('Institute of Physical, Technical and Computer Sciences', 'Rivne street, 16', 1, '3');

INSERT INTO Faculty (name, location, university_id, acreditation)
VALUE ('Faculty of Foreign Languages', 'Sadova street, 5', 1, '2');

INSERT INTO Faculty (name, location, university_id, acreditation)
VALUE ('Faculty of Economics', 'Cathedral street, 2', 1, '2');

INSERT INTO Chair (name, faculty_id)
VALUE ('Computer systems and networks', 1);

INSERT INTO Chair (name, faculty_id)
VALUE ('Computer scienes', 1);

INSERT INTO Chair (name, faculty_id)
VALUE ('Mathematical Problems of Control and Cybernetics', 1);

INSERT INTO Chair (name, faculty_id)
VALUE ('Test Chair N1', 2);

INSERT INTO Chair (name, faculty_id)
VALUE ('Test Chair N2', 2);

INSERT INTO Chair (name, faculty_id)
VALUE ('Test Chair N3', 3);

INSERT INTO Teacher (`first name`, `last name`, chair_id, `phone number`, email)
VALUE ('Petro', 'Bochan', 1, '+380501254238', 'bochan.p@chnu.edu.ua');

INSERT INTO Teacher (`first name`, `last name`, chair_id, `phone number`, email)
VALUE ('Ivan', 'Shevchuk', 2, '+380666582893', 'shevchuk.i@chnu.edu.ua');

INSERT INTO Teacher (`first name`, `last name`, chair_id, `phone number`, email)
VALUE ('Vasilii', 'Melnik', 3, '+380954561672', 'melnik.v@chnu.edu.ua');

INSERT INTO `Group` (chair_id, curator, groupNumber)
VALUE (1, 1, 342);

INSERT INTO `Group` (chair_id, curator, groupNumber)
VALUE (2, 2, 321);

INSERT INTO Student (`first name`, `last name`, course, group_id, `phone number`, email)
VALUE ('Vitalii', 'Ariichuk', 3, 1, '+380994401234', 'ariichuk.vitalii@chnu.edu.ua');

INSERT INTO Student (`first name`, `last name`, course, group_id, `phone number`, email)
VALUE ('Mykhailo', 'Chulei', 3, 1, '+380667694564', 'chulei.mykhailo@chnu.edu.ua');

INSERT INTO Student VALUE (4, 'Yurii', 'Motovilets', 3, 1, '+380998546275', 'motovilets.yurii@chnu.edu.ua');

INSERT INTO Student (`first name`, `last name`, course, group_id, `phone number`, email)
VALUE ('Myroslav', 'Nahrodskii', 3, 2, '+380504561657', 'nahrodskii.myroslav@chnu.edu.ua');

INSERT INTO Auditory VALUE ('1', 301, 22);

INSERT INTO Auditory VALUE ('2', 302, 18);

INSERT INTO Auditory VALUE ('3', 303, 30);

INSERT INTO Auditory VALUE ('4', 304, 20);

INSERT INTO Auditory VALUE ('5', 305, 16);

INSERT INTO `Subject` VALUE ('1', 1, 'English');

INSERT INTO `Subject` VALUE ('2', 2, 'Internet of Things');

INSERT INTO Gradebook VALUE (6, 4, 1, 4, '21/10/26', 1);

INSERT INTO Gradebook VALUE (7, 4, 1, 4, '21/11/2', 1);

INSERT INTO Gradebook VALUE (8, 4, 1, 5, '21/11/9', 1);

INSERT INTO Gradebook VALUE (9, 4, 1, 2, '21/11/16', 1);

INSERT INTO Gradebook VALUE (10, 4, 1, 4, '21/11/23', 1);

UPDATE `chulei-university`.student SET id = 3 WHERE (id = 6);

UPDATE `chulei-university`.student SET `first name` = 'Misha' WHERE (id = 2);

UPDATE `chulei-university`.student SET `first name` = 'Yarik', course = 4 WHERE (id = 3);

UPDATE `chulei-university`.`group` SET groupNumber = 322 WHERE (id = 2);

UPDATE `chulei-university`.`group` SET id = 2 WHERE (id = 4);

UPDATE `chulei-university`.university SET name = 'Some University' WHERE (id = 3);

DELETE FROM `chulei-university`.university WHERE (id = 3);

DELETE FROM `chulei-university`.student WHERE (id = 3);

DELETE FROM `chulei-university`.student WHERE (id != 1);

DELETE FROM `chulei-university`.student WHERE (id > 1) and (id != 2);

DELETE FROM `chulei-university`.`group` WHERE (id != 1);

SELECT * FROM University
WHERE acreditation = 3;

SELECT g.groupNumber, s.`last name`, s.`first name`
FROM `group` g
LEFT OUTER JOIN Student s
ON g.id = s.group_id;

SELECT u.name, f.name, f.location
FROM University u
RIGHT OUTER JOIN Faculty f
ON u.id = f.university_id;

SELECT u.name, f.name, f.location
FROM University u
LEFT OUTER JOIN Faculty f
ON u.id = f.university_id;

SELECT u.name, f.name, f.location
FROM University u
INNER JOIN Faculty f
ON u.id = f.university_id;

SELECT f.name, c.name
FROM Faculty f
RIGHT OUTER JOIN Chair c
ON f.id = c.faculty_id;

SELECT f.name, c.name
FROM Faculty f
LEFT OUTER JOIN Chair c
ON f.id = c.faculty_id;

SELECT f.name, c.name
FROM Faculty f
INNER JOIN Chair c
ON f.id = c.faculty_id;

SELECT g.groupNumber, t.`last name`, t.`first name`
FROM `group` g
RIGHT OUTER JOIN Teacher t
ON t.id = g.curator;

SELECT g.groupNumber, t.`last name`, t.`first name`
FROM `group` g
LEFT OUTER JOIN Teacher t
ON t.id = g.curator;

SELECT g.groupNumber, t.`last name`, t.`first name`
FROM `group` g
INNER JOIN Teacher t
ON t.id = g.curator;

SELECT c.name, g.groupNumber
FROM chair c
RIGHT OUTER JOIN `group` g
ON c.id = g.chair_id;

SELECT c.name, g.groupNumber
FROM chair c
LEFT OUTER JOIN `group` g
ON c.id = g.chair_id;

SELECT c.name, g.groupNumber
FROM chair c
INNER JOIN `group` g
ON c.id = g.chair_id;

SELECT t.`last name`, t.`first name`, s.`subject name`
FROM teacher t
RIGHT OUTER JOIN `subject` s
ON t.id = s.teacher_id;

SELECT t.`last name`, t.`first name`, s.`subject name`
FROM teacher t
LEFT OUTER JOIN `subject` s
ON t.id = s.teacher_id;

SELECT t.`last name`, t.`first name`, s.`subject name`
FROM teacher t
INNER JOIN `subject` s
ON t.id = s.teacher_id;

SELECT group_id, count(group_id) AS Student_count
FROM Student
GROUP BY group_id;

SELECT group_id, count(group_id) AS Student_count
FROM Student
GROUP BY group_id
HAVING count(group_id) > 2;

SELECT faculty_id, count(faculty_id) AS Chair_count
FROM Chair
GROUP BY faculty_id;

SELECT faculty_id, count(faculty_id) AS Chair_count
FROM Chair
GROUP BY faculty_id
HAVING count(faculty_id) >= 2;

SELECT student_id, avg(mark) AS average_mark
FROM Gradebook
GROUP BY student_id;

SELECT student_id, avg(mark) AS average_mark
FROM Gradebook
GROUP BY student_id
HAVING avg(mark) > 4;

SELECT mark, count(mark)
FROM Gradebook
GROUP BY mark;

SELECT `number of seats`, count(`number of seats`) AS count
FROM Auditory
GROUP BY `number of seats`;

SELECT `number of seats`, count(`number of seats`) AS count
FROM Auditory
GROUP BY `number of seats`
HAVING `number of seats` > 20;

SELECT student_id, avg(mark)
FROM Gradebook
GROUP BY student_id;

SELECT acreditation, count(id) AS count
FROM University
GROUP BY acreditation
HAVING acreditation > 3;

SELECT * FROM University;
SELECT * FROM Faculty;
SELECT * FROM Chair;
SELECT * FROM Teacher;
SELECT * FROM `Group`;
SELECT * FROM Student;
SELECT * FROM Auditory;
SELECT * FROM `Subject`;
SELECT * FROM `Schedule`;
SELECT * FROM Gradebook;