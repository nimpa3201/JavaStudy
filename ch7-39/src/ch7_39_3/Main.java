//package ch7_39_3; //인터페이스 사용
//
//interface I {void methodB();}
//
//class B implements I{
//    public void methodB(){
//        System.out.println("methodInB()");
//    }
//}
//
//class A {
//    public void methodB(I i){
//        i.methodB();
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        A a = new A();
//        a.methodB(new B());
//    }
//}
