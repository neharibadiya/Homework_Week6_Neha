package javaprogramme;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {
    static String name = "Toyota";
    int a =20;
    public static void main(String[] args) {
        System.out.println(name);
        Programme3 obj = new Programme3();
        System.out.println(obj.a);
    }
}

