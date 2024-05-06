package ME1_05ScannerClassAndTypeCasting;

import java.util.Scanner;

public class C02_ScannerClass {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("1.sayiyi giriniz:");

        byte s1= scan.nextByte();
        System.out.print("2. sayiyi giriniz:");
        byte s2= scan.nextByte();

        System.out.println("Toplam ="+(s2+s1));


    }
}
