package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Programme16 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int Scanner = 0;
        System.out.println("Input first binary number: " + Integer.toBinaryString(Scanner));
        double num1 = in.nextDouble();
        int Locale = 0;
        System.out.println("Input second binary number: " + Integer.toBinaryString(Locale));
        double num2 = in.nextDouble();

        int integerSum = (int) (num1 + num2);
        String add = Integer.toBinaryString((int) integerSum);

        System.out.println("Sum of two binary numbers = " + add);
        in.close();
    }
}