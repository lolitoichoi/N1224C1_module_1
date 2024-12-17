package ss5_condition;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập giá tiền món đồ : ");
        int price = sc.nextInt();

        System.out.println("Nhập số tiền khách đưa : ");
        int priceOfCustomer = sc.nextInt();

        int tienThoi = priceOfCustomer - price;
        int menhGiaTien;

        for (int i = 2; i >= 0; i--) {  // i = 2 1 0
            int heSo = (int) Math.pow(10, i);

            // tinh tien
            menhGiaTien = heSo * 5000;
            if (tienThoi >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoi / menhGiaTien, tienThoi);
                tienThoi %= menhGiaTien; // cap nhat so tien con lai khi thoi menh gia nay
            }


            menhGiaTien = heSo * 2000;
            if (tienThoi >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoi / menhGiaTien, tienThoi);
                tienThoi %= menhGiaTien; // cap nhat so tien con lai khi thoi menh gia nay
            }


            menhGiaTien = heSo * 1000;
            if (tienThoi >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoi / menhGiaTien, tienThoi);
                tienThoi %= menhGiaTien; // cap nhat so tien con lai khi thoi menh gia nay
            }
        }
        System.out.println("Số tiền còn lại : " + tienThoi);
    }
}
