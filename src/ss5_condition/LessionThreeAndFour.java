package ss5_condition;

import java.util.Scanner;

public class LessionThreeAndFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //bai 3
        System.out.println("Mời bạn nhập n: ");
        int n = in.nextInt();

//        for (int i = 2; i <= n; i += 2) {
//            if(i % 4 == 0) {
//                System.out.println(-i + "\t");
//            } else {
//                System.out.println(i + "\t");
//            }
//        }
        //bai 4
        int distance = 3;
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            count++;
            if(count == distance) {
                System.out.println(-i + "\t");
                count = 0;
            } else {
                System.out.println(i + "\t");
            }
        }
    }
}
