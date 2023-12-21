class Parent{
    void parentMethod(){
        System.out.println("부모클래스");
    }
}

class Child extends Parent{
    void parentMethod(){
        System.out.println("자식클래스");
    } // 오버라이딩
    void parentMethod(int i){} // 오버로딩

    void childMethod(){} //메서드 정의
    void childMethod(int i){} // 오버로딩
    // void childMethod(){} // 중복정의 , 에러
}


public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
    }
}