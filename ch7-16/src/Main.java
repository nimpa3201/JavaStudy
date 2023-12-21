 /*은 모든 static 변수와 static 메서드 의미
 import static java.lang.Integer.*; // Integer 클래스의 모든 static 메서드
 import static java.lang.Math.random; //Math.random만 의미
 import static java.lang.System.out; // System.out을 out으로만 참조가능 */

 import static java.lang.System.out;
 import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.random());
        out.println(random());  // 정적 임포트를 사용하여 out 필드 직접 사용,Math 클래스의 random 메서드를 클래스 이름 없이 직접 사용

        System.out.println("Math PI:" + Math.PI );
        out.println("Math PI:" + PI);  // 정적 임포트를 사용하여 out 필드 직접 사용, Math 클래스의 정적 메서드와 상수를 클래스 이름 없이 직접 사용
    }
}