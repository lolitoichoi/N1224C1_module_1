package ss9_condition;

import java.util.Scanner;

public class Ls1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        //     b1: nhap so luong phan tu mang int n;
        do {
            System.out.println("MOI BAN nhap vao so luong phan tu");
            n = in.nextInt();

            if (n <= 0) {
                System.out.println("Moi ban nhap lại yeu cau n > 1");
            }
        } while (n <= 0);

        //  b2: tao mang co n phan tu
        int[] arr = new int[n];

        // b3 xay dung phuong thuc nhap mang
        inputArray(arr);

        // b4 xay dung phuong thuc xuat mang
        outputArray(arr);

        //
        if(kiemTraMangChan(arr)) {
            System.out.println("Mang toan chan");
        } else {
            System.out.println("Khong phai mang toan chan");
        }

        // timf kiem trong mang neu tim k thay tra ve -1
        int x = 2;
        int index = lastIndex(arr, x);

        if(index >= 0){
            System.out.printf("Phan tu %d co vi tri cuoi cung la %d:" , x, index);
        } else {
            System.out.println("K tim thay");
        }

         //so nguyen to
        if(kiemTraSoNguyenTo(arr, n)) {
            System.out.println("Day la so nguyen to");
        } else {
            System.out.println("K tim thay");
        }

        // dem so luong phan tu le
        System.out.println("So luong phan tu le trong mang la: " + demSoLuongPhanTuLe(arr));

        //  tong so duong le  cua mang
        System.out.println("Tong so duong le cua mang :" + tinhTong(arr));

        // dem bao nhiu so chia het  cho 4 va kh chia het  cho 5
        System.out.println("so chia het cho 4 va kh chia het  cho 5 la " + demSoChiaHet(arr));


        // tong cac so nguyen to
        
    }

    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao phan tu arr[%d]", i);
            arr[i] = in.nextInt();
        }
    }

    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static boolean kiemTraMangChan(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    // timf kiem trong mang neu tim k thay tra ve -1
    public static int lastIndex(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // kiem tra mang co phai toan so nguyen to
    public static boolean kiemTraSoNguyenTo(int[] arr, int n) {
        boolean flag = true;

        if (n < 2) {
            flag = false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(n % arr[i] == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    // dem so luong phan tu le trong mang A
    public static int demSoLuongPhanTuLe(int[] arr) {
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                dem++;
            }
        }
        return dem;
    }

    // tinh tong so duong le
    public static int tinhTong(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 != 0) {
                sum += arr[i];

            }
        }
        return sum;
    }

    // co bao nhieu so chia het cho 4 nhung khong chia het cho 5

    public static int demSoChiaHet(int[] arr) {
        int demSo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0 && arr[i] != 5) {
                demSo++;
            }
        }
        return demSo;
    }
}
