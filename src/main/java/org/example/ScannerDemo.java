package org.example;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to my telecom");
        System.out.println("1. English");
        System.out.println("2. French");

        Scanner scanner= new Scanner(System.in);
        int language= scanner.nextInt();
        if (language==1){
            System.out.println("English");
            System.out.println("press 1 for billing ");
            System.out.println("press 2 for technical support");
            System.out.println("press 3 for sales ");
            System.out.println("press 4 speak to an agent");
            System.out.println("press 5 go back to main menu");

            int menu= scanner.nextInt();


            switch (menu){
                case 1:
                    System.out.println("Payment Arrangement");
                    System.out.println("Over Charge");
                    break;

                case 2:

                    System.out.println("Internet");
                    System.out.println("Mobile");
                    System.out.println("Tv");
                    break;

                case 3:
                    System.out.println(" 1. Existing Customer");
                    System.out.println("2. New Customer");
                    break;

                case 4:
                    System.out.println("Hey my name is mark , how can i help you?");
                    break;

                case 5:
                    System.out.println("go back to main menu");
                    break;
                default:
                    System.out.println("wrong input");
            }




        } else if (language==2) {
            System.out.println("French");

        }
        else {
            System.out.println("invalid input");
        }
    }
}
