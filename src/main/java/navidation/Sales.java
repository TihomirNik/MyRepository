package navidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.backend.AdminLogin;
import utils.Browser;

import java.util.ArrayList;
import java.util.List;

public class Sales {

    public static void openNavigation() {
        Browser.open("http://shop.pragmatic.bg/admin");
        AdminLogin.typeInFields("admin", "parola123!");
    }


    public static void orderStatus() {

        Browser.driver.findElement(By.cssSelector("#menu-sale")).click();
        Browser.driver.findElement(By.linkText("Orders")).click();


        Select orderStatusValues = new Select(Browser.driver.findElement(By.cssSelector("#input-order-status")));

        String[] expectedValues = {
                "",
                "Missing Orders",
                "Canceled",
                "Canceled Reversal",
                "Chargeback",
                "Complete",
                "Denied",
                "Expired",
                "Failed",
                "Pending",
                "Processed",
                "Processing",
                "Refunded",
                "Reversed",
                "Shipped",
                "Voided"};

        List<String> actualValues = new ArrayList<>();

        List<WebElement> allDropDownElements = orderStatusValues.getOptions();

        for (WebElement curDropdownElement : allDropDownElements) {
            actualValues.add(curDropdownElement.getText());
        }

        Assert.assertEquals(actualValues.toArray(), expectedValues, "Ibasi");
    }

}
