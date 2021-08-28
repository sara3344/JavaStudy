package exam05;

public class AuthApp3 {
    public static void main(String[] args) {
//        String[] users = {"woo", "mina", "min"};
        String[][] users = {
                {"woo", "1111"},
                {"mina", "2222"},
                {"min", "3333"}
        };
        String inputId = args[0]; // woo
        String inputPass = args[1]; // 1111

        boolean isLogined = false;
        for (int i = 0; i < users.length; i++) {
            String[] current= users[i];
            if (
                    current[0].equals(inputId) &&
                    current[1].equals(inputPass)
            ) {
                isLogined = true;
                break; // 일치하면 반복문 끝내버려려
            }
       }
        System.out.println("Hi,");
        if (isLogined) {
            System.out.println("Master!!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
