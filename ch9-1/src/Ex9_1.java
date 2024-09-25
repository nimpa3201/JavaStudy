class Count{
    int Count;

    Count(int Count){
        this.Count =Count;
    }
}


public class Ex9_1 {
    public static void main(String[] args) {
        Count v1 = new Count(10);
        Count v2 = new Count(10);

        System.out.println(v1.equals(v2)); //false 반환

    }
}