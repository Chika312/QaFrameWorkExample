import org.example.helper.HelperMethod;
import org.testng.annotations.Test;

public class SimpleTest extends BaseTest {
    @Test
    public void simpleTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        helperMethod.sendKeys(practicFormPage.firsName, user.firstName)
                .sendKeys(practicFormPage.lastName, user.lastName)
                .sendKeys(practicFormPage.userEmail, user.email)
                .sendKeys(practicFormPage.userNumber, user.number)
                .sendKeysEnter(practicFormPage.subject, "m")
                .sendKeys(practicFormPage.currentAddress, user.currentAddress)
                .clickRandom(practicFormPage.gender)
                .clickRandom(practicFormPage.hobbi)
                .sendKeysEnter(practicFormPage.city, "N")
                .sendKeysEnter(practicFormPage.state, "D")
                .sendKeys(practicFormPage.element,"/Users/mac/Desktop/Снимок экрана 2024-03-04 в 15.15.56.png")
                .waitClikc(practicFormPage.submit);


        Thread.sleep(5000);
    }


}
