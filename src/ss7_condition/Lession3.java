package ss7_condition;

import java.util.Scanner;

public class Lession3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Moi ban nhap chuoi a: ");
        String a = in.nextLine();

        System.out.print("Moi ban nhap chuoi b: ");
        String b = in.nextLine();

        int soSanh = a.compareTo(b);

        if(soSanh < 0) {
            System.out.println("Chuỗi a < Chuỗi b");
        } else if(soSanh == 0) {
            System.out.println("Chuỗi a = Chuỗi b");
        } else {
            System.out.println("Chuỗi a > Chuỗi b");
        }
    }
}
