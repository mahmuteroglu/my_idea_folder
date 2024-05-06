package Week2;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {

//
//        "Bir web sitesi alışveriş sepet toplamı 500TL den fazla olan siparişler için kargo bedeli almıyor ,
//        450 tl nin altı için 50 Tl kargo bedeli alıyor ama  alış veriş 450-500 arası ise 500 e tamamlanıyor
//        Alış veriş bedeli girildiğinde, kargo dahil toplam ödenecek tutarı ekrana yazdıran proğram"
//        Önnekler    input : 540 , output 540
//        input : 480 , output 500
//        input : 420 , output 470
//

        Scanner input = new Scanner(System.in);

        System.out.print("Alışveriş Sepet Toplamını Girin (TL): ");
        int sepetToplami = input.nextInt();

        int kargoBedeli = 0;

        if (sepetToplami >= 500) {
            kargoBedeli = 0;
        } else if (sepetToplami < 450) {
            kargoBedeli = 50;
        } else {
            kargoBedeli = 500 - sepetToplami;
        }

        int toplamOdeme = sepetToplami + kargoBedeli;

        System.out.println("Kargo Dahil Toplam Ödeme: " + toplamOdeme + " TL");



    }
}
