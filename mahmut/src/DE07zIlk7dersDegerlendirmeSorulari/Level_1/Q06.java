package DE07zIlk7dersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Verilen bir stringing, ilk ve son karekterini ekrana yazdırın
        // Örnek    input  : "Selamlar"
        //          Output : "Sr"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni girin : ");
        String ad = scanner.nextLine();
        System.out.println(""+ad.charAt(0)+ad.charAt(ad.length()-1));
    }
}
