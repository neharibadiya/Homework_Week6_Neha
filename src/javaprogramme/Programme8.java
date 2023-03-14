package javaprogramme;

/**
 * Write a program to calculate the area of a triangle
 */
public class Programme8 {
    float b = 4F;
    float h = 13F;
    float area = (b*h)/2;
    public static void main(String[] args) {
        Programme8 obj =new Programme8();
        obj.myMethod();
    }
    public void myMethod(){
        System.out.println("Area of Triangle is: "+ area);
    }
}
