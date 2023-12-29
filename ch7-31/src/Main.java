abstract class Player{
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer extends Player{
    void play(int pos){/*구현부*/}
    void stop(){/* 구현부*/}
}


public class Main {
    public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
    }
}


