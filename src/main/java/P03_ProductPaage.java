import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P03_ProductPaage {
    SHAFT.GUI.WebDriver driver;

    //Constructor
    public P03_ProductPaage(SHAFT.GUI.WebDriver driver){this.driver =  driver;}

    //Locators
    By emailInput = By.xpath("//input[@data-qa=\"login-email\"]");
    By passwordInput = By.xpath("//input[@data-qa=\"login-password\"]");
    By loginBtn = By.xpath("//input[@data-qa=\"login-button\"]");


    //Methods
    public void login(String userName, String password){
        driver.element().type(emailInput,userName).
                type(passwordInput,password).
                click(loginBtn);
    }
}
