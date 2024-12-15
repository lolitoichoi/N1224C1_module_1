package ss4_condition;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap vao ki tu :");
        char kiTu = in.next().charAt(0);

        if ((kiTu >= 'a' && kiTu <= 'z') || (kiTu >= 'A' && kiTu <= 'Z')) {
            if(kiTu >= 'A' && kiTu <= 'Z') {
                kiTu += 32;
            } else {
                kiTu -= 32;
            }

            System.out.println("ky tu da chuyen doi :" + kiTu);
        }
        System.out.println("Moi ban nhap lai. Hay nhap chu k");
    }
}
