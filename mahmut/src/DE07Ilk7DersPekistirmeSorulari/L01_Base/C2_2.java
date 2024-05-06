package DE07Ilk7DersPekistirmeSorulari.L01_Base;

import java.util.Scanner;

public class C2_2 {
    public static void main(String[] args) {
       /* Scanner class yardımı ile 3 adet int sayı okutun, (s1, s2, s3)Bu 3 sayının toplamını Wrapper class
       (Integer) yardımı ile toplatıp ekrana yazdırın
        */

        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();


        Integer toplam = Integer.valueOf(s1) + Integer.valueOf(s2) + Integer.valueOf(s3);

        System.out.println("Üç sayının toplamı: " + toplam);


    }
}
