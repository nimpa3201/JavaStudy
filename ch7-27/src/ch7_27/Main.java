package ch7_27;

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

class Buyer{  // 물건 사는 사람
    int money =1000; //소유 금액
    int bonusPoint =0; //보너스 점수

    void buy(Tv t){
        money -= t.price;
        bonusPoint += t.bonusPoint;
        System.out.println("Tv를 구입하셨습니다");
    }

    void buy(Computer c){
        money -= c.price;
        bonusPoint += c.bonusPoint;
        System.out.println("Computer를 구입하셨습니다");
    }

    void buy(Audio a){
        money -= a.price;
        bonusPoint += a.bonusPoint;
        System.out.println("Audio를 구입하셨습니다");
    }
}

public class Main {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Audio());
        System.out.println("남은 돈은"+ buyer.money+"입니다");
        System.out.println("현재 보너스 점수는" +buyer.bonusPoint+"입니다");
    }
}