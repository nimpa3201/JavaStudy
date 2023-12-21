class  Car{
    String color;
    String gearType;
    int door;


    Car(){
        this("white","auto",5);
    }
    Car(String c , String g, int d){
        color =c;
        gearType=g;
        door =d;
    }


    @Override
    public String toString() {
        return "Car [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
    }
}


public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c);
    }
}