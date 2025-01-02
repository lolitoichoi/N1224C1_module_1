package ss8_condition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Lees2 {
    public static void main(String[] args) throws ParseException {

        // chuyển string sang datetime
//        String stdDate = "10/10/2023";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate localDate = LocalDate.parse(stdDate, formatter);
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth());

        // chuyen datetime sang string
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String stdDate1 = LocalDate.now().format(formatter1);
//        System.out.println(stdDate1);


        // a Chuyển chuỗi "02/28/2023" sang java
        String str = "02/28/2023";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(str);
        System.out.println(date);


        // cau b chuyen ngay hien tại Date sang kiểu string
        Date dateCurrent = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        String str1 = formater.format(dateCurrent);
        System.out.println("Ngay da dinh dang " + str1);

        // cau c chuyen chuoi sang Local date
        String str2 = "02/28/2023";;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(str2, formatter);
        System.out.println("chuoi da chuyen sang LocalDate :" + localDate);

        // cau d Chuyen ngay hien tai cua hẹ thong ở localdate sang kieu string dd/MM/yyyy
        LocalDate localDate1 = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String str3 = localDate1.format(formatter1);
        System.out.println("Ngay da chuyen sang string:" + str3);

        // cau e lay ngay thang nam gio phut hien tai cua he thong

        LocalDateTime localDateTime = LocalDateTime.now();
        int day = localDateTime.getDayOfMonth();
        int month = localDateTime.getMonthValue();
        int year = localDateTime.getYear();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        System.out.println("Ngày: " + day);
        System.out.println("Tháng: " + month);
        System.out.println("Năm: " + year);
        System.out.println("Giờ: " + hour);
        System.out.println("Phút: " + minute);
        System.out.println("Giây: " + second);

        // cau g sau 1000 ngay thì hiện tại là ngày mấy tháng mấy năm mấy
        LocalDate currentDate = LocalDate.now();
        LocalDate ngayTuongLai = LocalDate.now().plusDays(1000);
        System.out.println(ngayTuongLai);


    }
}