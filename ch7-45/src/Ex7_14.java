public class Ex7_14 {
    private int outerIv =0;
    private static int outerCv =0;

    class InstanceInner{
        int iiv = outerIv ; // 1. 외부 클래스의 private 멤버에도 접근 가능하다.
        int iiv2 = outerCv;
    }

    static class StaticInner{
       // int siv = outerIv 스테틱 클래스는 외부 클래스의 인스턴스에 접근 불가능
        static int scv = outerCv;
    }


    void myMethod(){
        int lv = 0; // 값이 바뀌지 않는 변수는 상수로 간주
        final int Lv =0; //JDK1.8부터 final 생략가능

        class LocalInner{ // 2. 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 =lv;
            int liv4 = Lv;
        }
    }




}
