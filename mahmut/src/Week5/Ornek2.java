package Week5;

public class Ornek2 {
    public static void main(String[] args) {



        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

//        5 ve 4 toplami :9
//        7 ve 2 toplami :9
//                -6 ve 15 toplami :9
//        8 ve 1 toplami :9


        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == istenenToplam) {

                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }


    }






}
