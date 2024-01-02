interface Fighterable extends Movable,Attackable{}

abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){/* 현재 위치에서 정지*/}
}

interface Movable{
    /* 지정된 위치로( x,y)로 이동하는 기능의 메서드 */
    void move(int x, int y);

        }
interface Attackable{
    /* 지정된 대상(u)을 공격하는 기능의 메서드 */
    void attack(Unit u);
}
public class Main {
    public static void main(String[] args) {
        System.out.println("인터페이스 상속");
    }
}