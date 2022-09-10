package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    private By emailField =By.id("email_create");
    private By createAccountButton =By.id("SubmitCreate");

    private By loginEmailField =By.id("email");

    private By loginPasswordField =By.id("passwd");

    private By loginSubmitButton =By.id("SubmitLogin");
    public RegistrationPage (WebDriver driver){
        this.driver = driver;
    }

    public void setEmailField(){
        driver.findElement(emailField).sendKeys("egngg.umuhaomedabdelhamid@gmail.com");
    }
    public RegistrationDataPage clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
        return new RegistrationDataPage(driver);
    }
    public void setLoginEmailField(){
        driver.findElement(loginEmailField).sendKeys("eng.muhamedabdelhamid@gmail.com");
    }
    public void setLoginPasswordField(){
        driver.findElement(loginPasswordField).sendKeys("P@ssw0rd");
    }
    public MyAccountPage clickLoginSubmitButton(){
        driver.findElement(loginSubmitButton ).click();
        return new MyAccountPage(driver);
    }
}

