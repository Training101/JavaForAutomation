package com.java.oop;

public class Car {

    private String name;
    private String color;
    private String transmission;
    private int speed;
    
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public void accelerateToSpeed(int speedKMPH){
        
        // some cool stuff here
        this.speed = speedKMPH;
    }
    
    public int getSpeed() {
        return speed;
    }
    
}
