class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        //  return this == obj ; 주소비교 ,서로 다른 객체는 항상 거짓
        // 참조변수의 형변환 전에는 반드시 instanceof로 확인해야함

        if (!(obj instanceof Value)) return false;

        Value v = (Value) obj;
        return this.value == v.value;
    }
}

public class Ex9_2 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        System.out.println(v1.equals(v2)); //true

    }
}