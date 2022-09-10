package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDataPage {
    private WebDriver driver;
    private By titleField =By.xpath("//input[@id='id_gender1']");
    private By firstNameField = By.id("customer_firstname");
    private By lastNameField = By.id("customer_lastname");
    private By passwordField = By.id("passwd");
    private By addressFirstNameField = By.id("firstname");
    private By addressLastNameField = By.id("lastname");
    private By addressField = By.id("address1");
    private By addressCityField = By.id("city");

    private By addressStateDropdown =By.id("id_state");
//dropdown
    private By addressPostalCode = By.id("postcode");
//dropdown
    private By addressMobileNumber = By.id("phone_mobile");
    private By registerButton = By.id("submitAccount");
    public RegistrationDataPage (WebDriver driver){
        this.driver = driver;
    }

    public void setTitleField (){
        driver.findElement(titleField).click();
    }
    public void setFirstNameField () {
        driver.findElement(firstNameField).sendKeys("Mohamed");
    }
    public void setLastNameField () {
        driver.findElement(lastNameField).sendKeys("Abdelhamid");
    }
    public void setPasswordField () {
        driver.findElement(passwordField).sendKeys("P@ssw0rd");
    }
    public void setAddressFirstNameField () {
        driver.findElement(addressFirstNameField).sendKeys("Ahmed");
    }
    public void setAddressLastNameField  () {
        driver.findElement(addressLastNameField).sendKeys("alaa");
    }
    public void setAddressField () {
        driver.findElement(addressField).sendKeys("cairo");
    }
    public void setAddressCityField () {
        driver.findElement(addressCityField).sendKeys("cairo");
    }
    public void setAddressStateDropdown () {

        Select dropdown = new Select(driver.findElement(addressStateDropdown));
      // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(addressStateDropdown));
        dropdown.selectByVisibleText("Arizona");
        WebElement text=dropdown.getFirstSelectedOption();
        System.out.println("first element =" +text.getText());
       // driver.findElement(addressStateDropdown).click();
    }

    public void setAddressPostalCode () {
        driver.findElement(addressPostalCode).sendKeys("12345");
    }
    public void setAddressMobileNumber () {
        driver.findElement(addressMobileNumber).sendKeys("01144563214");
    }
    public signInPage setRegisterButton() {
        driver.findElement(registerButton).click();
        return new signInPage(driver);
    }

}