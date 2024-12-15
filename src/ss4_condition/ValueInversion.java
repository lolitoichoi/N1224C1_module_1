package ss4_condition;

public class ValueInversion {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // cách 1  sử dụng biến tạm
//        int temp = a;
//        a = b;
//        b = temp;

        // cách 2 không sử dụng biến tạm

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
