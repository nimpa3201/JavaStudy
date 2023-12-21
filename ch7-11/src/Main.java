//super() - 조상의 생성자

class Point extends Object{
    int x,y;

    Point(){
        this(0,0); // 생성자 호출
    }
    Point(int x, int y){
        super(); //Object 생성자 호출
        this.x=x;
        this.y=y;
    }
}

class Point3D extends Point{
    int z;
    Point3D(int x, int y , int z){
        super(x,y); // 조상 클래스의 생성자 Point(int x, int y) 호츨
        this.z=z;   // 자신의 멤버 초기화
    }
}


public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2,3,4);
        System.out.println(point3D.x);
        System.out.println(point3D.y);
        System.out.println(point3D.z);

    }
}

