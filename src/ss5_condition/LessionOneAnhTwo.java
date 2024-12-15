package ss5_condition;

import java.util.Scanner;

public class LessionOneAnhTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       /*Bài 1*/
//        System.out.println("Mời bạn nhập n: ");
//        int n = in.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }

        /*Bài 2*/
        System.out.println("Mời bạn nhập n: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }
}
