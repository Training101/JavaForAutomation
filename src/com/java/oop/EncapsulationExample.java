package com.java.oop;

public class EncapsulationExample {

    public static void main(String[]args) {
        
        Car mazda = new Car();
        mazda.setColor("Blue");
        mazda.setName("Mazda 3");
        mazda.setTransmission("Automatic");
        mazda.accelerateToSpeed(80);
        
        System.out.println("The car "+mazda.getName()+ " is color " + mazda.getColor() + " and driving in speed of "+mazda.getSpeed());
        
    }
    
}
