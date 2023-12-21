class Time {
    private int hour; // 시간을 나타내는 변수, 외부에서 직접 접근하지 못하도록 private으로 설정
    private int minute; // 분을 나타내는 변수
    private int second; // 초를 나타내는 변수

    // 시간(hour)을 설정하는 메서드, 외부에서 유효한 범위(0~23)의 값만 설정 가능
    public void setHour(int hour){
        // 시간이 유효한 범위인지 확인하고, 유효하지 않으면 설정을 하지 않고 리턴
        if(hour < 0 || hour > 23) {
            System.out.println("유효하지 않은 시간 값입니다. 시간은 0부터 23까지의 값이어야 합니다.");
            return;
        }
        this.hour = hour;
    }

    // 시간(hour)을 반환하는 메서드
    public int getHour(){
        return hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time();

        // 시간을 설정하고, 설정된 값을 출력
        time.setHour(10);
        System.out.println("현재 시간: " + time.getHour());

        // 유효하지 않은 값을 설정하려고 시도하면 메시지를 출력
        time.setHour(200);
        System.out.println("현재 시간: " + time.getHour());
    }
}
