package Test;

import java.util.Scanner;

public class Ls4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        int n;

        do {
            System.out.println("Moi ban nhap vao so luong phan tu");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Moi ban nhap lại yeu cau n > 1");
            }
        } while (n <= 0);

        int[] arr = new int[n];

        inputArray(arr);
        outputArray(arr);

    }

    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao phan tu arr[%d]", i);
            arr[i] = sc.nextInt();
        }
    }



    public static boolean timSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void outputArray(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            if(timSoNguyenTo(arr[i])) {
                System.out.println(arr[i] + " ");
            }

        }
    }

}
