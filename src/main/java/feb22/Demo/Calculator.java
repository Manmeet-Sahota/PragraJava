package feb22.Demo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

ArithmeticDemo arithmeticDemo= new ArithmeticDemo();

        System.out.println("Enter the operation");
        System.out.println("1 Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. multiply ");
        System.out.println(" 4. Divide");
        System.out.println("5. Modulus");


        int input= scanner.nextInt();

        switch (input){

            case 1:
                System.out.println("enter the first number");
                int num1 = scanner.nextInt();
                System.out.println("enter the second  number");
                int num2= scanner.nextInt();
                System.out.println("the sum of two numbers : "  +arithmeticDemo.sum(num1, num2));
                break;

            case 2:
               arithmeticDemo.subs(23,21);
                break;

            case 3:
                arithmeticDemo.multiply(23,23);
                System.out.println("   Multiply");
                break;

            case 4:
                arithmeticDemo.divide(234,2);
                System.out.println("divide");
                break;
            case 5:
                arithmeticDemo.modulus(345,3);
                System.out.println("modulus");
                break;

            default:
                System.out.println("Power down ");
        }
        scanner.close();
    }
}
