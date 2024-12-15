package ss4_condition;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("MỜi bạn nhập số :");
        int x = in.nextInt();

        double squareRoot = Math.sqrt(x);

        if (squareRoot % 1 == 0) {
            System.out.println("Số bạn nhập là số chính phương ");
        } else {
            System.out.println("Số bạn nhập không phải số chin phương ");
        }
    }
}
