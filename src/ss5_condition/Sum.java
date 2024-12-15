package ss5_condition;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao so nguyen :");
        int m = sc.nextInt();

        int sum = 0;
        int p = 1;

        while (m > 0) {
            int phanDu = m % 10; // tách chữ số cuối cùng của m

            sum += phanDu; // 0 = 0 + 2;
            p *= phanDu; // 1 = 1 * 2;

            m /= 10; // loại bỏ số cuối của m
        }
        System.out.println("Tích của số nguyên là :" + sum);
        System.out.println("Thuơng của số nguyên là :" + p);
    }
}
