public class Ex8_1 { // 예외 발생하지 않았을 떄
    public static void main(String[] args) {
        System.out.println(1);

        try{
            System.out.println(2);
            System.out.println(3);
        }catch (Exception e){
            System.out.println(4);
        }// try - catch의 끝

        System.out.println(5);
    }

}
