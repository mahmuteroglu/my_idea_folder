package Week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {

        //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumle giriniz : ");
        String str = scanner.nextLine();
        List<String> list = new ArrayList<>();
        list.addAll(List.of(str.split(" ")));
        System.out.println("kelime sayisi= " + list.size());
    }
}
