package Loops.While;

import java.util.Scanner;

public class PrintNo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the value");
        int n=scanner.nextInt();

        int i =1;
        while(i<=n){
            System.out.println(i +" ");
            i++;
        }
    }
}
