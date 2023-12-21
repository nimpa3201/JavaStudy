/* 지역변수(lv)는 수동 초기화 해야함
멤버변수(iv,cv)는 자동 초기화된다.
 */

class InitTest{
    int x;
    int y;

    void method1(){
        int i;
       // int j=i;  지역변수 이므로 수동으로 초기화 안해줘서 에러남
    }

    void method2(){
        int i=10;
        int j=i;
        System.out.println(j); // 지역변수를 수동으로 만들어봄
    }
}


public class Main {
    public static void main(String[] args) {
        InitTest it = new InitTest();
        System.out.println(it.x); // 인스턴스 변수이므로 기본값으로 초기화
        it.method2(); //method1 고쳐봄
    }
}