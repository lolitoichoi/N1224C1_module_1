package ss5_condition;

import java.util.Scanner;

public class LessionEightAndNine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Mời bạn nhap n :");
        int n = in.nextInt();

//         bài 8
//        int a = 1;
//
//        while (a <= n) {
//            System.out.println(a);
//
//            a = 2 * a + 1;
//        }
        // bài 9
        int a = 1;
        int d = 1;

        while (a <= n) {
            System.out.println(a * d);

            a = 2 * a + 1;
            d = -d;
        }

    }
}
