class FirstException extends Exception {
    public void methodForFirst() {
        System.out.println("FirstException의 특별한 메서드");
    }
}

class SecondException extends Exception {
    public void methodForSecond() {
        System.out.println("SecondException의 특별한 메서드");
    }
}

public class Ex8_7 {
    public static void main(String[] args) {
        try {
            if (Math.random() < 0.5) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (FirstException | SecondException e) {
            // 공통 멤버만 사용 가능
            System.out.println("예외 메시지: " + e.getMessage());
            e.printStackTrace();

            // 다음 라인들은 컴파일 에러를 발생시킨다:
            // e.methodForFirst();  // 컴파일 에러
            // e.methodForSecond(); // 컴파일 에러

            // 개별 예외의 특정 메서드를 사용하려면 타입 체크와 캐스팅이 필요하다
            if (e instanceof FirstException) {
                ((FirstException) e).methodForFirst();
            } else if (e instanceof SecondException) {
                ((SecondException) e).methodForSecond();
            }
        }
    }
}