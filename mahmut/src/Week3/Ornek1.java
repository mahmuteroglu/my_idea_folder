package Week3;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {


        //Kullanıcıdan alınan satır ve sütun sayısına göre duvar örünüz:)
//Karakter []
//Bir tuğlanın maliyeti 27.5 Tl ise duvarın mailiyetini hesaplayınız


        Scanner scanner = new Scanner(System.in);
        System.out.print("Duvarın satır sayısını giriniz: ");
        int satirSayisi = scanner.nextInt();
        System.out.print("Duvarın sütun sayısını giriniz: ");
        int sutunSayisi = scanner.nextInt();

        int tuglaSayisi = satirSayisi * sutunSayisi;

        double tuglaMaliyeti = 27.5;

        double duvarMaliyeti = tuglaSayisi * tuglaMaliyeti;

        for (int i = 0; i <satirSayisi ; i++) {
            for (int j = 0; j <sutunSayisi ; j++) {
                System.out.print("[]");


            }
            System.out.println();


        }

        tuglaMaliyeti  = (tuglaSayisi*27.5);
        System.out.println(tuglaSayisi);

    }
}
