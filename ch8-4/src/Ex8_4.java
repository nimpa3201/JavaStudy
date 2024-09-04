public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);  // 예외 발생
            System.out.println(4);      // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            // 예외가 ArithmeticException인 경우
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            // 다른 예외가 발생한 경우
            System.out.println("Exception");
        } // try-catch 끝
        System.out.println(6);  // 예외 처리 후 계속 실행
    }
}
