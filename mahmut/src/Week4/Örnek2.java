package Week4;

import java.util.Scanner;

public class Örnek2 {
    public static void main(String[] args) {

//        Verilen yılda hangi yaşta olduğunu belirten method oluşturunuz
//*void ve parametre kullanarak
//        age2(2050,1990);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dogumyilinizi giriniz");
        int dogumYil=scanner.nextInt() ;

        System.out.println("Lütfen yil giriniz");
        int yil=scanner.nextInt() ;

        yas(yil,dogumYil);
        int anne=yas(2050,1990);
        int cocuk= yas(2050, 2010);
        int toplam= anne+cocuk; //return burda tekrar ayni methodu kullanmamizi sagladi.
        System.out.println(toplam);
    }

    private static int yas(int yil,int dogumyili) {

        System.out.println(yil-dogumyili);
        int yas=yil-dogumyili;
        return yas;




    }
}
