package örnekler;

import java.util.Scanner;

public class OrnekClass {
    public static void main(String[] args)
        {
            int not1;
            System.out.println("Lutfen sinav notlarinizi giriniz:");
            Scanner scanner = new Scanner(System.in);

            not1 = scanner.nextInt();
            System.out.println(not1<50);


            if (not1<50)
            {
                System.out.println("KALDI");
            }
            else
            {
                System.out.println("GEÇTİ");
            }
        }




    }
