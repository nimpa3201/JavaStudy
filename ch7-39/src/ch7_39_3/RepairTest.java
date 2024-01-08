package ch7_39_3;

interface Repairable {
    // 수리 메소드
    void repair();
}

class Unit implements Repairable {
    public static final int MAX_HP = 100;
    private int hitPoint;

    public Unit() {
        this.hitPoint = 30;
    }

    @Override
    public void repair() {
        while (hitPoint < MAX_HP) {
            hitPoint++;
        }

    }

    public int getHitPoint(){
        return hitPoint;
    }
}
public class RepairTest {
    public static void main(String[] args) {
        Unit damagedUnit = new Unit();
        System.out.println("수리 전 체력: " + damagedUnit.getHitPoint());

        repair(damagedUnit);

        System.out.println("수리 후 체력: " + damagedUnit.getHitPoint());
    }

    static void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit) r;
            u.repair();
        }
    }
}

