package pages.backend;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class AdminLogin {


    public  static void open(){

        Browser.driver.get("http://shop.pragmatic.bg/admin");
    }


    public static void typeInFields(String username, String password){
        Browser.driver.findElement(By.cssSelector("#input-username")).sendKeys(username);
        Browser.driver.findElement(By.cssSelector("#input-password")).sendKeys(password);
        Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
    }

    public static void verifyValidationLogin(String expectedValidationMessage, String messageOnFailure){
        String actualValidationText = Browser.driver.findElement(By.cssSelector(".dropdown-toggle")).getText();
        Assert.assertTrue(actualValidationText.equals(expectedValidationMessage),messageOnFailure);
    }

    public static void  verifyFailLogIn(String expectedValidationText,String messageOnFailure){
        String actualMessage = Browser.driver.findElement(By.cssSelector("div .alert-danger")).getText();
        Assert.assertTrue(actualMessage.contains(expectedValidationText), messageOnFailure);
    }




}
