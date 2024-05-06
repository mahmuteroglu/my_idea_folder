package Week2;

import java.util.Scanner;

public class Ornek6 {

//    Input from user time like 12:23 check time and give message
//    Ex:
//            06 ~ 12 ==> good morning
//        12 ~ 15 ==> good afternoon
//        15 ~ 20 ==> good evening
//        20 ~ 23 ==> good night

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("24 saat biciminde bir zaman girin (HH:MM): ");

        String zaman = scanner.next();

        int saat = Integer.parseInt(zaman.split(":")[0]);
        int dakika = Integer.parseInt(zaman.split(":")[1]);

        if (saat >= 6 && saat < 12) {
            System.out.println("Good morning!");
        } else if (saat >= 12 && saat < 15) {
            System.out.println("Good afternoon!");
        } else if (saat >= 15 && saat < 20) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Good night!");
        }
    }

    }
