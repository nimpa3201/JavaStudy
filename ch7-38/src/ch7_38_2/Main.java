package ch7_38_2;



abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춥니다.");
    }
}

interface Fightable{
    void move(int x, int y); //public abstract 생략됨
    void attack(Fightable f); //public abstract 생략됨
}


class Fighter extends Unit implements Fightable {
    //오버라이딩 규칙 : 조상(public)보다 접근제어자 범위가 좁으면 안된다. 따라서 public이어야한다.
    public void move(int x, int y) {
        System.out.println("(" + x + "," + y + ")로 이동");
    }

    public void attack(Fightable f) {
        System.out.println(f + "를 공격");
    }
    @Override
    public String toString() {
        return "Fighter";
    }
}
public class Main {
    public static void main(String[] args) {
        Unit u = new Fighter();
        u.move(10,20);
        u.stop();
    //  u.attack(new Fighter()); Unit에는 attack 없어서 호출 불가능
        System.out.println("--------");
        Fightable fightable = new Fighter();
        fightable.move(100,200);
        fightable.attack(new Fighter());
    //  fightable.stop() fightable에는 stop 없어서 호출 불가능
        System.out.println("--------");
        Fighter fighter = new Fighter();
        fighter.move(300,500);
        fighter.attack(new Fighter());
        fighter.stop();


    }
}