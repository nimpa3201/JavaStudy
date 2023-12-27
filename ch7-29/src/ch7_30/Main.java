package ch7_30; //실습

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

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] cart = new Product[10]; // 구입한 제품을 저장하기 위한 배열
    int index =0;  // cart 배열의 인덱스
    int buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족");
            return 0;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        if(cart.length <= index) //ArrayIndexOutOfBoundsExceptions나는 경우 해결
            return 0;

        cart[index++] = p;  // 제품을 Product [] cart 에 저장

        System.out.println(p + "을/를 구입하였습니다");
        return index;
    }


    void summary() {
        int sum = 0;
        String itemList = "";
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null)
                break;
            sum += cart[i].price;  // 구입한 물건 합계
            if (i == index-1)  // 구입한 물건 종류 ,ArrayIndexOutOfBoundsExceptions나는 경우 해결
                itemList += cart[i];
            else
                itemList += cart[i] + ",";

        }
        System.out.println("총 소비 금액은" + sum + "입니다");
        System.out.println("구매한 물품은" + itemList + "입니다");
    }
}


public class Main{
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.summary();
    }
}