import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P02_HomePaage {
    SHAFT.GUI.WebDriver driver;

    //Constructor
    public P02_HomePaage(SHAFT.GUI.WebDriver driver){this.driver =  driver;}

    //Locators
    By menlIstBtn = By.xpath("//a[@href=\"#Man\"]");
    By tshirtBtn = By.xpath("//a[@href=\"/category_products/3\" and contains(.,'Tshirts')]");


    //Methods
    public void navigateToProducts(){
        driver.element().click(menlIstBtn).
                click(tshirtBtn);

    }
}
