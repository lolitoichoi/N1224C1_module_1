package ss5_condition;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Mời bạn nhập n ");
        int n = in.nextInt();

        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        while (fn <= n){
            System.out.println(fn + "\t");

            // cập nhat gia tri moi của f1 và f2
            f1 = f2;
            f2 = fn;

            // tính giá trị mới của fn
            fn = f1+ f2;
        }

    }
}
