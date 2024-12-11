package ss3_java;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mời bạn bán kính đuường tròn : ");
        double r = sc.nextDouble();

        double c = 2 * Math.PI * r;
        double a = Math.PI * r * r;

        System.out.print("Chu vi hình tròn : " + c );
        System.out.print("Diện tích hình tròn : " + a );
    }
}
