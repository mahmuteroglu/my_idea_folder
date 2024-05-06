package Week2;

import java.util.Scanner;

public class Ornek8 {
    public static void main(String[] args) {
          /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
    switch() de int, byte, short, char, String kullanilir.
     *//*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)*/



        Scanner scanner = new Scanner(System.in);

        System.out.println("Gün bilgisi girin: ");
        String gun = scanner.next().toLowerCase();


        switch (gun) {
            case  "pazartesi":
            case  "sali":
                System.out.println("Java dersi günleri");
                break;
            case  "persembe":
            case  "cuma":
                System.out.println("selenyum dersi günleri");
                break;
            case  "carsamba":
            case  "cumartesi":
                System.out.println("SQL dersi günleri");
                break;
            default:
                System.out.println("izin günü");
                break;
        }
    }
}
