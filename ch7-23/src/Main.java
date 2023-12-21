class Tv{
    boolean power;
    int channel;

    void power(){power =! power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

class SmartTv extends Tv{
    String text; //자막
    void caption(){}
}


public class Main {
    public static void main(String[] args) {
        SmartTv s1  = new SmartTv(); // 1) 참조변수와 인스턴스의 타입이 일치
        Tv tv = new SmartTv();       // 2) 조상타입 참조변수로 자손타입 인스턴스 참조
        SmartTv s2 = new Tv();       // 3) 자손타입의 참조변수로 조상타입의 객체를 가리킬 수 없다
                                     // (자손의 멤버 변수가 조상 보다 많기 때문)
    }
}


    