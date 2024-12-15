package ss4_condition;

import java.util.Scanner;

public class TranslateNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Moi ban nhap vao so :");
        int a = in.nextInt();

        if(a == 1){
            System.out.println("Number one");
        } else if (a == 2) {
            System.out.println("Number two");
        } else if (a == 3) {
            System.out.println("Number three");
        } else if (a == 4) {
            System.out.println("Number four");
        } else if (a == 5) {
            System.out.println("Number five");
        } else if (a == 6) {
            System.out.println("Number six");
        } else if (a == 7) {
            System.out.println("Number seven");
        } else if (a == 8) {
            System.out.println("Number eight");
        } else if (a == 9) {
            System.out.println("Number nine");
        } else {
            System.out.println("Number ten");
        }

    }
}
