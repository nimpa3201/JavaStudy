
public class Ex8_2 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(0 / 0); // 예외 발생
            System.out.println(2);
        } catch (ArithmeticException e) {
            System.out.println(3);
        } // try-catch 끝
        System.out.println(4);
    }
}
