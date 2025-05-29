import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class addProduct {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testJson;

    @Test
    public void addProductToCart(){
        new P01_LoginPaage(driver).loginSteps(testJson.getTestData("userName"), testJson.getTestData("password")).navigateToProducts().addProducts().productsVerifications();


    }


    @BeforeClass
    public void setup(){
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://automationexercise.com/login");
        testJson = new SHAFT.TestData.JSON(SHAFT.Properties.paths.testData() + "testData.json");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
