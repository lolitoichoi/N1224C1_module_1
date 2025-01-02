package ss8_condition;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        LocalDate localDate = LocalDate.now();
//
//        LocalTime localTime = LocalTime.now();
//
//        System.out.println(localTime);
//        System.out.println(localDate);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate date = LocalDate.parse("20/12/2024", formatter);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Moi ban nhap ngay thang nam sinh: dd/MM/yyyy" );
        String nhap = sc.nextLine();

        LocalDate localDate = LocalDate.parse(nhap, dateFormatter);

        localDate = localDate.plusYears(2);

        System.out.println(localDate.format(dateFormatter));

    }
}
