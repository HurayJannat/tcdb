package testrunner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CSVPage;
import pages.LoginPage;
import setup.Setup;


public class CSVTestRunner extends Setup {


    @BeforeTest
    public void doLogin()
    {
        LoginPage login = new LoginPage(driver);
        login.doLogin("danielmeyers1@gmail.com", "1234");


    }


    @Test(priority = 1)
    public void generateCSV()
    {
        CSVPage csvpage = new CSVPage(driver);
        csvpage.btnCsv.click();
    }


    @Test(priority = 2)
    public void generateCSVWithFilter()
    {
        CSVPage csvpage = new CSVPage(driver);
        csvpage.selectFilterDropDown("Requires Editing");
        csvpage.btnCsv.click();
    }

    @Test(priority = 3)
    public void generateCSVWithDateBrand()
    {

        // Filter the date--------

        CSVPage csvpage = new CSVPage(driver);
        csvpage.selectDate("07/10/2024","10/10/2024");  //mm/dd/yyyy

        // Filter the Brand
        csvpage.selectBrand("Topps Tennessee Titans");
        csvpage.btnSearch.click();

        //Filter the cards--------
        csvpage.selectFilterDropDown("Requires Editing");
        csvpage.btnCsv.click();

    }





}
