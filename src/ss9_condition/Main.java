package ss9_condition;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

    }

    public  static void outPutArray(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + "\t");
            System.out.printf("arr[%d] = %d", i, arrayList.get(i));
        }
    }
    public  static void inPutArray(ArrayList<Integer> arrayList, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap vao phan tu a[%d]: ", i);
            arrayList.add(sc.nextInt());
        }
    }
}
