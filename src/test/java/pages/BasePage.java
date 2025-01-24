package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }


    public static void navigateTo(String url){
        driver.get(url);
    }

        private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
 
    public void clickElement(String locator){
        Find(locator).click();
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public void typeInput (String locator, String search){
        Find(locator).clear();
        Find(locator).sendKeys(search);

    }

    public void dropDownByValue(String locator, String value){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(value);
    }
        
    public void dropDownByIndex(String locator, int index){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(index);;
    }
       
    public int dropDownSize(String locator){
        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOptions = dropdown.getOptions();
        return dropdownOptions.size();

    }

  
};
