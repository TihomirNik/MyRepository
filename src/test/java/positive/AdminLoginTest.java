package positive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.backend.AdminLogin;
import utils.Browser;

public class AdminLoginTest {

@BeforeMethod
    public void setup(){
    AdminLogin.open();
}


@Test
public void logIn(){

    AdminLogin.typeInFields("admin","parola123!");
    AdminLogin.verifyValidationLogin("Milen Strahinski", "Opa obraka se neshto");

}




@AfterMethod
    public void teardown(){
    Browser.quit();
}



}
