package Week3;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {


//        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
//        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
//        hesaplayan kodu yazın


        Scanner scanner = new Scanner(System.in);
        System.out.println("1'den büyük bir tam sayı giriniz: ");
        int n = scanner.nextInt();

        int toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += i * i;
        }

        System.out.println( toplam);
    }
}
