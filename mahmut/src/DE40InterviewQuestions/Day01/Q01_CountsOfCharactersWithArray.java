package DE40InterviewQuestions.Day01;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini(kaç adet olduğunu) ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz :");
        String str = scan.nextLine();
        String[]arr =str.split("");
        Arrays.sort(arr);
        int counter=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i-1].equals(arr[i])){

                counter++;

            }
            else {
                System.out.println(arr[i-1]+"sayisi="+(counter+1)+ "adettir");
                counter=0;

            }
            if(i== arr.length-1){
                System.out.println(arr[i-1]+"sayisi="+(counter+1)+ "adettir");

            }

        }



    }

}
