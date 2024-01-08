package ch7_39_1;

/*
class B {
    public void method(){
        System.out.println("methodInB");
    }
}
*/
 // 인터페이스 사용

interface I{
    public void method();
}

class B implements I{
    public void method(){
        System.out.println("methodInB");
    }
}
