package DE07zIlk7dersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /* Klavyeden girilen ve 3 harften oluşan bir string i, her satıra bir harf gelecek şekilde yazdırınız
        Örnek input : ali,
         output
         a
         l
         i
          */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni girin : ");
        String str = scanner.next();
        System.out.println(str.substring(0,1));
        System.out.println(str.substring(1,2));
        System.out.println(str.substring(2));

        System.out.println("---- 2.yol---" );
        System.out.println(str.charAt(0)+"\n"+str.charAt(1)+"\n"+str.charAt(2));

        System.out.println("---- 3.yol---" );
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));

    }
}
