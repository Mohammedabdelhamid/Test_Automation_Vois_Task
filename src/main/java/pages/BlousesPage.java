package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlousesPage {
    private WebDriver driver;

    private By addTOCart =By.xpath("//a[@title='Add to cart']");

    private By proceedCheckOut=By.xpath("//a[@class='btn btn-default button button-medium']");
    public BlousesPage (WebDriver driver){
        this.driver = driver;
    }

    public void hoverOverSelectedBlouse(){
        WebElement selectedBlouseHover =driver.findElement(By.xpath("//a[@class='product_img_link']"));
        Actions actions= new Actions(driver);
        actions.moveToElement(selectedBlouseHover).perform();
        WebDriverWait wait= new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addTOCart)));
    }
    public void clickAddToCartButton(){
        WebDriverWait wait= new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addTOCart)));
        driver.findElement(addTOCart).click();
    }
    public ShoppingCartSummaryPage clickProceedCheckOut(){
        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedCheckOut));
        driver.findElement(proceedCheckOut).click();
        return new ShoppingCartSummaryPage(driver);
    }
}
