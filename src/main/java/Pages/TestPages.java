package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    public void OpenUrl (){
        driver.get("https://tuwaiq.edu.sa/");
    }

        public void ChangeLanguage() {
        WebElement english = driver.findElement(language);
        english.click();
    }

    public void bootCamps() {
        WebElement bootCamp = driver.findElement(bootCampsElement);
        bootCamp.click();
    }

    public void filterIcon() {
        WebElement filter = driver.findElement(filterIconElement);
        filter.click();
    }


    public void SearchInputField ()  {
        driver.findElement(searchBarElement).sendKeys("علم");
    }

    public void ClickOnRegionDropDownList ()  {
        WebElement regionDdl = driver.findElement(regionDdlElement);
        regionDdl.click();
    }

    public void SelectFromRegion ()  {
        WebElement region = driver.findElement(regionSelectRiyadh);
        region.click();
    }

    public void SelectCategory ()  {
        WebElement category = driver.findElement(categorySelectProgram);
        category.click();
    }

    public void scrollToPosition(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
    }






// Steps:
    // 1. Create Xpath in "TestHome"
    // 2. Create a method in "TestPages"
    // 3. Call your method in "HomePageTest"
// Important Tips:
    //* Unique method name (VerifyEnglish)
    //* Unique Variable. as above example, (english & english.click)
    //* Check you have the correct element locator variable (language)
// Tasks:
    // Create a Method to verify and click on the English language button
    // Create a Method to click on the Boot Camps and Courses tab
    // Method to click on the filter icon button
    // Method to enter search data in the search input field
    // Method to click on the region dropdown list
    // Method to select a static region value
    // Method to select a category value
    // Method to click on a specific program card
    // Method to scroll to a specific position on the page














///////// Below is for Udacity /////////

//    public void SearchBar() {
//        WebElement searchIcon = driver.findElement(searchBarElement);
//        searchIcon.click();
//    }
//
//    // Method to enter login credentials and verify login
//    public void SearchData () throws InterruptedException {
//        driver.findElement(searchInputBar).sendKeys("data"); // Find email address field and enter email
//        driver.findElement(searchInputBar).sendKeys(Keys.ENTER); // Find password field and enter password
//        //driver.findElement(signInBtn).click(); // Click on sign-in button
//
//        boolean homepageview = driver.findElement(assertionForProgram).isDisplayed(); // Check if assertion element is displayed
//        Assert.assertTrue(homepageview, "home page is not displayed!"); // Assert that homepageview is true
//    }
//    public void LearnMethod() {
//        WebElement learnBtn = driver.findElement(learnElement);
//        learnBtn.click();
//    }



}
