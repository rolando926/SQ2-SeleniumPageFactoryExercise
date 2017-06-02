package homedepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by RXC8414 on 6/2/2017.
 */
public class HelpandCustomerServiceCenter extends MainPage {
    @FindBy(xpath = ".//h1[text()='Help and Customer Service Center']")
    WebElement header;

    public HelpandCustomerServiceCenter(WebDriver driver){
        super(driver);
        this.driver = driver;

    }
    public boolean findHyperlinkNum(){
        if (waitUntilElementDisplayed(header)){
            List<WebElement> count = driver.findElements(By.xpath(".//a"));
            System.out.println("The Number of Hyperlinks: "+count.size());
            return true;
        }
        return false;
    }
}
