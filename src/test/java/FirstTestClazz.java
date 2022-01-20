import com.solvd.dao.GroupDAO;
import com.solvd.dao.StudentDAO;
import com.solvd.dao.UniversityDAO;
import com.solvd.model.Group;
import com.solvd.model.Student;
import com.solvd.model.UniversityModel;
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

public class FirstTestClazz {
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
        LOGGER.info("First Test Clazz Testing Starts...");
    }

    @BeforeMethod
    public void beforeMethod() {
        LOGGER.info("Before Method");
    }

    @Test
    public void test1() {
        LOGGER.info("test - 1: Select all university from database.");
        UniversityDAO universityDAO = new UniversityDAO();
        List<UniversityModel> universityList = universityDAO.getAll();
        Assert.assertFalse(universityList.isEmpty(), "University list should contain some data.");
    }

    @Test
    public void test2() {
        LOGGER.info("test - 2: Update email for student with id = 2.");
        StudentDAO studentDAO = new StudentDAO();
        List<Student> studentList = studentDAO.getAllStudents();
        Student student = studentList.stream().filter(x -> x.getId() == 2).findAny().orElse(null);
        Assert.assertNotNull(student, "No student with such id.");

        String email = "newEmail@chnu.edu.ua";
        studentList.forEach(LOGGER::info);
        student.setEmail(email);
        studentDAO.updateStudent(student);

        studentList = studentDAO.getAllStudents();
        student = studentList.stream().filter(x -> x.getId() == 2).findAny().orElse(null);
        if (student == null) {
            LOGGER.error("No student with such id.");
        } else {
            Assert.assertEquals(email, student.getEmail(), "Email not changed or changed wrong.");
        }
        studentList.forEach(LOGGER::info);
        student.setEmail("chulei.mykhailo@chnu.edu.ua");
        studentDAO.updateStudent(student);
    }

    @Test
    public void test3() {
        LOGGER.info("test - 3: Add new group and delete.");
        GroupDAO groupDAO = new GroupDAO();
        Group group = new Group();
        group.setId(11);
        group.setGroupNumber(111);
        group.setCurator(1);
        group.setChair_id(1);
        groupDAO.insertIntoGroup(group);

        List<Group> groupList = groupDAO.getAllGroups();
        //groupList.forEach(LOGGER::info);
        Assert.assertNotNull(groupList.stream().filter(x -> x.equals(group)).findAny().orElse(null),
                "Group wasn't added.");

        groupDAO.deleteGroup(group.getId());
        groupList = groupDAO.getAllGroups();
        Assert.assertNull(groupList.stream().filter(x -> x.equals(group)).findAny().orElse(null),
                "Group wasn't deleted.");
        //groupList.forEach(LOGGER::info);
    }

    @AfterMethod
    public void afterMethod() {
        LOGGER.info("After Method");
    }

    @AfterClass
    public void afterClass() {
        LOGGER.info("First Test Clazz Testing Ends.");
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
