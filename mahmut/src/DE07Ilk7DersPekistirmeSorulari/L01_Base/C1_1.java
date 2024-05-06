package DE07Ilk7DersPekistirmeSorulari.L01_Base;

import java.util.Scanner;

public class C1_1 {
    public static void main(String[] args) {

        /* Scanner class yardımı ile 2 adet int sayı okutun, (s1, s2)
        1) Bu 2 sayının toplamını ekrana yazdırın */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int s1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int s2 = scanner.nextInt();

        int toplam = s1 + s2;

        System.out.println("İki sayının toplamı: " + toplam);




    }
}
