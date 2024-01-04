package ch7_38_1;

interface Fightable{
    void move(int x, int y);
    void attack(Fightable f); // 인터페이스 타입 매개변수는 인터페이스르 구현한 클래스의 객체만 가능 즉, Fighter만 가능
}

class Unit{
    // 생략
}

class Fighter extends Unit implements Fightable{

    public void move(int x, int y) {
        System.out.println("move");
    }
    public void attack(Fightable f) {
        System.out.println("attack");
    }
}

public class Main {
    public static void main(String[] args) {
        Unit u = new Fighter();
        Fightable f= new Fighter(); //인터페이스형 참조변수 f는 Fighter 클래스멤버 중 move,attack만 사용가능
        f.move(100,200);
        f.attack(new Fighter());

    }
}