package javaprogramme;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {
    static int a = 15;
    static int b = 20;
    String name = "London";
    String name1 = "Scotland";
    public static void main(String[] args) {
        myMethod();
        Programme4 obj = new Programme4();
        obj.yourMethod();

    }public static void myMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    public void yourMethod(){
        System.out.println(name);
        System.out.println(name1);
    }
}
