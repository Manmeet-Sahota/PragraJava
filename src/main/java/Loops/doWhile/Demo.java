package Loops.doWhile;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the value");

        int n=scanner.nextInt();

        int i =1;
        int sum=0;
        do {
            sum =+1;
            i++;
        }
        while( i<=n);
            System.out.println(sum);


    }
}
