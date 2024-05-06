package Week2;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {



        // kullanıcıdan yaşadığı şehri girmesini isteyiniz.
//eğer ilk ve son A/a ise "doğru şehir " yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşadığınız şehri girin: ");
        String sehir = scanner.nextLine();

        char ilkKarakter = sehir.charAt(0);
        char sonKarakter = sehir.charAt(sehir.length() - 1);

        if (ilkKarakter == 'A' || ilkKarakter == 'a' && sonKarakter == 'A' || sonKarakter == 'a') {
            System.out.println("Doğru şehir");
        } else {
            System.out.println("Yanlış şehir");
        }
    }
}
