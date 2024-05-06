package Week2;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {

         /* Kullanıcıdan içinde boşluk içermeyen bir password girmesini isteyin.
   Girilen passwordu **** şeklinde çıktı alın.
   Ardından tekrar passwordu doğrulamasını isteyin
   Eğer girilen şifreler aynı ise "Pass"
   Değilise "Try Again" yazdırın*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Şifrenizi girin: ");
        String sifre1 = scanner.next();


        if (sifre1.contains(" ")) {
            System.out.println("Şifreniz boşluk içermemeli!");
        }

        System.out.println("Şifreniz: ****");

        System.out.println("Şifrenizi tekrar girin: ");
        String sifre2 = scanner.next();

        if (sifre1.equals(sifre2)) {
            System.out.println("Pass");
        } else {
            System.out.println("tekrar deneyin");
        }


    }
}
