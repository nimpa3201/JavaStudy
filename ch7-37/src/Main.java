interface Fightable {
    public void move(int x, int y);
    public void attack(Unit u);
}

abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
}



// 인터페이스의 일부만 구현하는 경우
abstract class Fighter implements Fightable {
    public void move(int x, int y) { /* 내용생략 */}
}



// 인터페이스의 일부만 구현하는 경우
//abstract class Fighter implements Fightable {
//    public void move(int x, int y) { /* 내용생략 */}
//    public abstract void attack(Unit u) ;
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("인터페이스의 일부 구현");
    }
}