package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{
    public static  String dresses_selector = "#block_top_menu>ul>li:nth-child(2)>a";
    public static String summerDresses_xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a";
    public HomePage(BrowserDriver driver) {
        super(driver);
    }

    public static void selectDresses() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.cssSelector(dresses_selector));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath(summerDresses_xpath))).click().build().perform();
        Thread.sleep(5000);
    }
}
