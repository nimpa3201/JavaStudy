class Point{
    int x;
    int y;
}
class Circle  {
    Point p = new Point(); //원점
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.p.toString());

    }
}