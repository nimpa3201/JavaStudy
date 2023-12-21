//class Tv{}
//class Dvd{}
//
//class TvDvd extends Tv,Dvd{
//    //에러
//}


class Tv{
    boolean power;
    int channel =10;

    void power(){power=!power;} //전원상태 변경
    void channelUp(){++channel;} //채널 +1
    void channelDown(){--channel;} //채널 -1
}

class Dvd {
    // 멤버 변수
    boolean power;
    int channel=20;

    // 전원 상태 변경 메서드
    void togglePower() {
        power = !power;
        System.out.println("전원: " + (power ? "켜짐" : "꺼짐"));
    }

    // DVD 재생 메서드
    void play() {
        if (power) {
            System.out.println("DVD가 재생 중입니다.");
        } else {
            System.out.println("먼저 DVD 플레이어의 전원을 켜세요.");
        }
    }
}


class TvDvd extends Dvd{
    Tv tv = new Tv();
    void power(){
        tv.power();
    }
    void channelUp(){
        tv.channelUp();
    }
    void channelDown(){
        tv.channelDown();
    }

    }


public class Main {
    public static void main(String[] args) {
         TvDvd tvdvd = new TvDvd();
         tvdvd.tv.channelDown(); // Tv 객체에만 접근
         tvdvd.togglePower();    // TvDvd 객체에만 접근
        System.out.println(tvdvd.tv.channel); // Tv 객체에만 접근
        System.out.println(tvdvd.channel);    // TvDvd 객체에만 접근
    }
}