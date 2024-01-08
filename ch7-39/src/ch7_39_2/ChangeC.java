package ch7_39_2;
class A{
    public void method(C b){
        b.methodB();
    }
}

class C{
    public void methodB(){
        System.out.println("methodC()");
    }
}


public class ChangeC {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C());

    }
}
