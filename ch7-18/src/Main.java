class StaticTest {
    //클래스 변수
    static int width =200;
    static int height =120;

    static { //클래스 초기화 블럭
        //static 변수의 복잡한 초기화 수행
    }
    static int max(int a, int b){  //클래스 메서드
        return a > b ? a:b;
    }


}
public class Main {
    public static void main(String[] args) {
        System.out.println(StaticTest.max(StaticTest.width, StaticTest.height));
    }
}