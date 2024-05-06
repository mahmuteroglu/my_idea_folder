package DE07Ilk7DersPekistirmeSorulari.L01_Base;

import java.util.Scanner;

public class C1_4 {
    public static void main(String[] args) {

        /*Scanner class yardımı ile 2 adet int sayı okutun, (s1, s2) Bu iki sayıdan büyük olanını ekrana ternary operator kullanarak yazdırın*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int s1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int s2 = scanner.nextInt();


        System.out.println("Daha büyük sayı: " + (s1 > s2 ? s1 : s2));
    }
}
