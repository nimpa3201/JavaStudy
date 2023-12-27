package ch7_29_1;  //배열로 다루지 않은 경우

class Product{
    int price;   //제품가격
    int bonusPoint; //보너스 점수

    Product(int price){
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends  Product {
    Tv() {
        super(100);
    }
}
class Computer extends  Product{
    Computer() {
        super(200);
    }
}

class Audio extends  Product{
    Audio(){
        super(50);
    }
}


public class Main {
    public static void main(String[] args) {
        Product p1 = new Tv();
        Product p2 = new Computer();
        Product p3 = new Audio();
    }
}