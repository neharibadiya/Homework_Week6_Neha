package javaprogramme;
/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Programme5 {
    public static void main(String[] args) {
        addition(20,10);// output
        subtraction(10.5F, 20.5F); // output
        Programme5 obj = new Programme5(); //object
        obj.multiplication(15,15); //output
        Programme5 obj1 = new Programme5(); //object
        obj1.division(25,5); //1 output
    }
    public static void addition(int a ,int b) {
        int ans = a + b;
        System.out.println(ans);
    }
    public static void subtraction(float c, float d) {
        float ans = c - d;
        System.out.println(ans);
    }
    public void multiplication(int yourNum, int myNum) {
        int result = yourNum * myNum;
        System.out.println(result);
    }
    public void division(int myNum,int yourNum) {
        int result = myNum / yourNum;
        System.out.println(result);
    }
}
