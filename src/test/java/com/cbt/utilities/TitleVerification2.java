package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com ",
                "https://westelm.com/");


        WebDriver driver = BrowserFactory.getDriver("chrome");


        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            String title=driver.getTitle().toLowerCase().replace(" ","");
            if (urls.get(i).contains(title)) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }

        }
        Thread.sleep(2000);
        driver.close();
    }
}
