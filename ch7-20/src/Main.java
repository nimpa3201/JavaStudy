abstract class AbstractTest{ //추상 클래스(추상 메서드를 포함한 클래스)
    abstract void move(); //추상 메서드(구현부가 없는 메서드)
}

class Car extends AbstractTest {
    void move(){
        System.out.println("go to home");
    }
}


public class Main {
    public static void main(String[] args) {
        AbstractTest abstractTest = new Car();
        abstractTest.move();
    }
}

//abstract class Animal {
//    abstract void makeSound();
//}
//
//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Bark!");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal myDog = new Dog(); // 추상 클래스의 인스턴스를 생성하지 않고, 서브클래스의 객체를 생성
//        myDog.makeSound(); // Dog 클래스에서 구현한 메서드 호출
//    }
//}
