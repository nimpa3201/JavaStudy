class Ex7_12{
    class InstanceInner{
        int iv = 100;
        // static int cv =100; 에러 static 변수 선언 불가능
        final static int CONST = 100; // final static 은 상수이므로 허용
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 200;        //static 클래스만 static멤버 정의 가능

    }

    void myMethod(){
        class LocalInner{ // 지역 내부 클래의 static 상수는 메서드 내에서만 사용가능
            int iv =300;
            //  static int cv = 300;     static 변수 선언 할 수 없음
            final static int CONST = 300; //final static 은 상수이므로 허용
        }

        int i = LocalInner.CONST ; // 가능 
    }


}