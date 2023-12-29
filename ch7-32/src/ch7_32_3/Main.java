package ch7_32_3;


abstract class Player{ // 추상 클래스
    abstract void play(int pos); //추상 메서드
    abstract void stop(); // 추상 메서드
}

class AudioPlayer extends Player {
    void play(int pos){
        System.out.println(pos +"위치부터 play 합니다");
    } // 추상 메서드 구현
    void stop(){
        System.out.println("재생을 멈춥니다");
    } // 추상 메서드 구현
    void fast(){
        System.out.println("빨리 실행 중");
    }
}


public class Main{
    public static void main(String[] args) {
        System.out.println("자손 클래스 객체)");
        AudioPlayer ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
        ap.fast();
        System.out.println();
        System.out.println("부모 클래스 객체)");
        Player p = new AudioPlayer(); // 다형성 때문에 가능
        p.play(20);
        p.stop();
        //p.fast(); 에러

    }
}