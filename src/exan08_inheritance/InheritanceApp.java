package exan08_inheritance;

class Cal {
    public int sum(int v1, int v2) {
        return v1 + v2;
    }
}

class Cal3 extends Cal { // Cal 메소드와 변수를 모두 상속 받음

}

public class InheritanceApp {
    public static void main(String[] args) {

        Cal c = new Cal();
        System.out.println(c.sum(2, 1));

        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(3, 2));
    }
}

class Ca12 {
    public int sum(int v1, int v2) {
        return v1 + v2;
    }

    public int minus(int v1, int v2) {
        return v1 - v2;
    }
}
