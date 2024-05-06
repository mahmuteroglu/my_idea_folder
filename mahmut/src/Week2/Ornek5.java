package Week2;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Yaşınızı girin: ");

        int yas = scanner.nextInt();

        if (yas >= 18) {
            if (yas >= 70) {
                System.out.println("You can vote three times.");
            } else if (yas >= 50) {
                System.out.println("You can vote twice.");
            } else {
                System.out.println("You can vote once.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }


    }
}
