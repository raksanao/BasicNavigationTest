package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com ", "https://westelm.com/");


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








//        for (String url : urls) {
//            driver.get(url);
//            String title = driver.getTitle();
//            title = title.replace(" ", "").toLowerCase();
//            System.out.println(url + " contains: " + title + "? " + url.contains(title));
//        }
//        driver.quit();
//    }


//
//        for(String eachUrl:urls){
//            driver.get(eachUrl);
//String title=driver.getTitle();
//title=title.replace(" ","").toLowerCase();
//if(title.contains(eachUrl)){
//               System.out.println("pass");
//           }else{
//               System.out.println("fail");
//           }
//
//driver.close();
//        }
//    }
}
