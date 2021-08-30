package exam06_method;

class Print {
    public String delimiter;

    public void a() { // static을 뺌
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }

    public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("c");
        System.out.println("c");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
//        Print.a("-"); // 메소드가 class의 소속일 때는 static이 있어야 해
//        Print.b("-");

        // instance - 프린트라는 클래스의 인스턴스인 t1
        Print t1 = new Print();
        t1.delimiter = "*";
        t1.a();
        t1.b();
        Print.c("$");

//        Print.a("*");
//        Print.b("*");

        Print t2 = new Print();
        t2.delimiter = "-";
        t2.a();
        t2.b();
    }
}
