package ss5_condition;

import java.util.Scanner;

public class Lession11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("moi ban nhap so nguyen duong");
        int n = sc.nextInt();


        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.printf("%d Day la so nguyen to ", n);
        } else {
            System.out.printf("%d Day khong phai la so nguyen to", n);
        }


    }
}
