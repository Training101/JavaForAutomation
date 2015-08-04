package com.java.controlstructures;

public class ForLoop {

    public static void main(String[] args) {
        
        System.out.println("Before entering the for loop");
        
        for (int i = 0; i < 5; i++) {
           
            System.out.println("************** In the outer for loop **************");
            System.out.println("Value of the outer loop i value is " + i);
            System.out.println("*********************** X *************************");
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Value of the inner loop j value : " + j);
            }
            
        }

    }

}
