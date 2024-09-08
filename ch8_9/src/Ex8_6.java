import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex8_6 {
    private static final Logger logger = Logger.getLogger(Ex8_6.class.getName());

    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생 시킴");
            throw e; // 예외 발생시킴
            //throw new Exception("고의로 발생 시킴") 한줄로 축약 가능
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            logger.log(Level.SEVERE, "An error occurred", e);
        }
        System.out.println("프로그램 정상 종료되었음");
    }
}