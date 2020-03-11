package com.cbt.utilities;

public class StringUtility {
    public static boolean verifyEquals(String expected, String actual){
if(expected.equals(actual)){
    return true;
   // System.out.println("PASS");
}else{
   // System.out.println("FAIL");
}

        return false;
    }
}
