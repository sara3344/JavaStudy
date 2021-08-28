package exam05;

public class LoopArray {
    public static void main(String[] args) {
        /*
            <li> woo </li>
            <li> mina </li>
            <li> nara </li>
         */
        String[] users = new String[4];
        users[0] = "woo";
        users[1] = "mina";
        users[2] = "nara";
        users[3] = "min";

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }
}
