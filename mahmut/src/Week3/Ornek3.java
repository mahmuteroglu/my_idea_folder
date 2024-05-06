package Week3;

public class Ornek3 {
    public static void main(String[] args) {
//        0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.


        for (int i = 0; i <= 255; i++) {

            String ch = Character.toString((char) i);

            System.out.println("ASCII değeri: " + i);

            System.out.println("Karakter değeri: " + ch);

            System.out.println();
        }



    }
}
