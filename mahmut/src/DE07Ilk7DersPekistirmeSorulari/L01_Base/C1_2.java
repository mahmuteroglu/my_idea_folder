package DE07Ilk7DersPekistirmeSorulari.L01_Base;

import java.util.Scanner;

public class C1_2 {
    public static void main(String[] args) {

        /*Bu 2 sayının toplamını Wrapper class (Integer) yardımı ile toplatıp yazdır */

       Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int s1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int s2 = scanner.nextInt();



        int toplam = Integer.sum(s1,s2);

        System.out.println("İki sayının toplamı: " + toplam);









    }
}
