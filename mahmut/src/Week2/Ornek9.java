package Week2;

import java.util.Scanner;

public class Ornek9 {
    public static void main(String[] args) {

//        Kullanıcıdan ayrı ayrı alınan isim ve soy isim bilgilerini tek bir satırda çıktısını alın.
//        İlk harfler büyük olmalı.Soy ismin tamamı büyük
//        Kullanıcının birden fazla ismi olabilir.


        Scanner scanner = new Scanner(System.in);

        System.out.println("İsim bilgisi girin: ");
        String isim = scanner.nextLine();

        System.out.println("Soyisim bilgisi girin: ");
        String soyisim = scanner.nextLine();

        String adSoyisim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " " + soyisim.toUpperCase();

        System.out.println("Ad soyad: " + adSoyisim);
    }
}
