package exam05;

public class LoopApp {
    public static void main(String[] args) {
        // 2와 3이 반복되도록

        System.out.println(1);
        System.out.println("===while===");
        int j = 0;
        while (j < 3) {
            System.out.println(2);
            System.out.println(3);
//            j = j + 1; 아래의 j++과 같음
            j++;
        }
        System.out.println("===for===");
        for (int i = 0; i < 3; i++) {
            System.out.println(2);
            System.out.println(3);
        }

        System.out.println(4);
    }
}