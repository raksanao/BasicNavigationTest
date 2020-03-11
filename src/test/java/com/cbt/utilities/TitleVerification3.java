package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/",
                "https://walmart.com",
                "https://westelm.com/");


        for (String eachUrl : urls) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(eachUrl);
            String title = driver.getTitle();

            if (title.contains(eachUrl.substring(9))) {
                System.out.println("Pass");
            } else System.out.println("Fail");


            driver.close();

        }
    }
}