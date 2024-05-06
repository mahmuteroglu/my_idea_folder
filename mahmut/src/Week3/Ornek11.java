package Week3;

import java.util.Scanner;

public class Ornek11 {
    public static void main(String[] args) {

        /*
 Task->
  Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
  For Loop  */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz : ");
        int  sayi = scanner.nextInt();
        boolean flag = true;

        for (int i = 2; i <sayi; i++) {
            if (sayi%i==0){
                System.out.println("Asal degildir.");
                flag=false;
                break;
            }

        }if (flag){
            System.out.println("Asaldir");
        }


    }
}
