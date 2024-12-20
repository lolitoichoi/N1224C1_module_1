package ss6_condition;

import java.util.Scanner;

public class Lession5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap so: ");
        int n = in.nextInt();

        System.out.println("Day so Fibonasi la: ");
        soFibonasi(n);

    }

    public static void soFibonasi (int n) {

        int f1 = 0, f2 = 1, fn = 1;
        for (int i = 2; i <= n; i++) {
            System.out.print(fn + "\t");

            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
}
