package ss6_condition;

import ss4_condition.Char;

import java.util.Scanner;

public class Lession1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("nhap chu HOA :");
            char character = in.next().charAt(0);

            if (character >= 'A' && character <= 'Z') {
                System.out.println("chuyen chu hoa thanh thuong => " + toLowerCase(character));
                break;
            } else {
                System.out.print("Yeu cau ban nhap chu Hoa || Vui long ");
            }
        }
    }

    public static char toLowerCase(char c) {
        return (char) (c + 32);
    }
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Moi ban nhap a: ");
        double a = in.nextDouble();

        System.out.println("Moi ban nhap b: ");
        double b = in.nextDouble();

        System.out.println("Ket qua cua phuong trinh bac nhat la: " );
        phuongTrinhBacNhat(a, b);

    }

    public static void phuongTrinhBacNhat (double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem ");
            } else {
                System.out.println("Phuong trinh vo nghiem ");
            }
        } else {
            double x = - b / a;
            System.out.println("Nghiem cua phuong trinh la :" + x);
        }
    }
    */

    /*---------------------------------------------------------------------------------*/
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Moi ban nhap a: ");
//        double a = in.nextDouble();
//
//        System.out.println("Moi ban nhap b: ");
//        double b = in.nextDouble();
//
//        System.out.println("Moi ban nhap c: ");
//        double c = in.nextDouble();
//
//        System.out.println("Ket qua cua phuong trinh bac nhat la: ");
//        phuongTrinhBacHai(a, b, c);
//
//        public static void phuongTrinhBacHai ( double a, double b, double c){
//            if (a == 0) {
//                if (b == 0) {
//                    if (c == 0) {
//                        System.out.println("Phuong trinh co vo so nghiem ");
//                    } else {
//                        System.out.println("Phuong trinh vo nghiem ");
//                    }
//                } else {
//                    double x = -c / b;
//                    System.out.println("Nghiem cua phuong trinh la :" + x);
//                }
//            } else {
//                double delta = b * b - 4 * a * c;
//                if (delta < 0) {
//                    System.out.println("Phuong trinh vo nghiem");
//                } else if (delta == 0) {
//                    double x = -b / (2 * a);
//                    System.out.println("Nghiem kep cua phuong trinh la: " + x);
//                } else {
//                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
//                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
//                    System.out.println("Phuong trinh la :" + x1 + " and " +  x2);
//                }
//            }
//        }
//    }
}




