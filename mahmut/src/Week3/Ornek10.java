package Week3;

import java.util.Scanner;

public class Ornek10 {
    public static void main(String[] args) {

        /*
    // break ve continue sadece içinde bulunduğu döngüyü etkiler.
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin


        Scanner scanner = new Scanner(System.in);

        System.out.println("stringi girin:");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (c != ' ' && c != 'a') {
                System.out.println(c);
            }
        }


    }
}
