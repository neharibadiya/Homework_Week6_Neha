package javaprogramme;

import javafx.beans.binding.Bindings;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14 {
    float width = 5.6F;
    float height = 8.5F;
    private static String pattern;
    public static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("input first number: ");
        double Width=in.nextDouble();
        System.out.print("input secound number: ");
        double Height=in.nextDouble();
        double x =Width*Height;
        double y=2*(Width+Height);
        System.out.println("Area is "+Width+"*"+Height+"="+ df.format(x));
        System.out.println("Perimeter is " + "2" + "*" + "(" + (Width+ "+" +Height) + ")" + "=" +df.format(y));
    }
}
