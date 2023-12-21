final class FinalTest{ // 조상의 될 수 없는 클래스
    final int MAX_SIZE = 20; //값을 변경할 수 없는 상수

    final  int getMaxSize(){  //오버라이딩 할 수 없는 메서드(변경불가)
        final int LV = MAX_SIZE; // 상수
        return MAX_SIZE;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(new FinalTest().MAX_SIZE);
        System.out.println(new FinalTest().getMaxSize());
    }
}
/*출력 20
      20 */