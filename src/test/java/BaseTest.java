import org.checkerframework.framework.qual.AnnotatedFor;
import org.example.driver.Driver;
import org.example.entity.EntityManager;
import org.example.entity.User;
import org.example.helper.HelperMethod;
import org.example.page.PracticFormPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    PracticFormPage practicFormPage;
    HelperMethod helperMethod;
    User user;
    @BeforeClass
    public void open(){
        user = EntityManager.createUser();
        driver = Driver.getDriver();
        helperMethod = new HelperMethod();
        practicFormPage = new PracticFormPage();
    }

    @AfterClass
    public void close(){
        Driver.closeBrower();
    }

}
