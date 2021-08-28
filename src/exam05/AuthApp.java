package exam05;

public class AuthApp {
    public static void main(String[] args) {

        String id = "flow";
        String inputId = args[0]; // flow

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("Hi.");

//        if (inputId == id) {
//        if (inputId.equals(id)) {
//            if (inputPass.equals(pass)) {
//                System.out.println("Master!");
//            } else {
//                System.out.println("Wrong password!");
//            }
//        } else {
//            System.out.println("Who are you?");
//        }

        // 위 코드보다 훨씬 간단
        if (inputId.equals(id) && inputPass.equals(pass)) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
