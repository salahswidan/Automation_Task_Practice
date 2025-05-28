import com.shaft.driver.SHAFT;
import lombok.SneakyThrows;
import org.openqa.selenium.By;

public class P01_LoginPaage {
    SHAFT.GUI.WebDriver driver;

    //Constructor
    public P01_LoginPaage(SHAFT.GUI.WebDriver driver){this.driver =  driver;}

    //Locators
    By emailInput = By.xpath("//input[@data-qa=\"login-email\"]");
    By passwordInput = By.xpath("//input[@data-qa=\"login-password\"]");
    By loginBtn = By.xpath("//button[@data-qa=\"login-button\"]");


    //Methods
    @SneakyThrows
    public P02_HomePaage loginSteps(String userName, String password){
        driver.element().type(emailInput,userName).
                type(passwordInput,password).
                click(loginBtn);
        Thread.sleep(2000);

        return new P02_HomePaage(driver);
    }
}
