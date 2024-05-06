package Week3;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {


        // Dilim seni dilim dilim kesmeli
        //kaç tane "dil" içermektedir.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümleyi giriniz: ");
        String s = scanner.nextLine();


        int dilSayisi = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'd' && s.charAt(i + 1) == 'i' && s.charAt(i + 2) == 'l') {
                dilSayisi++;
            }
        }


        System.out.println("Cümlede " + dilSayisi + " tane 'dil' kelimesi bulunmaktadır.");

    }
}
