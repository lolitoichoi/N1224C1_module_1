package ss6_condition;

import java.util.Scanner;

public class Lession2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap vao mot so :");
        int n = in.nextInt();

        System.out.println("So dao" + soDao(n));

        if (soChinhPhuong(n)) {
            System.out.println("so chinh phuong" + n);
        } else {
            System.out.println("khong phai so chinh phuong" + n);
        }

        if (doiXung(n)) {
            System.out.println("so chinh phuong" + n);
        } else {
            System.out.println("khong phai so chinh phuong" + n);
        }

        if (soNguyenTo(n)) {
            System.out.printf("%d la so nguyen to ", n);
        } else {
            System.out.printf("%d khong phai la so nguyen to", n);
        }

        System.out.println("Tong cac so chinh phuong " + tongSoChinhPhuong(n));

        System.out.println("Tong cac so nguyen to " + tongSoNguyenTo(n));

    }

    public static int soDao(int n) {
        String str = String.valueOf(n); //"123"

        StringBuilder strD = new StringBuilder(n);
        for (int i = str.length() - 1; i >= 0; i--) {
            strD.append(str.charAt(i));
        }
        return Integer.parseInt(strD.toString());
    }

    // doi xung
    public static boolean doiXung(int n) {
        return soDao(n) == n;
    }

    // so chinh phuong
    public static boolean soChinhPhuong(int n) {    // n = 5
        int canBac2 = (int) Math.sqrt(n); // sqrt 5 = 2.2 (int) canBac2 = 2
        return canBac2 * canBac2 == n;  // 2 * 2 = 4
    }

    public static int tongSoChinhPhuong(int n) {
        int tong = 0;
        while (n != 0) {
            int doV1 = n % 10;
            if (doV1 == 0) {
                System.out.println(doV1);
            }
            n = n / 10;
        }
        return tong;
    }

    public static boolean soNguyenTo (int n) {

        boolean soNguyenTo = true;

        if (n < 2 ){
            soNguyenTo = false;
        }
        for (int i = 2; i <= n; i++) {
            if(n % i == 0){
                soNguyenTo = false;
                break;
            }
        }
        return soNguyenTo;
        
    }

    public static int tongSoNguyenTo(int number) {
        int tongNT = 0;

        while (number != 0) {
            int digit = number % 10;
            if(digit == number){
                tongNT += digit;
            }
            number = number / 10;
        }
        return tongNT;
    }
}
