package exam06_method;

public class OutputMethod {

    public static String a() {
        // ...
        return "a";
    }

    public static int one() {
        return 1;
    }

    public static void main(String[] args) { // void는 return값이 없다
        System.out.println((a()));
        System.out.println((one()));
    }
}
