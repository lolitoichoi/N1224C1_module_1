package Test;

import java.util.Scanner;

public class Ls3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("moi ban nhap chuoi ki tu ");
        String str = in.nextLine();

        System.out.println("so luong ki tu hoa trong chuoi " + demKiTu(str));
    }

    public static int demKiTu(String str) {
        int demKiTu = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                demKiTu++;
            }
        }
        if (demKiTu > 0){
            System.out.println(demKiTu);
        } else {
            System.out.println("Khong co ki tu hoa");
        }
        return demKiTu;
    }
}
