package ME1_05ScannerClassAndTypeCasting;

import java.util.Scanner;
public class C01_ScannerClass {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayiyi giriniz:");
        int s1= scan.nextInt();
        System.out.println("Klavyeden girdiginiz sayinin 2 kati="+s1*2);
    }


}
