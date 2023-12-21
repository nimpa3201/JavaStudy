package pkg1;

public class MyParent{
    private   int prv; //같은 클래스
              int dft; // 같은 패키지
    protected int prf; // 같은 패키지 + 자손 (다른 패키지)
    public    int pub; //접근제한 없음

    public void printMember(){  // 같은 클래스
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prf);
        System.out.println(pub);
    }
}



class MyParentTest {
    public static void main(String[] args) {  // 다른 클래스
        MyParent p = new MyParent();
       // System.out.println(p.prv); //private 변수 접근 불가능
        System.out.println(p.dft);   // 같은 패키지 접근 가능
        System.out.println(p.prf);
        System.out.println(p.pub);
    }
}
