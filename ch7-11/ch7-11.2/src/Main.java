class Point {
    int x;
    int y;

    Point(){ //기본 생성자 작성
    }

    String getLocation(){
        return "x:" + x + " y:"+y;
    }
}

class Point3D extends Point{
    int z;
    Point3D(int x, int y ,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }


    String getLocation(){
        return "x:" + x + " y:"+y +" z:"+z;
    }
}

public class Main {
    public static void main(String[] args) {

        Point3D p = new Point3D(8,5,3);
        System.out.println(p.getLocation());

    }
}
