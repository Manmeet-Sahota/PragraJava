package org.example;

public class Grading {
    public static void main(String[] args) {
        int marks=41;
        if (marks>90 && marks<=100){
            System.out.println("A+ grade");
        }
        else if (marks>80 && marks <90) {
            System.out.println("A grade");
        }
        else if(marks>60 && marks <70){
            System.out.println(" b grade");
        }
        else if (marks>50 && marks<60){
            System.out.println(" c grade");
        } else if (marks>=40&& marks <50) {
            System.out.println("D grade");
        } else  {
            System.out.println("fail");
        }
    }
}
