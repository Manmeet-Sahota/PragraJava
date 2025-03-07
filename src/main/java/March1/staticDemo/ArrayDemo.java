package March1.staticDemo;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the elements of array");

        for (int i=0; i<arr.length;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("print the elements of array ");
        for (int i =0;i<arr.length; i++){
            System.out.println(i);
        }
    }
}
