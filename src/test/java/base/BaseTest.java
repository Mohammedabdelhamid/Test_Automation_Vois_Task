package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LandingPage;

public class BaseTest {
    private WebDriver driver;
    protected LandingPage landingPage;

    @BeforeClass
    public void setUp(){
       System.setProperty("webdriver.chrome.driver","resources/chromedriver");
       driver = new ChromeDriver();
       driver.get("http://automationpractice.com/index.php");
       driver.manage().window().setSize(new Dimension(1024,768));
     //  driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
       landingPage =new LandingPage(driver);
      // registrationPage =new RegistrationPage(driver);
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }


}
