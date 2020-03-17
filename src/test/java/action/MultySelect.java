package action;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Browser;

public class MultySelect {


    @BeforeMethod
    public void openSite(){
        Browser.open("http://pragmatic.bg/automation/lecture13/Config.html");
    }
    @Test

    public void multiSelect(){

    }

    @AfterMethod

    public void tearDown(){
       // Browser.quit();
    }


}
