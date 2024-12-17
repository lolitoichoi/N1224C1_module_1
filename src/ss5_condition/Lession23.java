package ss5_condition;

import java.util.Scanner;

public class Lession23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 10; i <= 99; i++) {

            int hangChuc = i / 10;   // lay chu so hang chuc
            int hangDonVi = i % 10;  // lay chu so hang don vi

            int tong = hangChuc + hangDonVi;
            int tich = hangChuc * hangDonVi;

            if (tich == 2 * tong) {
                System.out.println("Tich 2 chữ số bằng 2 lần tổng số là : " + i);
            }
        }
    }
}
