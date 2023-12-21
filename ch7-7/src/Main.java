// 오버라이딩 예시
/*class Point {

    int x;
    int y;


    String getLocation(){
        return "x:" + x + " y:"+y;
    }
}

class Point3D extends Point{
    int z;


    //조상의 getLocation()을 오버라이딩

    String getLocation(){
        return "x:" + x + " y:"+y +" z:"+z;
    }
}

public class Main {
    public static void main(String[] args) {

        Point3D p = new Point3D();
        p.x=3;
        p.y=8;
        p.z=5;
        System.out.println(p.getLocation());
    }
}

*/





class Point {
    int x;
    int y;

    //생성자 이용하여 초기화
    Point(int x ,int y){
        this.x =x;
        this.y =y;
    }
   //Object클래의 toString()을 오버라이딩
    public String toString(){
        return "x:" + x + " y:"+y;
    }
}



public class Main {
    public static void main(String[] args) {

        Point p = new Point(2,5);
        System.out.println(p);
    }
}