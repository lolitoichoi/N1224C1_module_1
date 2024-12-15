package ss4_condition;

import java.util.Scanner;

public class EquationOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* Phuong trinh bac 1 */

//        System.out.println("Mời bạn nhập hệ số a :");
//        int a = in.nextInt();
//
//        System.out.println("Mời bạn nhập hệ số b :");
//        int b = in.nextInt();
//
//        if(a == 0) {
//            if (b == 0) {
//                System.out.println("Phương trình vô số nghiệm ");
//            } else {
//                System.out.println("Phuơng trình vô nghiệm ");
//            }
//        } else {
//            System.out.println("Nghiệm của phương trình là :" + (-b/a));
//        }

        /* Phuong trinh bac 2 */
        System.out.println("Mời bạn nhập hệ số a :");
        double a = in.nextDouble();

        System.out.println("Mời bạn nhập hệ số b :");
        double b = in.nextDouble();

        System.out.println("Mời bạn nhập hệ số c :");
        double c = in.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm ");
                } else {
                    System.out.println("Phuơng trình vô nghiệm ");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiem cua phuong tring x la :" + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("phuong tring vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiem kep cua phuong trinh la :" + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiem cua phuong trinh la x1 = " + x1 + " x2 = " + x2);
            }
        }

    }
}
