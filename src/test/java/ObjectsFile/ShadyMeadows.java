package ObjectsFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 */
public  class ShadyMeadows {
    WebDriver driver;

    public ShadyMeadows(WebDriver driver){
        this.driver = driver;
    }

    By bookThisRoom = By.xpath("//button[normalize-space()='Book this room']");
    By firstName = By.xpath("//input[@placeholder='Firstname']");
    By lastName = By.xpath("//input[@placeholder='Lastname']");

    By emailAddress = By.xpath("//input[@name='email']");

    By phoneNumber = By.xpath("//input[@name='phone']");

    By bookButton = By.xpath("//button[normalize-space()='Book']");

    By emptyEmailErrorMsg = By.xpath("//div[@class='alert alert-danger']");

    By cancelBooking = By.xpath("//button[normalize-space()='Cancel']");

    public void BookThisRoom(){
        driver.findElement(bookThisRoom).click();

    }

    public void FirstName(String Name){
        driver.findElement(firstName).sendKeys(Name);

    }

    public void LastName(String Surname){
        driver.findElement(lastName).sendKeys(Surname);

    }

    public void EmailAddress(String email){
        driver.findElement(emailAddress).sendKeys(email);

    }

    public void PhoneNumber(String phone){
        driver.findElement(phoneNumber).sendKeys(phone);

    }

    public WebElement BookButton (){
        return driver.findElement(bookButton);

    }

    public void CancelBooking (){
        driver.findElement(cancelBooking).click();

    }

    public WebElement EmptyEmailErrorMsg (){
        return driver.findElement(emptyEmailErrorMsg);

    }





}
