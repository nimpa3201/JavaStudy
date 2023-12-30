
abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){/* 현재 위치에서 정지*/}
}



class Marine extends Unit{
    void move(int x, int y){
        System.out.println("Marine의 좌표:  x= " +x +" y= "+y);
    }
    void stimPack(){/* 스팀팩을 사용한다 */}
}

class Tank extends Unit {
    void move(int x, int y){
        System.out.println("Tank의 좌표: x= " +x +" y= "+y);}
    void changeMode(){/* 공격 모드를 변경한다 */}

}

class DropShip extends Unit {
    void move(int x, int y){
        System.out.println("DropShip의 좌표: x= " +x +" y= "+y);
    }
    void load(){/* 선택된 대상 태운다 */}
    void unload(){/* 선택된 대상 내린다 */}
}



public class Main {
    public static void main(String[] args) {
        Unit [] group = {new Marine(),new Tank(),new DropShip()};
        for (Unit unit : group) {
            unit.move(100, 200);
        }
    }
}


