package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void HomePageLoginMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        //homepage.LearnMethod();
        Thread.sleep(3000);
        Thread.sleep(5000);
        //homepage.SearchBar();
        //homepage.SearchData();
        //Thread.sleep(5000);

    }


    @Test
    public void TuwaiqTestMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        Thread.sleep(2000);
        homepage.bootCamps();
        Thread.sleep(1000);
        homepage.filterIcon();
        Thread.sleep(4000);
        homepage.SearchInputField();
        Thread.sleep(3000);
        homepage.ClickOnRegionDropDownList();
        Thread.sleep(3000);
        homepage.SelectFromRegion();
        Thread.sleep(2000);
        homepage.SelectCategory();
        Thread.sleep(3000);
    }

    @Test
    public void BootCampsMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        Thread.sleep(2000);
        homepage.bootCamps();
        homepage.scrollToPosition(0,600);
        Thread.sleep(3000);



    }
}




