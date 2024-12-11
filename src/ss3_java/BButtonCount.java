package ss3_java;

import java.util.Scanner;

public class BButtonCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mời bạn nhập biển số gồm tối đa 5 chữ số: ");
        int bienSo = sc.nextInt();

        int tongSo = bienSo % 10;
        bienSo = bienSo / 10;

        tongSo = tongSo + bienSo % 10;
        bienSo = bienSo / 10;

        tongSo = tongSo + bienSo % 10;
        bienSo = bienSo / 10;

        tongSo = tongSo + bienSo % 10;
        bienSo = bienSo / 10;

        tongSo = tongSo + bienSo;

        int tongBienSo = tongSo % 10;
        System.out.print("Tổng số nút trên biển là: " + tongBienSo);

    }
}
