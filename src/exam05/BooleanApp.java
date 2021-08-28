package exam05;

import org.w3c.dom.ls.LSOutput;

public class BooleanApp {
    public static void main(String[] args) {
        System.out.println("One");
        System.out.println(1);

        System.out.println(true); //boolean type
        System.out.println(false); //boolean type

        String foo = "Hello world";
//        String true = "Hello world" // true는 예약어 그래서 에러

        System.out.println(foo.contains("world")); // foo에 world가 포함되어있는지?
        System.out.println(foo.contains("love")); // foo에 lovd이 포함되어있는지?

    }
}
