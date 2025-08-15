package net.cybershoke.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KZServersCybershokePage extends BaseCybershokePage
{
    public KZServersCybershokePage(WebDriver driver)
    {
        super(driver, kzServersPageURL);
    }

    public void open()
    {
        driver.navigate().to(pageUrl);

        driver.findElement(By.cssSelector(".modal-enter-done button")).click();
    }

    public boolean checkForKZServerAvailability() throws InterruptedException {
        (new WebDriverWait(driver, Duration.ofSeconds(2)))
                .until(ExpectedConditions.elementToBeClickable(
                        driver.findElement(By.cssSelector(".servers-grid-TIER > *"))
                )).click();
//        driver.findElements(By.cssSelector(".servers-grid-TIER > *")).get(0).click();

        Thread.sleep(5000);

        boolean displayed = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.visibilityOfAllElements(
                        driver.findElement(By.id("serverInfoModal"))
                )).get(0).isDisplayed();

        return displayed;
    }

}
