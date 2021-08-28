package exam05;

public class IfApp {
    public static void main(String[] args) {
        System.out.println("a");
//        if (false) {
//            System.out.println(1); // 실행안됨
//        } else {
//            if (true) {
//                System.out.println(2);
//            } else {
//                System.out.println(3);
//            }
//        }

        if (false) { // 실행안됨
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        System.out.println("b");
    }
}

