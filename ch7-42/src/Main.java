class A {
    int i = 100;
    B b = new B();  // A클래스는 B클래스 사용할 수 있다.
    class B {
    void method() {
       // A a = new A();
        // System.out.println(a.i);
        System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근 가능
        }
    }
}

class C{
    B b = new B();  // C클래스는 B 클래스 사용할 수 없음
}

public class Main {
    public static void main(String[] args) {
       B b = new B(); // 외부 클래스를 먼저 생성한 다음 생성할 수 있다.
       b.method();
    }
}

