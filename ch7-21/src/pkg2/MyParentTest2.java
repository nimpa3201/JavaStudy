package pkg2;
import pkg1.MyParent;

class MyChild extends MyParent {
    public void printMember() {
        //System.out.println(prv);
        //System.out.println(dft);
        System.out.println(prf); // 다른 패키지 자손 접근 가능
        System.out.println(pub);
    }
}
public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
        //System.out.println(p.prv);
        //System.out.println(p.dft);
        //System.out.println(p.prf);
        System.out.println(p.pub); // 접근 제한 없음

    }

}
