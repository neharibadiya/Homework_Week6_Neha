package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme15 {
    static int a = 15;
    static int b = 27;
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("input first number: ");
        double before = in.nextInt();
        System.out.println("input second number: ");
        double after = in.nextInt();

        System.out.println("Before swapping : a, b = " + a +","+ (after));
        System.out.println("After swapping : b, a = " + b + ","+ (before));
        }
    }

