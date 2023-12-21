//참조변수 super

class Parent {
    int x = 10; //super.x
}
class Child extends Parent{
    void method(){
        System.out.println("x:"+x);
        System.out.println("this.x:"+this.x);
        System.out.println("super.x:"+super.x);
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}
