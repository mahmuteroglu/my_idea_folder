package DE06_SwitchCase.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının
        // harf karakteri ile  print eden code create ediniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi =");
        int sayi = oku.nextInt();

        //  176  onlar basamağı nasıl bulunuz ?
        // önce 10 bölerim int bölme olduğundan elimde 17 kalır, ben 7 ye ulaşmak istiyorum
        // sonra çıkan sonucu %10 yaptığımda 10 bölümden kalanı yani son rakamı verir 7 yi
        int onlarBasamagi = (sayi/10)%10; //
        switch (onlarBasamagi) {
            case 0 : System.out.println("Sıfır"); break;
            case 1 : System.out.println("Bir"); break;
            case 2 : System.out.println("İki"); break;
            case 3 : System.out.println("Üç"); break;
            case 4 : System.out.println("Dört"); break;
            case 5 : System.out.println("Beş"); break;
            case 6 : System.out.println("Altı"); break;
            case 7 : System.out.println("Yedi"); break;
            case 8 : System.out.println("Sekiz"); break;
            case 9 : System.out.println("Dokuz"); break;
        }




    }
}
