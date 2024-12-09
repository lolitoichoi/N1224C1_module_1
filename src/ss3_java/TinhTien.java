package ss3_java;

import java.util.Scanner;

public class TinhTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi ban nhap ten san pham : ");
        String ten = scanner.nextLine();

        System.out.println("Moi ban nhap so luong san pham : ");
        double soLuong = scanner.nextDouble();

        System.out.println("Moi ban nhap don gia san pham : ");
        int donGia = scanner.nextInt();

        System.out.println("Tong tien la : " + (donGia * soLuong));
        System.out.println("Thue gia tang la : " + (donGia * soLuong) * 0.1 );
    }
}
