package ss5_condition;

import java.util.Scanner;

public class Lession14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*      SỐ nguyên tố

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
*/

/*         số đối xứng
        int n = 12021;

        String string = String.valueOf(n);
        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                System.out.println("Khong phai so doi xung");
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("La so doi xung");
        }

 */

        // Kiểm tra các số có tăng dần không

        System.out.println("Mời ban nhap so :");
        int n = sc.nextInt();

        String string = String.valueOf(n);
        boolean isString = true;

        for (int i = 0; i < string.length() - 1; i++) {
            if(string.charAt(i) >= string.charAt(i + 1)) {
                isString = false;
                break;
            }
        }
        if(isString) {
            System.out.println("Day la so tang dan");
        } else {
            System.out.println("Day khong phai so tang dan");
        }

    }
}
