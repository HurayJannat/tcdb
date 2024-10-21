package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MenuPage {

   @FindBy(className = "menu-item-has-children")
   public List<WebElement> menuBar;

   @FindBy(css = "a[href='/card-add/']")
   public WebElement BtnAddCard;

   @FindBy(id = "year_year")
   public WebElement txtYear;

   @FindBy(id = "sport_sports")
   public WebElement txtSport;

   @FindBy(id = "id_player")
   public WebElement txtPlayerName;

   @FindBy(id = "id_brand")
   public WebElement txtBrandName;

   @FindBy(id = "id_card_num")
   public WebElement txtCardNo;

   @FindBy(className = "filteredItem")
   public WebElement filterCard;

   @FindBy(css = "button.btn.btn-secondary.btn-lg.active[type='submit']")
   public WebElement saveButton;

   @FindBy(id = "select2-id_customer-container")
   public WebElement txtCustomer;

   @FindBy(css = "textarea.select2-search__field")
   public WebElement txtAttribute;

   @FindBy(id = "id_set_type")
   public WebElement txtSetType;

   @FindBy(id = "id_team")
   WebElement txtTeamName;

   @FindBy(id = "id_set")
   WebElement txtsetName;



   // Add Year-----------------
   public void addYear( WebDriver driver, String year)
   {
      txtYear.sendKeys(year);
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocompleteList_year_year")));
      WebElement year2001 = dropdown.findElement(By.xpath("//li[text()='" + year + "']"));
      year2001.click();

   }
 // Add Sport--------------------
   public void addSport(WebDriver driver, String sport)
   {
      txtSport.sendKeys(sport);
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocompleteList_sport_sports")));
      WebElement Basketball = dropdown.findElement(By.xpath("//li[normalize-space(text())='"+ sport +"']"));
      Basketball.click();
   }

   // Add Player Name----------------
   public void addPlayerName(WebDriver driver, String brandName)
   {
      txtPlayerName.sendKeys(brandName);
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocompleteList_id_player")));
      WebElement playerName = dropdown.findElement(By.xpath("//li[normalize-space(text())='"+brandName+"']"));
      playerName.click();

   }

   // Add Brand Name-------------------

   public void addBrandName(WebDriver driver, String brandName) throws InterruptedException {
      // Enter brand name into the input field
      txtBrandName.sendKeys(brandName);

      // Wait for the dropdown to become visible
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocompleteList_id_brand")));

      // Find the matching option
      List<WebElement> options = dropdown.findElements(By.tagName("li"));
      for (WebElement option : options) {
         String optionText = option.getText().trim(); // Ensure whitespace isn't causing a mismatch
         if (optionText.equals(brandName)) {
            option.click();
            break;
         }
      }
      Thread.sleep(3000);
      driver.findElement(By.tagName("body")).click();


   }


   // Add Customer-----------------
   public void addCustomer(WebDriver driver)
   {
      txtCustomer.click();

      // Wait until the dropdown options are visible
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-id_customer-results")));

      // Select the option by visible text
      List<WebElement> options = dropdown.findElements(By.tagName("li"));
      for (WebElement option : options) {
         if (option.getText().equals("demo1323@gmail.com")) {
            option.click();
            break;
         }
      }
   }


// Add Attribute ------------------
   public void addAttribute(WebDriver driver, String attributeValue)
   {
      txtAttribute.click();

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-id_attribute-attribute-results")));

      // Find the matching option by its text
      List<WebElement> options = dropdown.findElements(By.tagName("li"));
      for (WebElement option : options) {
         if (option.getText().trim().equalsIgnoreCase(attributeValue)) {
            option.click();
            break;
         }
      }
   }

   // ADD Set Type ----------------------
   public void addSetType(WebDriver driver, String setType)
   {
      txtSetType.click();
      WebElement checklistOption = driver.findElement(By.xpath("//option[text()='"+setType+"']"));
      // Click on the "Checklist" option
      checklistOption.click();
      driver.findElement(By.tagName("body")).click();
   }


   // ADD Set Name ---------------------
   public void addSetName(String setName)
   {
      txtsetName.sendKeys(setName);

   }

   //ADD Team Name-------------------

   public void addTeamName(String teamNAme)
   {
      txtTeamName.sendKeys(teamNAme);

   }



// Add CardNo----------------
   public void addCardNo(String cardNo)
   {
      txtCardNo.sendKeys(cardNo);
      filterCard.click();
      saveButton.click();
   }









   

   public void addCardPage()
   {
      menuBar.get(1).click();
      BtnAddCard.click();

   }

   public MenuPage(WebDriver driver)
   {
      PageFactory.initElements(driver, this);
   }




}
