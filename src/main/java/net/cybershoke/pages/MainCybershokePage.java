package net.cybershoke.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainCybershokePage extends BaseCybershokePage
{
    public MainCybershokePage(WebDriver driver)
    {
        super(driver, mainPageURL);
    }

    public void open()
    {
        driver.navigate().to(pageUrl);
    }

    public void clickOnLoginToSteam()
    {
        (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.elementToBeClickable(
                        driver.findElement(By.className("login-btn"))
                )).click();
    }
}
