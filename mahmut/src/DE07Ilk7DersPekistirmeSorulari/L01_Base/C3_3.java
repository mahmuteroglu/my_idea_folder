package DE07Ilk7DersPekistirmeSorulari.L01_Base;

import java.util.Scanner;

public class C3_3 {
    public static void main(String[] args) {

        /*Scanner class yardımı ile 3 adet int sayı okutun, (s1, s2, s3)
        Bu 3 sayıdan büyük olanını ekrana if kullanarak yazdırın
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int s1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int s2 = scanner.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int s3 = scanner.nextInt();

        int enBuyukSayi = 0;
        if (s1 > s2 && s1 > s3) {
            enBuyukSayi = s1;
        } else if (s2 > s1 && s2 > s3) {
            enBuyukSayi = s2;
        } else {
            enBuyukSayi = s3;
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
    }
}
