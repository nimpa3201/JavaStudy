package ch7_39_3;


interface I {void methodB();}

class C implements I{
    public void methodB(){
        System.out.println("methodInB() in C");
    }
}

class A {
    public void methodB(I i){
        i.methodB();
    }
}
public class ChangeC {
    public static void main(String[] args) {
        A a = new A();
        a.methodB(new C());
    }
}
