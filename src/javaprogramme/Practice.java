package javaprogramme;


public class Practice {
    int a= 10;
    int b = 10;
    String name = "jai";
    String name1 = "swaminarayan";
    

    public static void main(String[] args) {
        Practice obj = new Practice();
        obj.myMethod();
        Practice obj1 = new Practice();
        obj1.test();
        Practice obj2 = new Practice();
        obj2.test1();
        Practice obj3 = new Practice();
        obj3.test2();
        Practice obj4 = new Practice();
        obj4.test3();

    }
    public void myMethod(){
        System.out.println(a * b);
    }
    public void test(){
        System.out.println(name+name1);
    }
    public void test1(){
        System.out.println(name1+name);
    }
    public void test2(){
        int ans = (a - b);
        System.out.println("10 - 10" + " = "+ans);
    }
    public void test3(){
        String ans = "jaiswaminarayan";
        System.out.println("jai + swaminarayan" + " = "+ans);
    }
}
