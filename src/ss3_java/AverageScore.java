package ss3_java;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mời bạn nhập điểm thi Toán : ");
        double toan = sc.nextDouble();

        System.out.print("Mời bạn nhập hệ số  Toán : ");
        double hsToan = sc.nextDouble();

        System.out.print("Mời bạn nhập điểm thi Lý : ");
        double ly = sc.nextDouble();

        System.out.print("Mời bạn nhập hệ số  Lý : ");
        double hsLy = sc.nextDouble();

        System.out.print("Mời bạn nhập điểm thi Hoá : ");
        double hoa = sc.nextDouble();

        System.out.print("Mời bạn nhập hệ số  Hoá : ");
        double hsHoa = sc.nextDouble();

        System.out.print("Điểm trung bình của học sinh là  : " + ( (toan * hsToan) + (ly * hsLy) + ( hoa * hsHoa) ) / (hsToan + hsLy + hsHoa) );

    }
}
