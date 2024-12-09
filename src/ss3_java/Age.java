package ss3_java;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mời bạn nhập năm sinh : ");
        int n = in.nextInt();
        System.out.print(Year.now().getValue() - n + " " + "tuổi");
    }
    // how to.........in java
}
