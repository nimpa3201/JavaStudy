//static 메소드는 인스턴슨 변수(iv)를 사용할 수 없음

class TestClass{
    int iv;  // 인스턴스 변수 (객체 생성 후 사용 가능)
    static int cv;  // 클래스 변수(언제나 사용가능 바로 메모리에 올라감)


    void instanceMethod(){
        System.out.println(iv);
        System.out.println(cv);
    }

    static void staticMethod(){

        //System.out.println(iv);
        System.out.println(cv);

        TestClass tc = new TestClass();
        System.out.println(tc.iv);
    }

}















public class Main {
    public static void main(String[] args) {
        TestClass.staticMethod();
        TestClass tc = new TestClass();
        tc.instanceMethod();


    }
}