package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {

    private WebDriver driver;
    private By proceedToCheckOutButton=By.xpath("//button[@name='processAddress']");
    public AddressPage (WebDriver driver){
        this.driver = driver;
    }

    public ShippingPage clickProceedToCheckOutButton(){
        driver.findElement(proceedToCheckOutButton).click();
        return new ShippingPage(driver);
    }
}
