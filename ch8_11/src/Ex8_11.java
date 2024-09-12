import java.io.File;
import java.io.IOException;

public class Ex8_11 {

    public static void main(String[] args) {
        File file = createFile("");
        if (file != null) {
            System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다.");
        }
    }

    static File createFile(String fileName) {
        File f = null;
        try {
            if (fileName == null || fileName.equals(""))
                throw new IllegalArgumentException("파일 이름이 유효하지 않습니다");
            f = new File(fileName);
            f.createNewFile();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류가 발생했습니다: " + e.getMessage());
        }
        return f;
    }
}