package ss4_condition;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Moi ban nhap:");
        int n = in.nextInt();

        /*
        Bài 5
        for (int i = 2; i <= 2 * n ; i += 2) {
            System.out.println(i);
        }
        */

        // Bài 6
        int dem = 0;
        int khoangCach = 1;

        for (int i = 2; i < n; i += 2) {
            if(dem == khoangCach){
                System.out.println(-i + "\t");
                khoangCach++;
                dem = 0;
            } else {
                System.out.println(i + "\t");
                dem++;
            }
        }
    }
}
