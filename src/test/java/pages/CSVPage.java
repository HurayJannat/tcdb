package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CSVPage {



    @FindBy(id = "fromDate")
    WebElement btnFromData;

    @FindBy(id = "toDate")
    WebElement btnToData;

    @FindBy(id = "search")
    WebElement txtBrandName;

    @FindBy(css = "button[onclick='performSearch()']")
    public WebElement btnSearch;

    @FindBy(css = "button.btn.btn-outline-success.btn-sm.float-right.mr-1")
    public WebElement btnCsv;

    @FindBy(id = "customFilter")
    WebElement filterDropdown;




    public void selectDate(String fromDate, String toDate)
    {
        btnFromData.sendKeys(fromDate);   //(mm/dd/yyyy)
        btnToData.sendKeys(toDate);    //(mm/dd/yyyy)
    }

    public void selectBrand( String brandName)
    {
        txtBrandName.sendKeys(brandName);
    }

    public void selectFilterDropDown(String filterValue)
    {

        Select select = new Select(filterDropdown);
        select.selectByVisibleText(filterValue);
    }








    public CSVPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }


}
