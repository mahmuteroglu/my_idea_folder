package Week5;

public class Ornek8 {
    public static void main(String[] args) {

        /*
    Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
    String s= "Apex,nesne yonelimli bir programlama dilidir"
                a e i o u */


        String s = "Apex,nesne yonelimli bir programlama dilidir";

        char[] arr = s.toCharArray();

        int unluHarfSayisi = 0;


        for (char c : arr) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                unluHarfSayisi++;
            }
        }


        System.out.println("Ünlü harflerin sayısı: " + unluHarfSayisi);

    }
}
