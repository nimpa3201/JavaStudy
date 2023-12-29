package ch7_32_2;

abstract  class Player{
    boolean pause;  // 일시정지 상태를 저장하기 위한 변수
    int currentPos; // 현재 play 되고 있는 위치를 저장하기 위한 변수

    Player(){       // 추상 클래스도 생성자 필요!
        pause = false;
        currentPos =0;
    }


    /* 지정된 위치 (pos)에서 재생을 시작하는 기능을 수행해야 한다 */
    abstract void play (int pos); // 추상메서드

    /* 재생을 즉시 멈추는 기능을 수행해야 한다 */
    abstract void stop(); // 추상 메서드

    void play(){  // 인스턴스 메서드
        play(currentPos);  // 선언부만을 통해 추상 메서드 호출 할 수 있다.
    }
}

/* 상속을 통해 자손 완성 -> 자손 객체 생성
ex) DvdPlayer d = new DvdPlayer();
    d.play(); 가능
 */