public class Ex8_9 {
    public static void main(String[] args) throws Exception {
        method1();   // 같은 클르새내의  stati 멤버이므로 객체 생성 없이 직접 호출가능
    } // 메인 메서드끝


    static void method1() throws Exception{
        method2();
    } // method1 끝

    static void method2() throws Exception{
        throw new Exception();
    }  // method2 끝

}

//JVM 예외 발생할 당시 호출 스택 상황 그대로 담음  예외 처리한게 아니라 예외를 떠넘김 .. try - catch문이 있어야 예외 처리 가생