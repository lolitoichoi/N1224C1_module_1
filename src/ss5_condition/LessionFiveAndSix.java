package ss5_condition;

import java.util.Scanner;

public class LessionFiveAndSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nhập vao số n :");
        int n = in.nextInt();
        // bài 5
//        for (int i = 2; i <= n * 2; i += 2) {
//            System.out.println(i);
//        }

        // bài 6
        int khoangCach = 1;
        int dem = 0;
        for (int i = 2; i <= n; i += 2) {
            if (dem == khoangCach) {
                System.out.println(-i + "\t");
                dem = 0;
                khoangCach++;
            } else {
                System.out.println(i + "\t");
                dem++;
            }
        }
    }
}
