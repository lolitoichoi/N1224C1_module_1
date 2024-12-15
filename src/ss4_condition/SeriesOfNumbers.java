package ss4_condition;

import java.util.Scanner;

public class SeriesOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mời ban nhap so: ");
        int n = in.nextInt();



//        Bài 1
//        for (int i = 0; i <= n; i++) {
//            System.out.print(i + "\t");
//        }



        // Bài 2 in day so le tu 1 -> n
//        for (int i = 0; i <= n; i++) {
//            if (i % 2 == 1) {
//                System.out.print(i + "\t");
//            }
//        }
//         Bài 3
//        for (int i = 2; i <= n; i++) {
//            if (i % 4 == 0) {
//                System.out.print(-i + "\t");
//                i++;
//            } else {
//                System.out.print(i + "\t");
//                i++;
//            }
//        }
//         Bài 4 cách 1
//        for (int i = 2; i <= n; i += 2) {
//            if (i % 6 == 0) {
//                System.out.print(-i + "\t");
////                i++;
//            } else {
//                System.out.print(i + "\t");
////                i++;
//            }
//        }
//          Bài 4 cách 2
//        int distance = 3;
//        int count = 0;
//        for (int i = 2; i <= n; i += 2) {
//            count++;
//            if (count == distance) {
//                System.out.print(-i + "\t");
//                count = 0;
//            } else {
//                System.out.print(i + "\t");
//            }
//        }


    }
}
