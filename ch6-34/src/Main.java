// 매개변수가 있는 생성자


class Car{
    String color;
    String gearType;
    int door;

    Car() {}

    Car(String c ,String g ,int d){
        color = c;
        gearType =g;
        door = d;
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("white","auto",4);
        System.out.println(c);
    }
}