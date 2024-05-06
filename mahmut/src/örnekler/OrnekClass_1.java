package örnekler;

import java.util.Scanner;

public class OrnekClass_1 {
    public static void main(String[] args) {


        //Find month name .Input from user an int variable.Check which month and print
        //Example :6 => Haziran
        //Example :25 => invalid

        Scanner scanner = new Scanner(System.in);
        int months = scanner.nextInt();
        boolean isMonths = months >= 1 && months <= 12;
        if (isMonths) {System.out.println("valid");
            //How many else if we need?
            if (months == 1) {
                System.out.println("1 ==> Ocak");
            } else if (months == 2) {
                System.out.println("2 ==> Subat");
            } else if (months == 3) {
                System.out.println("3 ==> Mart");
            } else if (months == 4) {
                System.out.println("4 ==> Nisan");
            } else if (months == 5) {
                System.out.println("5 ==> Mayis");
            } else if (months == 6) {
                System.out.println("6 ==> Haziran");
            } else if (months == 7) {
                System.out.println("7 ==> Temmuz");
            } else if (months == 8) {
                System.out.println("8 ==> Agustos");
            } else if (months == 9) {
                System.out.println("9 ==> Eylul");
            } else if (months == 10) {
                System.out.println("10 ==> Ekim");
            } else if (months == 11) {
                System.out.println("11 ==> Kasim");
            } else {
                System.out.println("12 ==> Aralik");
            }}
        else{
            System.out.println("invalid");
        }

    }
}
