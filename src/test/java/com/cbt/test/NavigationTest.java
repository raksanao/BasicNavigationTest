package com.cbt.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

  driver.get("http://google.com");
  String titleGoog=driver.getTitle();

        System.out.println(titleGoog);
  Thread.sleep(3000);
  driver.navigate().to("https://etsy.com");
  Thread.sleep(3000);
  String tytleEtcy=driver.getTitle();
        System.out.println(tytleEtcy);
        driver.navigate().back();
        verifyEquals(driver.getTitle(),"Google");

        driver.navigate().forward();
verifyEquals(driver.getTitle(),"Google");
        driver.close();

    }
    public static void verifyEquals(String expected,String actual) {
        if (expected.equals(actual)) {
            System.out.println("pass");
        } else {
            System.out.println("failed");
        }
    }
    }
