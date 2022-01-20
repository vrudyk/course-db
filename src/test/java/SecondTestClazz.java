import com.solvd.dao.StudentDAO;
import com.solvd.dao.UniversityDAO;
import com.solvd.model.Student;
import com.solvd.model.UniversityModel;
import com.solvd.util.enums.Acreditation;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SecondTestClazz {
    private static final Logger LOGGER = Logger.getLogger(FirstTestClazz.class);

    @BeforeSuite
    public void beforeSuite() {
        LOGGER.info("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        LOGGER.info("Before Test");
    }

    @BeforeClass
    public void beforeClass()  {
        LOGGER.info("Second Test Clazz Testing Starts...");
    }

    @BeforeMethod
    public void beforeMethod() {
        LOGGER.info("Before Method");
    }

    @Test
    public void test1() {
        LOGGER.info("test - 1: Add new university.");
        UniversityDAO universityDAO = new UniversityDAO();
        universityDAO.insertIntoUniversity(4, "Strange University", Acreditation.FOURTH);

        List<UniversityModel> universityList = universityDAO.getAllUniversities();
        UniversityModel university = new UniversityModel();
        university.setId(4);
        university.setName("Strange University");
        university.setAcreditation(Acreditation.FOURTH.getValue());
        Assert.assertNotNull(universityList.stream().filter(x -> x.equals(university)).findAny().orElse(null),
                "University wasn't added.");
        //universityDAO.deleteUniversityById(4);
    }

    @Test
    public void test2() {
        LOGGER.info("test - 2: Delete university with name \"Strange University\".");
        UniversityDAO universityDAO = new UniversityDAO();
        List<UniversityModel> universityList = universityDAO.getAllUniversities();
        UniversityModel university = universityList.stream().filter(x -> x.getName().equals("Strange University"))
                .findAny().orElse(null);

        if(university == null) {
            LOGGER.warn("No such university, maybe it was deleted earlier.");
        } else {
            universityDAO.deleteUniversityById(university.getId());
            universityList = universityDAO.getAllUniversities();
            Assert.assertNull(universityList.stream().filter(x -> x.getName().equals("Strange University"))
                    .findAny().orElse(null), "Problem with deleting university");
        }
    }

    @Test
    public void test3() {
        LOGGER.info("test - 3: Add new student and update his course to 4.");
        StudentDAO studentDAO = new StudentDAO();
        Student student = new Student();
        student.setId(22);
        student.setFirstName("Snigur");
        student.setLastName("Liliya");
        student.setCourse(3);
        student.setGroup_id(1);
        student.setPhoneNumber("+380952935567");
        student.setEmail("snigur.liliya@clg.chnu.edu.ua");
        studentDAO.insertIntoStudent(student);
        List<Student> studentList = studentDAO.getAllStudents();
        Assert.assertNotNull(studentList.stream().filter(x -> x.equals(student)).findAny().orElse(null),
                "Student wasn't added.");

        student.setCourse(4);
        studentDAO.updateStudent(student);
        studentList = studentDAO.getAllStudents();
        Assert.assertNotNull(studentList.stream().filter(x -> x.equals(student)).findAny().orElse(null),
                "Student wasn't updated.");

        studentDAO.deleteStudent(student.getId());
    }

    @AfterMethod
    public void afterMethod() {
        LOGGER.info("After Method");
    }

    @AfterClass
    public void afterClass() {
        LOGGER.info("Second Test Clazz Testing End.");
    }

    @AfterTest
    public void afterTest() {
        LOGGER.info("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        LOGGER.info("After Suite");
    }
}

