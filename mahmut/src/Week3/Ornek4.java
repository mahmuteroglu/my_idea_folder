package Week3;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime girin: ");
        String s = scanner.nextLine();

        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            s1 += s.charAt(i) + "*";
        }

        System.out.println("Yeni kelime: " + s1);

    }
}
