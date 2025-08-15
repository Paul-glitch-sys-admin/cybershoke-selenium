package net.cybershoke.testPages;

import net.cybershoke.pages.MainCybershokePage;
import net.cybershoke.pages.PAGE_URLS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainCybershokePageTest
{
    private WebDriver driver;

    @BeforeEach
    void init()
    {
        driver = new ChromeDriver();
    }

    @Test
    void cybershokeMainPageLoginToSteam()
    {
        MainCybershokePage page = new MainCybershokePage(driver);
        page.open();

        Assertions.assertEquals(driver.getCurrentUrl(), page.pageUrl);
        page.clickOnLoginToSteam();
        Assertions.assertTrue(driver.getCurrentUrl().contains(PAGE_URLS.steamAuthPageURL));

        driver.quit();
    }

}
