package homedepot;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RXC8414 on 6/2/2017.
 */
public class TestExercises {

    static WebDriver driver;
    static HelpandCustomerServiceCenter object;
    public static final String URL = "http://homedepot.com";

    @BeforeClass
    public static void Setup(){
        String path = System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        object = PageFactory.initElements(driver, HelpandCustomerServiceCenter.class);

    }
    @Test
    public void verify06022017Test(){
        Assert.assertTrue("Could not open requested URL",object.navigateURL(URL));
        Assert.assertTrue("Could not find Help and FAQs Link", object.openLink(object.helpandfaq));
        Assert.assertTrue("Could not land on land on the Help and Customer Service Center", object.findHyperlinkNum());
    }


    @AfterClass
    public static void Cleanup(){
        object.syncElement("SECONDS",2);
        driver.close();
    }

}

