package ex7_7;

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
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        fe.water();
        car = fe; // 자손이 조상으로 형변환 하는 것은 안전 ,형변환 생략가능
        fe2 = (FireEngine) car; // 조상이 자손으로 형변환 하는 것은 위험, 생략 불가능
        fe2.water();

    }
}