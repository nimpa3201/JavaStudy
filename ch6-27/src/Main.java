

class MyMath2{
    long a,b ;  // 인스턴스 변수 (iv)
    long add() {   // 인스턴스 메소드 (iv 사용)
        return a+b;
    }

    static long add (long a, long b){ // static 메소드 (iv 사용 x)
        return a+b; //지역 변수
    }
}




public class Main {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(100L,300L));

        MyMath2 mm = new MyMath2(); // 인스턴스 생성
        mm.a = 100L;
        mm.b =200L;
        System.out.println(mm.add());

    }
}