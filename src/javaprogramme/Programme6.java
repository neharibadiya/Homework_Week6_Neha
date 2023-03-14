package javaprogramme;

import java.util.Scanner;

/**
 *  Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Programme6 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius");
            double radius = sc.nextDouble();

            double areaCircle = (Math.PI) * Math.pow(radius,2);
            double perimeter = 2 * Math.PI * radius;

            System.out.println("area of circle is "+ areaCircle);
            System.out.println("perimeter of circle is "+ perimeter);
    }
}
