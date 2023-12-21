package ch28_2;

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
        FireEngine fe = new FireEngine(); //가능
        Object obj = (Object)fe; //가능
        Car car =(Car)fe; //가능
        fe = (FireEngine)car; // 가능
        car = new Car();
        obj = (Object) car;//가능
        fe = (FireEngine)car; //ClassCastException 오류 , 형변환 불가능
                              // (실제 인스턴스 클래스의 멤버 개수가 형변환 대상 객체의 클래스 멤버 개수보다 작기때문)


    }
}