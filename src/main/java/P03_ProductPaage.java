import com.epam.reportportal.annotations.Step;
import com.shaft.driver.SHAFT;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_ProductPaage {
    SHAFT.GUI.WebDriver driver;

    //Constructor
    public P03_ProductPaage(SHAFT.GUI.WebDriver driver){this.driver =  driver;}

    //Locators
    By ProductsCard = By.xpath("//div[@class=\"productinfo text-center\"]");
    By continueBtn = By.xpath("//button[@data-dismiss=\"modal\"]");
    By viewCartBtn = By.xpath("(//a[@href=\"/view_cart\"])[1]");



    //Methods
    @Step("Add Products with price less than 1000")
    public P03_ProductPaage addProducts(){
        List<WebElement> products = driver.getDriver().findElements(ProductsCard);

        try {
            for (int i = 0; i < products.size(); i++) {
                int productPrice =Integer.parseInt(driver.getDriver().findElement(By.xpath("(//div[@class=\"productinfo text-center\"]/h2)[" + (i+1) +"]")).getText().replaceAll("[^0-9]",""));

                System.out.println("Price of Product : " + (i + 1 ));

                if(productPrice < 1000)
                {
                    driver.element().click(By.xpath("(//div[@class=\"productinfo text-center\"])["+(i+1)+"]/a")).
                            click(continueBtn);
                    System.out.println("Added product with price  : " + productPrice);
                }
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    @SneakyThrows
    public void productsVerifications(){
        driver.element().click(viewCartBtn);
        driver.browser().captureScreenshot();
        Thread.sleep(2500);
    }
}
