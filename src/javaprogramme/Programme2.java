package javaprogramme;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme
 */
public class Programme2 {
    public static void main(String[] args) {
        addition();
    }
    public static void addition() {
        String name = "Shree";
        String name1 = "Krishna";
        String result = (name + name1);
        System.out.println(result);
    }

}
