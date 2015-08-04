package com.java.controlstructures;

public class IFCondition {

    public static void main(String[] args) {
        
        String browser = "Firefox";
        boolean isFirefox = true;
        
        if(browser.equals("Chrome")){
            System.out.println("We are using chrome");
        } else {
            System.out.println("We are NOT using chrome");
        }
        
        if(isFirefox){
            System.out.println("We are using Firefox");
        } else {
            System.out.println("We are NOT using Firefox");
        }
        

    }

}
