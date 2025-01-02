package Test;

import java.util.Scanner;

public class Ls1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap chieu dai: ");
        int chieuDai = sc.nextInt();

        System.out.println("Moi ban nhap chieu rong: ");
        int chieuRong = sc.nextInt();

        for (int i = 1; i <= chieuDai; i++) {
            for (int j = chieuRong; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
