package net.cybershoke.testPages;

import net.cybershoke.pages.KZServersCybershokePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class KZServersCybershokePageTest
{
    private WebDriver driver;

    @BeforeEach
    void init()
    {
        driver = new ChromeDriver();
    }

    @Test
    void checkForFirstKZServerAvailability()
    {
        KZServersCybershokePage page = new KZServersCybershokePage(driver);
        page.open();

        Assertions.assertEquals(driver.getCurrentUrl(), page.pageUrl);
        try {
            Assertions.assertTrue(page.checkForKZServerAvailability());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
