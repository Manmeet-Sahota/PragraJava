package Loops.While;

import java.util.Scanner;

public class SumOfNo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the value");

        int n = scanner.nextInt();
      int sum=0;
      int i=1;

        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);


    }
}
