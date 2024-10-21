package testrunner;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import setup.Setup;

public class LoginTestRunner extends Setup {



    @Test (priority = 1,description = "Verify the homePage is visible")
    public void doLogin()
    {
        LoginPage login = new LoginPage(driver);
        login.doLogin("danielmeyers1@gmail.com", "1234");



    }

    @Test(priority = 2, description = "Verify that the homepage is visible")

    public void checkLogin()
    {
        LoginPage login = new LoginPage(driver);
        String expectedTitle = "Card";
        String actualTitle= login.txttitle.getText();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }






}
