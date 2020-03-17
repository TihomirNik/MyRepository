package positive;

import navidation.Sales;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Browser;

public class SalesOrderValues {

    @BeforeMethod
    public void openOrders(){
        Sales.openNavigation();
    }

    @Test
    public void salesorderTest(){
        Sales.orderStatus();
    }

    @AfterMethod
    public void teardown(){
        //Browser.quit();
    }
}
