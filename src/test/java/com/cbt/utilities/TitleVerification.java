package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;


public class TitleVerification {


    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");


   WebDriver drivers= BrowserFactory.getDriver("chrome");
   for(String each:urls){
       drivers.get(each);
     String url=drivers.getCurrentUrl();
       if(url.startsWith("http://practice.cybertekschool.com/")){
           System.out.println("Pass");
       }else{
           System.out.println("fail");
       }
       drivers.quit();

   }




    }
}
