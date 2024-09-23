// SpaceException 정의
class SpaceException extends Exception {
    public SpaceException(String message) {
        super(message);
    }
}

// InstallException 정의
class InstallException extends Exception {
    public InstallException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Main1 {
    public static void main(String[] args) throws InstallException {
        try {
            // 원인 예외 SpaceException 발생
            throw new SpaceException1("디스크 공간이 부족합니다.");
        } catch (SpaceException1 e) {
            // SpaceException을 원인으로 InstallException 발생
            throw new InstallException("설치 실패", e);
        }
    }
}