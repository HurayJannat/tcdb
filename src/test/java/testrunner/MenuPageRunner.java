package testrunner;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MenuPage;
import setup.Setup;
import setup.Utils;

public class MenuPageRunner extends Setup {

    @BeforeTest
    public void doLogin()
    {
        LoginPage login = new LoginPage(driver);
        login.doLogin("danielmeyers1@gmail.com", "1234");



    }

    @Test
    public void addCardYearSportPlayerBrand() throws InterruptedException {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.addCardPage();
        menuPage.addYear(driver,"2007");
        menuPage.addSport(driver, "Football");
        menuPage.addPlayerName(driver,"Larry Izzo");
        menuPage.addBrandName(driver,"Upper Deck Boston Globe New England Patriots");
        menuPage.addCardNo("1");

    }


    @Test
    public void addCardYearSportPlayerBrandCustomerAttributeSetTypeSetNameTeam() throws InterruptedException {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.addCardPage();
        menuPage.addYear(driver,"2007");
        menuPage.addSport(driver, "Football");
        menuPage.addPlayerName(driver,"Ted Thompson");
        menuPage.addBrandName(driver,"Green Bay Packers Police");
        menuPage.addCustomer(driver);
        menuPage.addAttribute(driver,"GM");
        Utils.scroll(driver,500);
        menuPage.addSetType(driver,"Parallel");
        menuPage.addTeamName("Green Bay Packers");
        menuPage.addSetName("World Class Wire and Cable Inc.");
        menuPage.saveButton.click();

    }

}
