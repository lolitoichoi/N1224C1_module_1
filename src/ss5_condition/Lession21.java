package ss5_condition;

import java.util.Scanner;

public class Lession21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so nguyen duong");
        int n = sc.nextInt();

        String sum = " ";
        while (n > 0) {
            sum = n % 2 + sum;
            n = n / 2;
        }

        System.out.println(sum);




//        1101 => 1011
//










    }
}
