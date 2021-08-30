package exam06_method;

class Greeting {
    public static void hi() {
        System.out.println("Hi");
    }
}

public class AccessLebelModifiersMethod {
    // public, protected, default, private

    public static void main(String[] args) {
        Greeting.hi();
    }
}
