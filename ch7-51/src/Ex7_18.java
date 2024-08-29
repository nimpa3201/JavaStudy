import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ex7_18 {

    public static void main(String[] args) {
        Button b = new Button("start");

        b.addActionListener(new ActionListener() { // 익명 클래스 정의와 인스턴스 생성
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}
