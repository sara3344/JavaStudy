package exam05;
// 생활코딩 제어문 실습
public class ArrayApp {
    public static void main(String[] args) {
        String[] users = new String[3];
        users[0] = "woo";
        users[1] = "mina";
        users[2] = "nara";

        System.out.println(users[0]);
        System.out.println(users[1]);
        System.out.println(users[2]);
        System.out.println("length: " + users.length); //3칸짜리 배열이다

        int[] scores = {100, 90, 90};
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println("length: " + scores.length);
    }
}
