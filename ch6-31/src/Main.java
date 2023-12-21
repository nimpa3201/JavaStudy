//오버로딩이란 ? 한 클래스 안에 같은 이름의 메서드를 여러개 정의하는 것

/*오버로딩이 성립하는 조건
1. 클래스 안에 메서드 이름이 같아야 한다.
2.매개변수는 개수 또는 타입이 달라야 한다 (또는 중요)
3.반환 타입은 영향이 없다
 */



class MyMath{
    static int add(int a, int b){
        return a+b;
    }

   static long add(int a,int b){
        return (long) (a+b);
    }

    static long add(long a, long b){
        return a+b;
    }

    static long add(long a, int b){
        return a+b;
    }

    static long add(int x, long y) {
        return x + y;
    }





   static int add(int[] a){
        int result =0;
        for(int i =0;i<a.length;i++){
            result += a[i];
        }
    return result; }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(MyMath.add(100,200L));

        System.out.println(MyMath.add(100L,200L)); //static 메소드 객체 생성 X


        MyMath mm0 = new MyMath(); //static 메소드 객체 생성 o
        int[] arr ={100,200,300} ;
        System.out.println(mm0.add(arr));

        System.out.println(MyMath.add(new int[] {10, 20, 30})); //static 메소드 객체 생성 x



        MyMath mm1 = new MyMath();
        System.out.println(mm1.add(5,6L)); //static 메소드 객체 생성 0


    }
}