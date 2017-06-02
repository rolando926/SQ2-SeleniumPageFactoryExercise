package homedepot;

import Utilities.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RXC8414 on 6/2/2017.
 */
public class MainPage extends SeleniumUtils{

    @FindBy(xpath = ".//a[text()='Help & FAQs']")
    WebElement helpandfaq;


    public MainPage(WebDriver driver){
        super(driver);
        this.driver = driver;

    }

    public boolean openLink(WebElement element){
        if (waitUntilElementDisplayed(element)){
            element.click();
            return true;
        }
        return false;
    }

}
