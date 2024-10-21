package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.List;

public class LoginPage {


    @FindBy(css ="[type = email]")
    public WebElement txtuserName;

    @FindBy(css ="[type = password]")
    public WebElement txtpassword;

    @FindBy(css ="[type = submit]")
    public WebElement btnsubmit;

    @FindBy(id = "select")
    public WebElement type;


    @FindBy(className = "card-title")
    public WebElement txttitle;





    public void doLogin(String username, String password)
    {

        Select select = new Select(type);
        select.selectByVisibleText("Admin");
        txtuserName.sendKeys(username);
        txtpassword.sendKeys(password);
        btnsubmit.click();
    }

    public  LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }


}
