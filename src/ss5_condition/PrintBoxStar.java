package ss5_condition;

import java.util.Scanner;

public class PrintBoxStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Mời bạn nhập vào chiều dài cạnh hình vuong :");
        int chieuDai = in.nextInt();

        System.out.println("Mời bạn nhập vào chiều rộng cạnh hình vuong :");
        int chieuRong = in.nextInt();


//        for (int i = 1; i <= chieuDai; i++) {
//            for (int j = 1; j <= chieuDai; j++) {
//                if (i == 1 || i == chieuDai || j == 1 ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
////        for (int i = 1; i <= chieuDai; i++) {
//            for (int j = 1; j <= chieuRong; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//
//        for (int i = 1; i <= chieuDai; i++) {
//            for (int j = 1; j <= chieuDai; j++) {
//                if (i == 1 || i == chieuDai || j == chieuDai ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i <= chieuDai; i++) {
//            for (int j = 1; j <= chieuDai; j++) {
//                if (i == 1 || j == chieuDai || j == 1 ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= chieuDai; i++) {
//            for (int j = 1; j <= chieuDai; j++) {
//                if (i == chieuDai || j == chieuDai || j == 1 ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i <= chieuDai; i++) {
//            for (int j = 1; j <= chieuDai; j++) {
//                if (j <= i ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        hinh c
        for (int i = 1; i <= chieuDai; i++) {
            for (int j = chieuRong; j >= i; j--) {
                System.out.print("  ");
            }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
//       // hinh d
        for (int i = 1; i <= chieuDai; i++) {
            for (int j = chieuRong; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = chieuRong; j <= 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= chieuDai; i++) {
            for (int j = 1; j <= chieuRong; j++) {
                if (i <= j ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // cau g
        for (int i = 1; i <= chieuDai; i++) {
            for (int j = chieuRong; j >= i; j--) {
                System.out.print(" ");
            }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
     //    hinh tam giac
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
