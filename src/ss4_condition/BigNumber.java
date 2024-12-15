package ss4_condition;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Mời bạn nhập a :");
        int a = in.nextInt();

        System.out.println("Mời bạn nhập b :");
        int b = in.nextInt();

        int max, min;

        if (a < b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        System.out.println("So lon nhat la :" + max);
        System.out.println("So nho nhat la :" + min);

        // cach 2 dung toan tu 3 ngoi

//        int max = (a > b) ? a : b;
//        int min = (a < b) ? a : b;
//
//        System.out.println("So lon nhat la :" + max);
//        System.out.println("So nho nhat la :" + min);
    }
}




