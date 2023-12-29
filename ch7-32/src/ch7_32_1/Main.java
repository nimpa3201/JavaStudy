package ch7_32_1;

abstract class Player{ // 추상 클래스
    abstract void play(int pos); //추상 메서드
    abstract void stop(); // 추상 메서드
}

class AudioPlayer extends Player{
    void play(int pos){/*생략 */} // 추상 메서드 구현
    void stop(){/* 생략 */} // 추상 메서드 구현
}

abstract  class AbstractPlayer extends Player{
    void play(int pos) { /* 생략 */} // 추상 메서드 구현
    /* stop 추상 메서드를 구현하지 않았기 때문에 클래스 앞에 abstract 붙여야함 */
}

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
    }
}