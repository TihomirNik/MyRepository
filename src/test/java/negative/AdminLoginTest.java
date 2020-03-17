package negative;

import net.bytebuddy.build.ToStringPlugin;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.backend.AdminLogin;
import utils.Browser;

public class AdminLoginTest {


    @BeforeMethod
    public static void open(){
        AdminLogin.open();
    }

    @Test
    public static void failureTest(){
        AdminLogin.typeInFields("madin", "parolla123!");
        AdminLogin.verifyFailLogIn("No match for Username and/or Password.", "Neshto ne e taka");
    }


    @AfterMethod
    public static void close(){
        Browser.quit();
    }
}
