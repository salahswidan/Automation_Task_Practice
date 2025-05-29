import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import lombok.SneakyThrows;
import org.openqa.selenium.By;

public class P02_HomePaage {
    SHAFT.GUI.WebDriver driver;

    //Constructor
    public P02_HomePaage(SHAFT.GUI.WebDriver driver){this.driver =  driver;}

    //Locators
    By menlIstBtn = By.xpath("//a[@href=\"#Men\"]");
    By tshirtBtn = By.xpath("//a[@href=\"/category_products/3\" and contains(.,'Tshirts ')]");


    //Methods
    @Step("Nav to product page")
    @SneakyThrows
    public P03_ProductPaage navigateToProducts(){
        driver.element().click(menlIstBtn).
                click(tshirtBtn);
        Thread.sleep(2500);

        return new P03_ProductPaage(driver);
    }
}
