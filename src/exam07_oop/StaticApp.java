package exam07_oop;

class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";

    public static void classMethod() {
        System.out.println(classVar); // ok
//        System.out.println(instanceVar); // error
    }

    public void instanceMethod() {
        System.out.println(classVar); // ok
        System.out.println(instanceVar); // ok
    }
}

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar); // ok
//        System.out.println(Foo.instanceVar); // error 인스턴스는 인스턴스 사용을 위해서 고안된 변수다
        Foo.classMethod();
//        Foo.instanceMethod(); // 인스턴스 소속이기 때문에 클래스를 통해서 접근하는 건 금지

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var

        f1.classVar = "changed by f1"; // changed by f1
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar); // changed by f1

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance var
    }
}