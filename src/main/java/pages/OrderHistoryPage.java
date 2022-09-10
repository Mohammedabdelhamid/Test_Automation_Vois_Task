package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderHistoryPage {

    private WebDriver driver;

    private By orderReferenceLocator=By.xpath("//tr[@class='first_item ']//a[@class='color-myaccount' and contains(.,'')]");
    //private By orderReferenceLocator=By.id("submitReorder");

    private By detailedOrderReferenceLocatorPlaced=  By.xpath("//p[@class='dark']/strong");
   //private By detailedOrderReferenceLocatorPlaced=By.id("submitReorder");
    public OrderHistoryPage (WebDriver driver){
        this.driver = driver;
    }

    public void checkOrderPlacementInOrderHistory () {
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(orderReferenceLocator));
        driver.findElement(orderReferenceLocator).click();
    }
    public String validateOrderPlacementInOrderHistory() {
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(detailedOrderReferenceLocatorPlaced));
        WebElement element = driver.findElement(detailedOrderReferenceLocatorPlaced);
        return element.getText();
    }

    public String orderNumberCode() {
        WebElement element = driver.findElement(orderReferenceLocator);
        return element.getText();
    }
}
