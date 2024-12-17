package ss5_condition;

import java.util.Scanner;

public class Lession22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap a: ");
        int a = sc.nextInt();

        System.out.println("Moi ban nhap b ( b > a): ");
        int b = sc.nextInt();

        int tongDoiXung = 0;
        int soLuongDoiXung = 0;


        for (int n = a; n <= b; n++) {

            String string = String.valueOf(a);
            boolean flag = true;
            for (int i = 0; i < string.length() / 2; i++) {
                if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                tongDoiXung += n;
                soLuongDoiXung++;
            }

            /* kiem tra so chinh phuong */
            if (Math.sqrt(n) % 1 == 0) {
                tongDoiXung += n;
                soLuongDoiXung++;
            }

            /* kiem tra so nguyen to */
            boolean isPrime = true;
            if (n % 2 == 0) {
                if (n < 2) {
                    isPrime = false;
                }
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    tongDoiXung += n;
                    soLuongDoiXung++;
                }
            }
        }

        System.out.printf("Tong doi xung [%d, %d]: %d\n", a, b, tongDoiXung);
        System.out.printf("So luong doi xung [%d, %d]: %d\n", a, b, soLuongDoiXung);
        System.out.printf("Tong chinh phuong [%d, %d]: %d\n", a, b, tongDoiXung);
        System.out.printf("So luong chinh phuong [%d, %d]: %d\n", a, b, soLuongDoiXung);
        System.out.printf("Tong so nguyen to [%d, %d]: %d\n", a, b, tongDoiXung);
        System.out.printf("So luong so nguyen to [%d, %d]: %d\n", a, b, soLuongDoiXung);
    }
}
