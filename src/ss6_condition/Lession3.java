package ss6_condition;

import java.util.Scanner;

public class Lession3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap: ");
        int n = in.nextInt();

        System.out.println("Cau a: " + cauA(n));
        System.out.println("Cau b: " + cauB(n));
        System.out.println("Cau c: " + cauC(n));
        System.out.println("Cau d: " + cauD(n));
        System.out.println("Cau e: " + cauE(n));

    }

    public static int cauA (int n) {
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += i;
        }
        return sum;
    }


    public static int cauB (int n) {
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static double cauC (int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1.0/i;
        }
        return sum;
    }

    public static double cauD (int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum *= i;
        }
        return sum;
    }


    public static int cauE (int n) {
        int tong = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            tong += 1;
            sum *= tong;
        }
        return tong;
    }
}
