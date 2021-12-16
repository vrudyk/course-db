import org.apache.log4j.Logger;
import org.testng.annotations.*;

public class TestClazz {

    private static final Logger LOGGER = Logger.getLogger(TestClazz.class);

    @BeforeSuite
    public void beforeSuite(){
        LOGGER.info("Before Suite");
    }

    @BeforeTest
    public void beforeTest(){
        LOGGER.info("Before Test");
    }

    @BeforeClass
    public void beforeClass(){
        LOGGER.info("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        LOGGER.info("Before Method");
    }

    @Test
    public void test1(){
        LOGGER.info("test - 1");
    }

    @Test
    public void test2(){
        LOGGER.info("test - 2");
    }

    @AfterMethod
    public void afterMethod(){
        LOGGER.info("After Method");
    }

    @AfterClass
    public void afterClass(){
        LOGGER.info("After Class");
    }

    @AfterTest
    public void afterTest(){
        LOGGER.info("After Test");
    }

    @AfterSuite
    public void afterSuite(){
        LOGGER.info("After Suite");
    }
}
