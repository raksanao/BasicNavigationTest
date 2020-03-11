package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/",
                "https://walmart.com",
                "https://westelm.com/");


        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (String each : urls) {

            driver.get(each);
            Thread.sleep(3000);
            driver.close();
        }
    }
}
