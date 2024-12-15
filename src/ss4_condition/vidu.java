package ss4_condition;

import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
//        int n = 5;
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
//
//        int i = 0;
//        while (i < n) {
//            System.out.println(i);
//            i++;
//        }
        Scanner scanner = new Scanner(System.in);
        double score;
        do {
            System.out.println("Nhap vao diem");
            score = scanner.nextDouble();
            if(score < 0 || score > 10) {
                System.out.println("Diem khong hop le, diem phai tu [0 -> 10], vui long nhap lai");
            }
        } while(score < 0 && score > 10);
        System.out.println("diem" + score);
    }
}
