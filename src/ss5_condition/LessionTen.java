package ss5_condition;

import java.util.Scanner;

public class LessionTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("MỜi bạn nhap :");
        int n = in.nextInt();

//        double s = 0.0;
//
//        for (int i = 1; i < n; i++) {
//            s = s + 1.0/i;
//        }
//        System.out.println(s);
//
          double sum = 0;
          int fact = 1;
          for (int i = 1; i <= n; i++) {
              sum += 1.0 / fact; // 1/1 = 1
              fact *= (2 * i) * ( 2 * i + 1); // fact = 1 * (2*1) * ( 2* 1 +1) =
          }
        System.out.println("tong so la " + sum);
    }
}
