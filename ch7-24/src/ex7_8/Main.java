package ex7_8;

class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive,brrr~");
    }
    void stop(){
        System.out.println("stop!!");
    }
}

class FireEngine extends Car {
    void water(){
        System.out.println("water!!");
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        FireEngine fe = (FireEngine)car; // 형변환 실행 에러 java.lang.ClassCastException 발생
        fe.drive(); //컴파일 ok.
    }
}