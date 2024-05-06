package ME07_FileReaderWriter.NotDefteri;

import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Kayit> liste = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        VeriOkuYaz.verioku();
        String secim="";
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            secim = scanner.next().substring(0,1).toLowerCase();
            switch (secim) {
                case "1" : veriEkle(); break;
                case "2" : veriSil(); break;
                case "3" : veriListele(); break;
                case "4" : veriGuncelle(); break;
                case "x" : break;
                default:
                    System.out.println("hatalı seçim tekrar şeiniz");
            }

        } while (!secim.equals("x"));
        System.out.println("Program sonlandı ");
    }

    private static void veriGuncelle() {
    }


    private static void veriListele() {
        System.out.println("Veri Listesi");
        for (int i = 0; i <liste.size() ; i++) {
            System.out.println(liste.get(i));
        }
    }

    private static void veriSil()throws IOException {
        Scanner scanner=new Scanner(System.in);
        veriListele();
        System.out.println("Silinecek veriyi seciniz");
        int no= scanner.nextInt();
        for (int i = 0; i < liste.size() ; i++) {

            if (liste.get(i).getNo()==no){
                liste.remove(liste.get(i));

        }i++;


        }
    }

    private static void veriEkle() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No yu giriniz : ");
        int no = scanner.nextInt();
        System.out.print("Not u giriniz : ");
        String not = scanner.next();
        Kayit kayit = new Kayit(no,not);
        liste.add(kayit);
        VeriOkuYaz.veriyaz();
    }

    private static void menu() {
        System.out.println("\n\n\n ISLEM MENUSU");
        System.out.println(" 1 : veri ekle" );
        System.out.println(" 2 : veri sil" );
        System.out.println(" 3 : veriliste" );
        System.out.println(" x : Çıkış " );
        System.out.print("Seciminiz .... : ");
    }
}
