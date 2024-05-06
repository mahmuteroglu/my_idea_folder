package Week3;

import java.util.Scanner;

public class Ornek9 {
    public static void main(String[] args) {

//ask user to enter username and password (Give 3 tries)
//String username = "ClarusWay";
// String password = "123Cwy";
        //if true credential "login"
        //else try to 3 times


        Scanner scanner = new Scanner(System.in);

        int deneme = 0;

        while (deneme < 3) {
            System.out.print("Kullanıcı adı: ");
            String kullaniciAdi = scanner.nextLine();

            System.out.print("Şifre: ");
            String sifre = scanner.nextLine();

            if (kullaniciAdi.equals("giriş") && sifre.equals("giriş")) {
                System.out.println("Giriş başarılı");
                break;
            } else {
                System.out.println("3 kez deneyin");
                deneme++;
            }
        }

        if (deneme == 3) {
            System.out.println("Hesabınız kilitlendi");
        }

    }
}
