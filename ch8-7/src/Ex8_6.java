public class Ex8_6 {
    public static void main(String[] args) {
        try {
            // 예외가 발생할 수 있는 코드
            riskyOperation();
        } catch (Exception | RuntimeException e) {  // 컴파일 에러 발생
            // Exception은 RuntimeException의 부모 클래스이므로 이 구문은 유효하지 않습니다.
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void riskyOperation() throws RuntimeException {
        // 이 메서드는 RuntimeException을 발생시킬 수 있음
        throw new RuntimeException("Something went wrong");
    }
}

