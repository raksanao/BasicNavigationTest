package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.cbt.utilities.StringUtility.verifyEquals;


public class TitleVerification {


    public static void main(String[] args) throws InterruptedException {



        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver drivers= BrowserFactory.getDriver("chrome");
       drivers.get(urls.get(0));

    String title1=drivers.getTitle();
    Thread.sleep(3000);

   drivers.get(urls.get(1));
    String title2=drivers.getTitle();
    Thread.sleep(300);

   drivers.get(urls.get(2));
    String title3=drivers.getTitle();
    Thread.sleep(3000);

    if(StringUtility.verifyEquals(title1,title2)){
        if(StringUtility.verifyEquals(title1,title3)){
            System.out.println("They all have same title");
        }else{
            System.out.println("They don't have same title");
        }
        for (int i = 0; i < urls.size(); i++) {
            if(urls.get(i).startsWith("http://practice.cybertekschool.com/")){
                System.out.println("pass");

        }else{
                System.out.println("fail");
            }
}

 }
Thread.sleep(3000);
drivers.quit();



    }
    }
