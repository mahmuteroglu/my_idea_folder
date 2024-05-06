package Week2;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("yasinizi giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("kilonuzu giriniz: ");
        int kilo = scanner.nextInt();

        if (yas >= 18) {
            if (kilo >= 50) {
                System.out.println("Kan bağışlamaya hak kazandınız.");
            } else {
                System.out.println("Kilonuz 50 kg'ın altında olduğu için kan bağışı yapamazsınız");
            }
        } else {
            System.out.println("18 yaşından küçük olduğunuz için kan bağışı yapamazsınız.");
        }
    }
}
