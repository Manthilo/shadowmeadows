package Test;

import Utils.Utils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;

public class BaseTest {
    public static WebDriver driver;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest
            ;


    @BeforeTest
    public void setUp(ITestContext context){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Utils.URL);
        driver.manage().window().maximize();
        extentTest = extentReports.createTest(context.getName());
    }

    @AfterTest
    public  void  tearDown(){
        driver.quit();
    }

    @BeforeSuite
    public void initialiseExtentReports(){
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("ShadyMeadowsTest.xml");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }

    @AfterSuite
    public void generateExtentReports(){
        extentReports.flush();

    }

    @AfterMethod
    public void checkResults(Method m,ITestResult result) throws Exception {
        if(result.getStatus()== ITestResult.SUCCESS){

            extentTest.pass(m.getName() + "   passed");

        } else if (result.getStatus()==ITestResult.FAILURE) {
            extentTest.pass(m.getName()+ "     failed");
            takeSnapShot(driver, "C://Users//Lungelo.Zondo//IdeaProjects//untitled//src//screenshot");

        }


    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile =new File(fileWithPath);

        FileUtils.copyFile(SrcFile, DestFile);

    }


}
