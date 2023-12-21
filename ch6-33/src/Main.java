/* 생성자 = 인스턴스가 생성될 때마다 호출되는 "인스턴스 초기화 메서드"
조건
1)이름이 클래스 이름과 같아야 한다
2)리턴값 없음
3)모든 클래스는 반드시 생성자를 가져야함

생성자 종류 : 매개변수 없는 생성자 - 기본생성자
           매개변수 있는 생성자


 생성자 선언 방법
 class 이름 (타입 변수명 , 타입 변수명 , 타입 변수명 ...) {
 인스턴스 생성시 수행될 코드, 주로 인스턴스 변수의 촉화 코드 적음
 }
*/



class Data_1{  //해당 클래스는 생성자가 하나도 없기 때문에 컴파일러가 기본생성자 자동추가 해줌
    int value;
}

class Data_2{
    int value;

    Data_2() {} //해당 기본 생성자를 넣어야 37 라인에서 error 없음
    Data_2(int x){ //매개변수가 있는 생성자
        value =x;
    }
}



public class Main {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2();
    }
}