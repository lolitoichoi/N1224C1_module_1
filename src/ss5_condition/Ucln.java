package ss5_condition;

import java.util.Scanner;

public class Ucln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập a:");
        int a = sc.nextInt();

        System.out.println("Mời bạn nhập b:");
        int b = sc.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // tim uscln
        int uscln = 1;
        if (max % min == 0) {
            uscln = min;
        } else {
            for (int i = min; i >= 1; i--) {
                if(a % i == 0 && b % i == 0) {
                    uscln = i;
                    break;
                }
            }
        }

        // tim bscnn
        int bscnn;
        for (int i = max; true; i += max) {
            if(i % min == 0) {
                bscnn = i;
                break;
            }
        }

        System.out.println("Ước số chung lớn nhất là : " + uscln);
        System.out.println("Bội số chung nhỏ nhất là : " + bscnn);
    }
}

