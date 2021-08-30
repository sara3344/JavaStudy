package exam06_method;

public class WhyMethod {
    public static void printTwoTimesA() { // printTwoTimesA 메소드 안에는 이런 내용이 들어있구나
        System.out.println("-");
        System.out.println("B");
        System.out.println("B");
    }

    public static void main(String[] args) {

        // 100000000
        printTwoTimesA(); // printTwoTimesA 메소드가 있구나
        // 100000000
        printTwoTimesA();
        // 100000000
        printTwoTimesA();
    }
}
