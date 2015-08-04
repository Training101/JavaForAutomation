package com.java.oop;

public class PolymorphismExample {

    public static void main(String[]args) {
        
        PolymorphismExample p = new PolymorphismExample();
        int salary1 = p.calculateSalary(1000, 15);
        int salary2 = p.calculateSalary(1000);
        
        System.out.println(salary1);
        System.out.println(salary2);
        
    }
    
    public int calculateSalary(int perDaySalary, int numberofdays){
        
        return perDaySalary * numberofdays;
    }
    
    public int calculateSalary(int perDaySalary){
        
        return perDaySalary * 30;
    }
    
}
