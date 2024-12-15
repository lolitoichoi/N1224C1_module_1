package ss4_condition;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap thang :");
        int month = in.nextInt();

        System.out.println("Moi ban nhap nam :");
        int year = in.nextInt();

        int daysInMonth;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = 31;
                break;
        }
    }
}
