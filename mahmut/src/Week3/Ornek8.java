package Week3;

import java.util.Scanner;

public class Ornek8 {
    public static void main(String[] args) {


//Kullanıcıdan 5 tane sayı girmesini isteyin eğer toplamı 100 geçerse
        //"Toplamınız 100'e ulaştı daha fazla girmeyin


        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        for (int i = 0; i < 5; i++) {
            System.out.print("Lütfen bir sayı girin: ");
            sayi = scanner.nextInt();
            toplam += sayi;

            if (toplam >= 100) {
                System.out.println("Toplamınız 100'e ulaştı daha fazla girmeyin");
                break;
            }
        }

        System.out.println(toplam);
    }
}
