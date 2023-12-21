
/* ch6-28 static을 언제 붙여야 할까 ?

1) 속성 변수(멤버 변수) 중에서 공통 속성에만 static 을  붙인다.

kind,number는 카드 마다 개별 속성을 갖는다. -> 인스턴스 변수

width,height는 카드 클래스의 공통 속성이므로 static을 붙인다 -> class 변수

*/

class Card{   // 멤버변수 중에서 static을 붙이는 경우 예시
    String kind; // 무늬 (iv)
    int number; //숫자 (iv)


    static int width =100 ; //폭 (cv)
    static int height=250;  //높이 (cv)
}

/* 인스턴스 멤버 (iv,im)을 사용하지 않는 메서드에 static을 붙인다. */


class MyMath{
    long a, b;  // 멤버 변수 클래스 변수 x , 인스턴스 변수
        long add()  { return  a+b; }  // 멤버변수 활용

    static long add (long a, long b){ return a+b;} // 지역변수 활용



}


public class Main {
    public static void main(String[] args) {

        MyMath.add(100L,200L); // static 메소드는 객체생성 없이 참조변수.메서드이름()으로 사용 가능

        MyMath mm = new MyMath();
        mm.a = 500L;
        mm.b = 300L;
        System.out.println( "static 메소드 결과 입니다 "+ MyMath.add(100L,200L));
        System.out.println("인스턴스 메소드 결과 입니다 " + mm.add());


    }
}