package DE07zIlk7dersDegerlendirmeSorulari.Level_3;

import java.util.Scanner;

public class Q02ErcanBeyCozum {
    public static void main(String[] args) {

        // dd/MM/yyyy formatında string olarak iki tarih verisini okutun,
        // hangi tarih daha eski ekrana yazdırın.

        Scanner scan = new Scanner(System.in);
        //  System.out.print("dd/MM/yyyy formatinda String iki tarih giriniz ");
        String tarih1 = scan.next();
        String tarih2 = scan.next();

        int t1gun = Integer.parseInt(tarih1.substring(0, 2));
        int t1ay = Integer.parseInt(tarih1.substring(3, 5));
        int t1yil = Integer.parseInt(tarih1.substring(6));

        int t2gun = Integer.parseInt(tarih2.substring(0, 2));
        int t2ay = Integer.parseInt(tarih2.substring(3, 5));
        int t2yil = Integer.parseInt(tarih2.substring(6));

        if (t2yil > t1yil) {
            System.out.println("tarih 1 daha eski");
        } else if (t2yil == t1yil && t2ay > t1ay) {
            System.out.println("tarih 1 daha eski");

        } else if (t2yil == t1yil && t2ay == t1ay && t2gun > t1gun) {
            System.out.println("tarih 1 daha eski");

        } else if (tarih1.equals(tarih2)) System.out.println("tariher aynıdır");
            else System.out.println("tarih 2 daha eski");


    }
}
