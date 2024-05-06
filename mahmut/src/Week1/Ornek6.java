package Week1;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {

        /*     Sıcaklığı Fahrenheit'tan Santigrat derecesine çeviren bir
     Java programı yazın. (Scanner class)
          formül
          c = (f-32)*5/9
    ex:
   Input F :120
   Output :48
          */

        Scanner scanner = new Scanner(System.in);
        double fah = scanner.nextDouble();
        double santigrat;
        santigrat = (fah-32)*5/9;
        System.out.println("santigrat = " + santigrat);

    }

}
