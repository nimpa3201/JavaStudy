interface playingCard{
    public static final int SPACE =4;  /* 4개의 상수 모두 public static final int 생략,
                                       인터페이스에서 예외 없음*/
    final int DIAMOND =4;
    static int HEART=2;
    int CLOVER=1;

    public abstract String getCardNumber();
    String getCardkind(); // public abstract 생략 (인터페이스의 모든 메서드는 public이고 abstract이다.)
}


public class Main {
    public static void main(String[] args) {
        System.out.println("인터페이스");
    }
}