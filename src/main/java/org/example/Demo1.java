package org.example;

public class Demo1 {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        int c=23;

        if(a>b && a>c){
            System.out.println(" a is greater "+a);
        }
         else if (b>a && b>c) {
            System.out.println("b is greater"+b);
        }
         else {
            System.out.println("c is greater"+c);
        }
    }
}
