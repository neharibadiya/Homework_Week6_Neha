package javaprogramme;

import java.util.Scanner;

/**
 *  Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Programme17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a Decimal Number = ");
        int decimal = in.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(decimal));
        in.close();
    }
}
