package org.example;

public class LeapYear {
    public static void main(String[] args) {
        int year=2018;
        if (year%4==0 && year%100 !=0){
            System.out.println("its a leap year");
        }
        else {
            System.out.println("not leap year");
        }
    }
}
