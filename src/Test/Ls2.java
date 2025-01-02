package Test;

import java.util.Scanner;

public class Ls2 {
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

        System.out.println("Tong cac so chan va tong cac so le la : " + (tongSoChan(arr) - tongSoLe(arr)));


    }

    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao phan tu arr[%d]", i);
            arr[i] = sc.nextInt();
        }
    }

    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int tongSoChan(int[] arr) {
        int tong1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 ) {
                tong1 += arr[i];
            }
        }
        return tong1;
    }

    public static int tongSoLe(int[] arr) {
        int tong2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1 ) {
                tong2 += arr[i];
            }
        }
        return tong2;
    }
}
