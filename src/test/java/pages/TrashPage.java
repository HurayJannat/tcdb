package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrashPage {


    @FindBy(css = "button.btn-outline-danger")
    public WebElement btnTrash;

    @FindBy(css = "button.btn-secondary")
    public WebElement btnCancelTrash;


    @FindBy(id = "archiveConfirm")
    public WebElement confirmTrash;






    public TrashPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


}
