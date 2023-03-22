package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static double factorial(double num) {
        logger.info("Factorial of " + num);
        double factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        logger.info("Result - " + factorial);
        return factorial;
    }
    public static double squareRoot(double num){
        logger.info("Square Root of " + num);
        logger.info("Result - " + Math.sqrt(num));
        return Math.sqrt(num);
    }
    public static double power(double num1, double num2){
        logger.info("Power of " + num1 + " and " + num2);
        logger.info("Result - " + Math.pow(num1,num2));
        return Math.pow(num1,num2);
    }
    public static double naturalLog(double num){
        logger.info("Natural Log of " + num);
        logger.info("Result - " + Math.log(num));
        return Math.log(num);
    }
    public static void main(String[] args) {
        System.out.println("Minor Changes 4");
        Calculator calculator = new Calculator();
        double A,B;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose Operation : ");
            System.out.print("1. Factorial\n2. Square Root\n3. Power\n4. Natural Logarithm\n5. Exit\nEnter Choice: ");
            int ch;
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the number : ");
                    A = scanner.nextDouble();
                    System.out.println("Factorial : "+factorial(A));
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("Enter the number : ");
                    A = scanner.nextDouble();
                    System.out.println("Square Root : "+squareRoot(A));
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Enter the first number : ");
                    A = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    B = scanner.nextDouble();
                    System.out.println("Power : "+power(A,B));
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Enter the number : ");
                    A = scanner.nextDouble();
                    System.out.println("Natural Log : "+Math.log(A));
                    System.out.println("\n");
                    break;
                case 5: return;
                default:
                    System.out.println("Invalid Choice !");
                    System.out.println("\n");
                    break;
            }
        } while(true);
    }
}
