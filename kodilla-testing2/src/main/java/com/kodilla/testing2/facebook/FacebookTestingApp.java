package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String XPATH_FIRSTNAME = "//div[contains(@class, \"mbm _1iy_ _a4y _3-90 lfloat _ohe\")]/div/div/input";
    public static final String XPATH_LASTNAME = "//div[contains(@class, \"mbm _1iy_ _a4y rfloat _ohf\")]/div/div/input";
    public static final String XPATH_EMAIL = "//div[contains(@class, \"mbm _a4y\")]/div/div/input";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectBirthdayDay = driver.findElement(By.xpath(XPATH_DAY_SELECT));
        Select selectDay = new Select(selectBirthdayDay);
        selectDay.selectByIndex(2);

        WebElement selectBirthdayMoth = driver.findElement(By.xpath(XPATH_MONTH_SELECT));
        Select selectMonth = new Select(selectBirthdayMoth);
        selectMonth.selectByIndex(2);

        WebElement selectBirthdayYear = driver.findElement(By.xpath(XPATH_YEAR_SELECT));
        Select selectYear = new Select(selectBirthdayYear);
        selectYear.selectByValue("1999");

        WebElement inputFirstame = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        inputFirstame.sendKeys("Tyrion");

        WebElement inputLastname = driver.findElement(By.xpath(XPATH_LASTNAME));
        inputLastname.sendKeys("Lanister");

        WebElement inputEmail = driver.findElement(By.xpath(XPATH_EMAIL));
        inputEmail.sendKeys("lanistersalwayspaysthietdebts@casterlyrock.com");
    }
}
