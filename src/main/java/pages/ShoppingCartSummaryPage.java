package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummaryPage {

    private WebDriver driver;
    private By cartSummaryAssertion=By.id("cart_title");
    private By proceedCheckOutButton= By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']");

    public ShoppingCartSummaryPage (WebDriver driver){
        this.driver = driver;
    }

    public String assertONCartSummary(){
        return driver.findElement(cartSummaryAssertion).getText();
    }
    public AddressPage clickProceedCheckOutButton(){
        driver.findElement(proceedCheckOutButton).click();
        return new AddressPage(driver);

    }
}
