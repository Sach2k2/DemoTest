package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressesPage extends BasePage {
    public static String summerDressesLabel_selector = "#center_column>h1>span.cat-name";
    public static String dressSelection_selector = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[2]/span";
    public static String expectedSummerDressesLabelText = "SUMMER DRESSES ";
    public static String test = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]";
    public static String printedSummerDressLabel_selector = "#center_column>div>div>div.pb-center-column.col-xs-12.col-sm-4>h1";
    public static String quickView_xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img";
    public static String fancyBoxFrame_classname = "fancybox-iframe";
    public static String selectBlueColor_id = "color_14";
    public static String addToCart_id = "add_to_cart";
    public static String colorInCart_id = "layer_cart_product_attributes";
    public static String quantityInCart_id = "layer_cart_product_quantity";
    public static String expectedPrintedDressLabel = "Printed Summer Dress";
    public DressesPage(BrowserDriver driver) {
        super(driver);
    }

    public static void verifySummerDressesLabel(){
        String summerDressesLabelText = driver.findElement(By.cssSelector(summerDressesLabel_selector)).getText();
        Assert.assertEquals(summerDressesLabelText, expectedSummerDressesLabelText);
    }

    public static void printedSummerDress(){
        String printedSummerDressLabelText = driver.findElement(By.cssSelector(printedSummerDressLabel_selector)).getText();
        Assert.assertEquals(printedSummerDressLabelText,expectedPrintedDressLabel);
    }

    public static void quickView() {
        WebElement weQuickView = driver.findElement(By.xpath(quickView_xpath));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(weQuickView));
        weQuickView.click();
    }

    public static void selectColor() {
        driver.switchTo().frame(driver.findElement(By.className(fancyBoxFrame_classname)));
        WebElement weBlueColor = driver.findElement(By.id(selectBlueColor_id));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(weBlueColor));
        driver.switchTo().defaultContent();
    }

    public static void clickOnAddToCart() {
        driver.switchTo().frame(driver.findElement(By.className(fancyBoxFrame_classname)));
        driver.findElement(By.id(addToCart_id)).click();
        driver.switchTo().defaultContent();
    }

    public static void verifyProductColorQuantity() {
        String colorInCart = driver.findElement(By.id(colorInCart_id)).getText();
        Assert.assertTrue(colorInCart.contains("blue"));

        String quantityInCart = driver.findElement(By.id(quantityInCart_id)).getText();
        Assert.assertEquals(quantityInCart, "1");
    }
}
