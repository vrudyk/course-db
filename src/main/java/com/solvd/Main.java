package com.solvd;

import com.solvd.dao.AuditoryDAO;
import com.solvd.dao.ChairDAO;
import com.solvd.dao.FacultyDAO;
import com.solvd.dao.GradeBookDAO;
import com.solvd.dao.GroupDAO;
import com.solvd.dao.ScheduleDAO;
import com.solvd.dao.StudentDAO;
import com.solvd.dao.SubjectDAO;
import com.solvd.dao.TeacherDAO;
import com.solvd.dao.UniversityDAO;
import com.solvd.model.Auditory;
import com.solvd.model.Chair;
import com.solvd.model.Faculty;
import com.solvd.model.GradeBook;
import com.solvd.model.Group;
import com.solvd.model.Schedule;
import com.solvd.model.Student;
import com.solvd.model.Subject;
import com.solvd.model.Teacher;
import com.solvd.model.UniversityModel;
import com.solvd.service.parsers.*;
import com.solvd.util.enums.Acreditation;
import org.apache.log4j.Logger;

import java.util.List;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        /*//JDBC parser
        UniversityDAO universityDAO = new UniversityDAO();
        universityDAO.getAllUniversities().forEach(LOGGER::info);
        universityDAO.insertIntoUniversity(4, "Strange University", Acreditation.FOURTH);
        universityDAO.getAllUniversities().forEach(LOGGER::info);
        universityDAO.deleteUniversityById(4);
        universityDAO.getAllUniversities().forEach(LOGGER::info);
        */



        /*//StAX Parser
        UniversityStAXParser universityStAXParser = new UniversityStAXParser("src/main/resources/university.xml");
        universityStAXParser.getUniversityList().forEach(LOGGER::info);
*/



        /*//JAXB Parser
        Faculty faculty = new Faculty();
        faculty.setId(55);
        faculty.setName("Computer Science");
        faculty.setLocation("Rivne street, 15");
        faculty.setAcreditation(Acreditation.THIRD);
        faculty.setUniversity_id(1);
        JaxbWriter.jaxbObjectToXml(faculty, "src/main/resources/faculty.xml");

        faculty = JaxbReader.jaxbXmlToObject("src/main/resources/faculty.xml");
        LOGGER.info(faculty.toString());
        */



        /*//Json Parser
        Chair chair = new Chair();
        chair.setId(12);
        chair.setName("Computer Engineering");
        chair.setFaculty_id(1);
        JsonWriter.jsonWriterChair(chair);
        JsonReader.jsonReaderChair();

        Teacher teacher = new Teacher();
        teacher.setId(45);
        teacher.setChair_id(12);
        teacher.setFirstName("Melnik");
        teacher.setLastName("Igor"); 
        teacher.setEmail("m.igor@chnu.edu.ua");
        teacher.setPhoneNumber("+380661786457");
        JsonWriter.jsonWriterTeacher(teacher);
        JsonReader.jsonReaderTeacher();
        */



        //MyBatis
        
        //Group
        /*GroupDAO groupDAO = new GroupDAO();
        List<Group> groupList = groupDAO.getAllGroups();
        groupList.forEach(LOGGER::info);

        Group group = new Group();
        group.setId(44);
        group.setGroupNumber(344);
        group.setCurator(1);
        group.setChair_id(1);
        groupDAO.insertIntoGroup(group);

        LOGGER.info("->");
        groupList = groupDAO.getAllGroups();
        groupList.forEach(LOGGER::info);

        group.setGroupNumber(366);
        groupDAO.updateGroup(group);

        LOGGER.info("->");
        groupList = groupDAO.getAllGroups();
        groupList.forEach(LOGGER::info);

        groupDAO.deleteGroup(44);

        LOGGER.info("->");
        groupList = groupDAO.getAllGroups();
        groupList.forEach(LOGGER::info);
        */
        
        /*//Student
        StudentDAO studentDAO = new StudentDAO();
        List<Student> studentList = studentDAO.getAllStudents();
        studentList.forEach(LOGGER::info);

        Student student = new Student();
        student.setId(22);
        student.setFirstName("Snigur");
        student.setLastName("Liliya");
        student.setCourse(3);
        student.setGroup_id(1);
        student.setPhoneNumber("+380952935567");
        student.setEmail("snigur.liliya@clg.chnu.edu.ua");
        studentDAO.insertIntoStudent(student);

        LOGGER.info("->");
        studentList = studentDAO.getAllStudents();
        studentList.forEach(LOGGER::info);

        student.setFirstName("Chulei");
        studentDAO.updateStudent(student);

        LOGGER.info("->");
        studentList = studentDAO.getAllStudents();
        studentList.forEach(LOGGER::info);

        studentDAO.deleteStudent(22);

        LOGGER.info("->");
        studentList = studentDAO.getAllStudents();
        studentList.forEach(LOGGER::info);
        */
        
        /*//Selects for all tables
        AuditoryDAO auditoryDAO = new AuditoryDAO();
        List<Auditory> auditoryList = auditoryDAO.getAllAuditories();
        auditoryList.forEach(LOGGER::info);
        
        ChairDAO chairDAO = new ChairDAO();
        List<Chair> chairList = chairDAO.getAllChairs();
        chairList.forEach(LOGGER::info);

        FacultyDAO facultyDAO = new FacultyDAO();
        List<Faculty> facultyList = facultyDAO.getAllFaculties();
        facultyList.forEach(LOGGER::info);

        GradeBookDAO gradeBookDAO = new GradeBookDAO();
        List<GradeBook> gradeBookList = gradeBookDAO.getAllGradeBooks();
        gradeBookList.forEach(LOGGER::info);

        GroupDAO groupDAO = new GroupDAO();
        List<Group> groupList = groupDAO.getAllGroups();
        groupList.forEach(LOGGER::info);

        ScheduleDAO scheduleDAO = new ScheduleDAO();
        List<Schedule> scheduleList = scheduleDAO.getAllSchedule();
        scheduleList.forEach(LOGGER::info);

        StudentDAO studentDAO = new StudentDAO();
        List<Student> studentList = studentDAO.getAllStudents();
        studentList.forEach(LOGGER::info);

        SubjectDAO subjectDAO = new SubjectDAO();
        List<Subject> subjectList = subjectDAO.getAllSubjects();
        subjectList.forEach(LOGGER::info);

        TeacherDAO teacherDAO = new TeacherDAO();
        List<Teacher> teacherList = teacherDAO.getAllTeachers();
        teacherList.forEach(LOGGER::info);

        UniversityDAO universityDAO = new UniversityDAO();
        List<UniversityModel> universityList = universityDAO.getAll();
        universityList.forEach(LOGGER::info);
         */
    }
}
