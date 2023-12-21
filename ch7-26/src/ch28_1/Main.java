package ch28_1;

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
    // doWork 메소드 설명:
    // - Car 타입의 객체를 매개변수로 받아서 처리합니다.
    // - 만약 받은 객체가 FireEngine의 인스턴스이면, FireEngine으로 명시적 형변환 후 water 메소드를 호출합니다.
    // - 형변환이 불가능한 경우, Car 클래스의 drive 메소드를 호출합니다.
    void doWork(Car c) {
        if (c instanceof FireEngine) {
            // 1. 형변환 가능 여부 확인
            //   - 만약 객체 c가 FireEngine의 인스턴스이면, 형변환 가능
            //   - instanceof 연산자를 사용하여 확인
            FireEngine fe = (FireEngine) c;
            // 2. 형변환
            //   - 형변환 가능한 경우, FireEngine으로 명시적 형변환
            fe.water();
        } else {
            // - 형변환 불가능한 경우
            // - c는 Car 타입이며 FireEngine으로 형변환할 수 없음
            // - 따라서 Car 클래스의 drive 메소드를 호출
            c.drive();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        // 첫 번째 호출: Car 객체 전달
        // - FireEngine으로 형변환 불가능(FireEngine은 Car를 확장하지만, Car의 인스턴스보다 더 많은 멤버를 가지고 있음)
        // - 따라서 Car 클래스의 drive 메소드 호출
        main.doWork(new Car());

        // 두 번째 호출: FireEngine 객체 전달
        // - FireEngine으로 형변환 가능
        // - FireEngine 클래스의 water 메소드 호출
        main.doWork(new FireEngine());
    }
}