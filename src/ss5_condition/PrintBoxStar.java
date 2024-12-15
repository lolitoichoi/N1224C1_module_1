package ss5_condition;

import java.util.Scanner;

public class PrintBoxStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Mời bạn nhập vào chiều dài cạnh hình vuong :");
        int chieuDai = in.nextInt();

        for (int i = 1; i <= chieuDai; i++) {
            for (int j = 1; j <= chieuDai; j++) {
                if (i == 1 || i == chieuDai || j == 1 || j == chieuDai) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
