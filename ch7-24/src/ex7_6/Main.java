package ex7_6;

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

class FireEngine extends Car{
    void water(){
        System.out.println("water!!");
    }
}


public class Main {
    public static void main(String[] args) {
        FireEngine f = new FireEngine();
        Car c = (Car) f; //자손이 조상의 타입으로 형변환 가능 , 생략 가능
        FireEngine f2 = (FireEngine) c; //조상이 자손의 타입으로 형변환 가능, 생략 불가능

        c.drive();
        f2.stop();
        f2.water();

    }
}