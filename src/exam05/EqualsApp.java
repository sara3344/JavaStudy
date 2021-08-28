package exam05;

public class EqualsApp {
    public static void main(String[] args) {

        String o1 = "java";
        String o2 = new String("java");

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));


    }
}
