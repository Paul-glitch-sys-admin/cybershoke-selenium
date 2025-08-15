package net.cybershoke.pages;

import org.openqa.selenium.WebDriver;

public class BaseCybershokePage implements PAGE_URLS
{
    protected WebDriver driver;

    public String pageUrl;

    protected BaseCybershokePage(WebDriver driver, String pageUrl)
    {
        this.driver = driver;
        this.pageUrl = pageUrl;
    }
}
