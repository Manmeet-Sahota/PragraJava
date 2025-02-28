package org.example;

public class Operator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int x=30;
        int y=40;

        boolean result=(a>b)&&(a>x)&&(a>y);
        System.out.println(result);
        boolean result1=(a>x)||(a>y)||(a>b)||(a>x);
        System.out.println(result1);
        boolean result2=(x<y) && (x>b);
        System.out.println(result2);
        boolean result3= (x>y) ||(y>a);
        System.out.println(result3);
        boolean result4=(a>y) &&(a<=20);
        System.out.println(result4);
        boolean result5=(x>=10) ||(x==b);
        System.out.println(result5);
        boolean result6= (a>x)&&(x<=10);
        System.out.println(result6);


    }
}
