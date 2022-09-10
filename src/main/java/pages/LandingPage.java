package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    private WebDriver driver;
    private By landingPageSignIn =By.className("login");

    public LandingPage (WebDriver driver){
          this.driver = driver;
    }
    public RegistrationPage clickSignInButton(){
        driver.findElement(landingPageSignIn).click();
        return new RegistrationPage(driver);
    }
}

