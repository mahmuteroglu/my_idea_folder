package Week5;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("8 elemanli bir array giriniz:");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] != 0) {
                sayac++;
            }
        }

        System.out.println("Arrayde 3'e bölünebilen " + sayac + " tane sayi vardir.");
    }
}
