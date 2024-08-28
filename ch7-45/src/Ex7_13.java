public class Ex7_13 {
    // 인스턴스 멤버 -> static 멤버 사용 가능
    // 역은 불가능
    class InstanseInner{}
    static class StaticInner{}

    InstanseInner iv = new InstanseInner(); // 인스턴스 멤버끼리 접근 가능
    StaticInner cv = new StaticInner(); // static 멤버끼리 접근 가능

    static void staticMethod(){  //static 메서드
       // InstanseInner obj1 = new InstanseInner(); static 멤버는 인스턴스 멤버에게 직접 접근 불가능
        StaticInner obj2 = new StaticInner();

        Ex7_13 outer = new Ex7_13(); //인스턴스 멤버에게 접근하려면 외부 클래스를 먼저 생성해야한다.
        Ex7_13.InstanseInner obj3 =outer.new InstanseInner();
    }

    void instanceMethod(){  // 인스턴스 메서드에서는 인스턴스 멤버와 static멤버에 모두 접근 가능
        InstanseInner obj1 = new InstanseInner();
        StaticInner obj2 = new StaticInner();

    }

    void myMethod(){
        class LocalInner{} //지역 내부 클래스는 메서드 안에서만 사용가능
        LocalInner lv = new LocalInner();
    }




}
