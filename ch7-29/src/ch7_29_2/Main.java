package ch7_29_2; // 객체 배열로 다루기

class Product{
    int price;   //제품가격
    int bonusPoint; //보너스 점수

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";}
}

class Audio extends Product {
    Audio(){
        super(50);
    }
    public String toString() {
        return "Audio";}
}


public class Main {
    public static void main(String[] args) {

        Product [] p  = new Product[3];
        p[0] = new Tv();
        p[1] = new Computer();
        p[2] = new Audio();

        System.out.printf("%s,%s,%s",p[0],p[1],p[2]);

    }
}