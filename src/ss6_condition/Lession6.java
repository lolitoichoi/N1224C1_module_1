package ss6_condition;

import java.util.Scanner;

public class Lession6 {

    static String hoTen;
    static int tuoi;
    static String diaChi;
    static boolean gioiTinh;
    static double mucLuong;
    public static void main(String[] args) {

        nhapThongTin();
        xuatThongTin();
    }

    public static void nhapThongTin() {
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap ten: ");
        hoTen = in.nextLine();

        System.out.println("Moi ban nhap tuoi: ");
        tuoi = in.nextInt();
        in.nextLine();

        System.out.println("Moi ban nhap dia chi: ");
        diaChi = in.nextLine();

//        System.out.println("Moi ban nhap gioi tinh (true : nam || false : Nu ) ");
//        gioiTinh = in.nextBoolean();
        int choose;
        do {
            System.out.println("===Menu====");
            System.out.println("1. Nam");
            System.out.println("2. Nu");

            System.out.println("===Moi ban nhap tuoi====");
            choose = in.nextInt();

            if (choose != 1 && choose != 2) {
                System.out.println("lua chon khong hop le, xin lua chon lai!");
            }
        }  while (choose != 1 && choose != 2);

//        System.out.println("Gioi tinh: " + (gioiTinh ? "Nam" : "Nu"));

        boolean gioiTinh = choose == 1;
        System.out.println("Moi ban nhap muc luong: ");
        mucLuong = in.nextDouble();
    }

    public static void xuatThongTin() {
        System.out.println("Ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Gioi tinh: " + (gioiTinh ? "Nam" : "Nu"));
        System.out.println("Muc luong: " + mucLuong);
    }
}
