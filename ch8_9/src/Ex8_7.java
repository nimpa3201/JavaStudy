public class Ex8_7 {
    public static void main(String[] args) {
        try {
            throw new Exception(); // 고의로 예외 발생 컴파일에러 checked예외 (예외처리 필수)
        } catch (Exception e) {}
        }
    }

