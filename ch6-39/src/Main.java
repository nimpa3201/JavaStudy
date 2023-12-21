/*
 1. 명시적 초기화 (= 사용)
class Car {
    int door=4;
    Engine e = new Engine();

  2. 초기화 블럭 (복잡한 초기화)
  인스턴스 초기화 블럭:{} 인스턴스 변수 초기화 (잘 안씀)
  클래스 초기화 블럭 : static {} 클래스 변수 초기화


  3.생성자
  Car(String color,String gearType, int door){
  this.color = color;
  this.gearType = gearType;
  this.door = door;

  인스턴스 변수 , 클래스 변수 초기화
  1. 자동 초기화
  2. 간단 초기화(명시적 초기화)
  3. 복잡 초기화(클래스 변수  -> static{} , 인스턴스 변수-> 생성자)

*/

class StaticBlockTest{
    static int [] arr = new int[10]; // 명시적 초기화

    static{
        for( int i=0; i <arr.length;i++){
            arr[i] = (int)(Math.random()*10)+1;
        }
    }
}


public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < StaticBlockTest.arr.length ; i++) {
            System.out.println( StaticBlockTest.arr[i]);

        }
    }
}