package exam07_oop;

public class MyOOP {
    public static void main(String[] args) {
        // ..
        printA("----");
        printA("----");
        printB("----");
        printB("----");

        printA("****");
        printA("****");
        printB("****");
        printB("****");
    }

    public static void printA(String delimiter) {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public static void printB(String delimiter) {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
