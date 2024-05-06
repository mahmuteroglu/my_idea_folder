package DE07Ilk7DersPekistirmeSorulari.L01_Base;

import java.util.Scanner;

public class C1_3 {
    public static void main(String[] args) {
        /*3) Bu iki sayıdan büyük olanını ekrana if kullanarak yazdırın*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int s1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int s2 = scanner.nextInt();

        if (s1 > s2) {
            System.out.println("Daha büyük sayı: " + s1);
        } else {

            System.out.println("Daha büyük sayı: " + s2);
        }

    }
}
