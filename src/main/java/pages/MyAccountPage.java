package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage {

    private WebDriver driver;

    private By assertMyAccount =By.xpath("//h1[@class='page-heading']");
    private By womenHover =By.xpath("//a[@title='Women']");
    private By blousesLink =By.xpath("//a[@title='Blouses']");
    private By orderHistoryDetails= By.xpath("//a[@title='Orders']");
    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    public  String  getAssertMyAccount(){
      return  driver.findElement(assertMyAccount).getText();

    }
    public void hoverOverWomen(){
        WebElement womenHover =driver.findElement(By.xpath("//a[@title='Women']"));
        Actions actions= new Actions(driver);
        actions.moveToElement(womenHover).perform();
    }
    public BlousesPage clickBlousesLink(){
        driver.findElement(blousesLink).click();
        return new BlousesPage (driver);
    }
    public OrderHistoryPage clickOrderHistoryAndDetails(){
        driver.findElement(orderHistoryDetails).click();
        return new OrderHistoryPage(driver);
    }
}
