package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
//        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
//                "https://wayfair.com/",
//                "https://walmart.com ", "https://westelm.com/");

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/",
                "https://walmart.com",
                "https://westelm.com/");
        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (String eachUrl : urls) {
            driver.get(eachUrl);
            String title=driver.getTitle();

            if(title.contains(eachUrl.substring(9))){
                System.out.println("Pass");
            }else System.out.println("Fail");

        }
        driver.quit();

    }
}
