package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    private WebDriver driver;

    private By checkBox=By.id("uniform-cgv");

    private By shippingProceedCheckout=By.xpath("//button[@name='processCarrier']");
    public ShippingPage (WebDriver driver){
        this.driver = driver;
    }

    public void setCheckBoxTrue(){
        driver.findElement(checkBox).click();
    }
    public PaymentPage clickShippingProceedCheckout(){
        driver.findElement(shippingProceedCheckout).click();
        return new PaymentPage(driver);
    }
}
