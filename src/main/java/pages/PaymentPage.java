package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    private WebDriver driver;
    private By payBankWire=By.xpath("//a[@href='http://automationpractice.com/index.php?fc=module&module=bankwire&controller=payment']");
    private By confirmOrderButton=By.xpath("//button[@class='button btn btn-default button-medium']");
    private By myAccount =By.xpath("//a[@class='account']");
    public PaymentPage (WebDriver driver){
        this.driver = driver;
    }

    public void clickPayBankWire(){
        driver.findElement(payBankWire).click();
    }
    public void clickIConfirmMyOrderButton(){
        driver.findElement(confirmOrderButton).click();
    }
    public MyAccountPage clickMyAccount(){
        driver.findElement(myAccount).click();
        return new MyAccountPage(driver);
    }
}
