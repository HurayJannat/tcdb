package testrunner;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CSVPage;
import pages.LoginPage;
import pages.TrashPage;
import setup.Setup;

public class TrashTestRunner extends Setup {


    @BeforeTest
    public void doLogin()
    {
        LoginPage login = new LoginPage(driver);
        login.doLogin("danielmeyers1@gmail.com", "1234");

    }


    @Test
    public void trashCards() throws InterruptedException {
        //Filter the approved cards
        CSVPage csvpage = new CSVPage(driver);
        csvpage.selectFilterDropDown("Approved");


        // Filter the date
        csvpage.selectDate("10/11/2024","10/11/2024");   //mm/dd/yyyy
        Thread.sleep(5000);

        TrashPage trashPage = new TrashPage(driver);
        trashPage.btnTrash.click();
        trashPage.confirmTrash.click();


    }

}
