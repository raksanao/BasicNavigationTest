package com.cbt.test;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.cbt.utilities.StringUtility.verifyEquals;

public class NavigationTest {
    public static void main(String[] args) throws InterruptedException {
       // WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver= BrowserFactory.getDriver("chrome");

        driver.get("http://google.com");
        String titleGoog=driver.getTitle();

        System.out.println(titleGoog);
        Thread.sleep(3000);


        driver.get("https://etsy.com");
        Thread.sleep(3000);
        String tytleEtcy=driver.getTitle();

        System.out.println(tytleEtcy);
        driver.navigate().back();

    // StringUtility.verifyEquals(driver.getTitle(),titleGoog);
        verifyEquals(driver.getTitle(),titleGoog);

        driver.navigate().forward();

    verifyEquals(driver.getTitle(),tytleEtcy);

        Thread.sleep(3000);
        driver.quit();

    }

}
