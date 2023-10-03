package Test;
import ObjectsFile.ShadyMeadows;
import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class ShadyMeadowsTest extends BaseTest {


    @Test(testName = "ShadyMeadowsTest")
    public  void Test1(){
        ShadyMeadows clientDetails = new ShadyMeadows(driver);
        clientDetails.BookThisRoom();
        clientDetails.FirstName(Utils.NAME);
        clientDetails.LastName(Utils.SURNAME);
        clientDetails.PhoneNumber(Utils.PHONE);
        clientDetails.BookButton().click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String actualErrorMsg = clientDetails.EmptyEmailErrorMsg().getText();
        assertTrue(actualErrorMsg.contains("must not be empty\n"));
        extentTest.info("Create booking where email is missing");
       


    }

    @Test(testName = "ShadyMeadowsTest With All the Details")
    public  void Test2(){
        ShadyMeadows clientDetails = new ShadyMeadows(driver);
        clientDetails.BookThisRoom();
        clientDetails.FirstName(Utils.NAME);
        clientDetails.LastName(Utils.SURNAME);
        clientDetails.EmailAddress(Utils.EMAIL);
        clientDetails.PhoneNumber(Utils.PHONE);
        clientDetails.BookButton().click();
        extentTest.info("Create booking with all the required info");
        extentTest.pass("Booking Failed");
        extentTest.info("Delete Booking");
        clientDetails.CancelBooking();


    }




}
