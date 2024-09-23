class SpaceException1 extends Exception {
    public SpaceException1(String message) {
        super(message);
    }
}

// 메모리 부족 예외 (Unchecked)
class MemoryException extends RuntimeException {
    public MemoryException(String message) {
        super(message);
    }
}

// 설치 클래스
public class Installer {
    public void startInstall() throws SpaceException1 {
        // 디스크 공간 부족 예외 발생
        throw new SpaceException1("디스크 공간이 부족합니다.");

        // 메모리 부족 예외 발생 (Unchecked)
        // throw new MemoryException("메모리가 부족합니다.");
    }

    public static void main(String[] args) {
        Installer installer = new Installer();
        try {
            installer.startInstall();
        } catch (SpaceException1 e) {
            System.out.println("체크된 예외 발생: " + e.getMessage());
        }

        // 메모리 부족 예외는 Unchecked 예외이므로 따로 처리하지 않아도 됩니다.
        throw new MemoryException("메모리가 부족합니다.");
    }
}