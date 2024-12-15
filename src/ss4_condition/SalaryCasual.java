package ss4_condition;

import java.util.Scanner;

public class SalaryCasual {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nhap vao TNCT :");
        double thamNien = in.nextDouble();

        double luongCoBan = 65000;
        double heSoLuong;

        if (thamNien < 12) {
            heSoLuong = 1.92;
        } else if (thamNien < 36) {
            heSoLuong = 2.34;
        } else if (thamNien < 60) {
            heSoLuong = 3;
        } else {
            heSoLuong = 4.5;
        }

        double salary = luongCoBan * heSoLuong;
        System.out.println("Luong cua nhan vien :" + salary);
    }
}
