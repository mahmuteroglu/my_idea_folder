package Week1;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
      /*
   girilen iki tam sayının toplamı,farkı ve ortalamasını print eden code create ediniz.
   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayi giriniz");
        int s1 =scan.nextInt();
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen negatif bir sayi giriniz");
        int s2 =scan.nextInt();
        int toplam = s1+s2;
        double toplamKaresi = Math.pow(toplam,2);
        System.out.println("ToplamKaresi = " + toplamKaresi);
        int fark = s1-s2 ;
        int farkKarekok = (int) Math.sqrt(Math.abs(fark));
        System.out.println("farkKarekok = " + farkKarekok);
        int ortalama = toplam /2;
        System.out.println("ortalama = " + ortalama);
    }
}
