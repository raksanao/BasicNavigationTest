package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

public class StringUtility {
    public static void verifyEquals(String expected,String actual){
if(expected.equals(actual)){
    System.out.println("pass");
}else{
    System.out.println("failed");
}

    }
}
