public class Ex8_5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);  // 예외 발생
            System.out.println(4);      // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            // 예외가 ArithmeticException인 경우
            ae.printStackTrace();
            System.out.println("예외메세지 : " + ae.getMessage());
        }  // try-catch 끝
        System.out.println(6);  // 예외 처리 후 계속 실행
    }
}