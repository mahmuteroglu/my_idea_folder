package Week5;

import java.util.Arrays;

public class Ornek1 {
    public static void main(String[] args) {

        //    //1.adim str tanimladik
        //    String str = "HeySiri";
        //    //2.adim HeySiri yi ByeSiri ye donustur

        String str = "HeySiri";
        str = str.replace("Hey", "Bye");
        System.out.println(str);
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
    }
}
