package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {


    public static WebDriver driver;

    public static void open(String linkToSite) {

        System.setProperty("webdriver.chrome.driver", "C:\\New folder\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(linkToSite);
    }

    public static void quit() {

        driver.quit();

    }
}
