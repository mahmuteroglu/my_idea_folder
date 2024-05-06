package Week2;

import java.util.Scanner;

public class Ornek10 {
    public static void main(String[] args) {

//        Verilen String cent miktarını 123 1$ dolar 23 cent şeklinde yazdırın


        Scanner scan =new Scanner(System.in);
        System.out.print("Cent miktarini giriniz : ");
        int cent= scan.nextInt();
        int dolar = (cent/100);
        int cent1 = cent-(cent/100)*100;

        System.out.println(dolar+" dolar "+cent1);
    }
}
