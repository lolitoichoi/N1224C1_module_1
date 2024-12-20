package ss7_condition;

import java.util.Scanner;

public class Lession1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Hello World";
        // a.lay ra chu wordl
        System.out.println(str.substring(6));

        // b.thay ki tu
        System.out.println(str.replace('o', 'f'));

        // c.dem xem co bao nhieu chu L
        int dem = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'l'){
                dem++;
            }
        }
        System.out.println(dem);

        // d.vi tri xuat hien đầu hoặc cuối chuỗi
        System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));

        // e.xoa khoảng cách đầu và cuối chuỗi
        System.out.println(str.replace(" ", ""));
        // f.xoa het khoang trang
        System.out.println("xoa het khaong trang :" + str.trim());
        //g.đảo chuỗi
        String daoChuoi = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            daoChuoi += str.charAt(i);
        }
        System.out.println("Đảo chuỗi :" + daoChuoi);

        //h. cho chuỗi "SQC". hãy tạo thành chuỗi "SQC hello world"
        System.out.println("SQC" + " " + str);
        System.out.println("SQC".concat(str));

        //i. đổi toàn bộ kí tự của S sang chữ thuờng
        System.out.println("doi Kí tự S sang chữ thuờng " + str.toLowerCase());
        //k. đổi toàn bộ kí tự của chữ s sang chu hoa
        System.out.println("doi Kí tự S sang chữ hoa " + str.toLowerCase());

        //L.trích ra chuỗi con s từ kí tự thứ n đến thứ m của S
        System.out.println("Trich ra chuoi con tu n den m: ");

        System.out.println("Moi ban nhap n: ");
        int n = in.nextInt();

        System.out.println("Moi ban nhap m: ");
        int m = in.nextInt();

        System.out.printf("Chuoi con từ kí tự %d đến $d: %s", n, m, str.substring(n, m));
    }
}
