

class MyMath2{
    long a,b;
    MyMath2(int a, int b){
        this.a =a;
        this.b=b;

    }
    long add(){
        return a+b;
    }


    static long add (long a , long b){
        return a+b;
    }
}


public class Main {
    public static void main(String[] args) {
        MyMath2 mm = new MyMath2(2,3);
        System.out.println(mm.add());
        System.out.println(mm.add(2L,8L));
    }
}