package ss6_condition;

import java.util.Scanner;

public class Lession4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap a: ");
        int a = in.nextInt();

        System.out.println("Moi ban nhap b: ");
        int b = in.nextInt();

        System.out.println("Uoc chung lon nhat la: " + uocSo(a,b));

    }


    public static int uocSo (int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if( max % min == 0 ) {
            return min;
        }
        for (int i = min / 2; i >= 1 ; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
