package Week4;

import java.util.Scanner;

public class Örnek1 {
    public static void main(String[] args) {

//        writeInfo() isimli bir method void ve parametresiz
//        isim ve soy isim bilgisini ekrana yazsın
//        writeAdress() isimli bir  method oluşturun void ve parametresiz
//        adres ve kişi bilgilerini yazdırsın

        writeInfo();
    }
    private static void writeInfo() {
        Scanner scanner =new Scanner(System.in);
        String isim = scanner.nextLine();
        System.out.println("isim = " + isim);
        String soyisim = scanner.nextLine();
        System.out.println("soyisim = " + soyisim);
        writeAdress();
    }
    private static void writeAdress() {
        Scanner scanner =new Scanner(System.in);
        String adres = scanner.nextLine();
        System.out.println("adres = " + adres);









    }
}
