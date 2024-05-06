package Week5;

public class Ornek6 {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir METHOD
         * yaziniz(return type int)
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int multiArr[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};

        System.out.println("sumEvenNumber(multiArr) = " + sumEvenNumber(multiArr));//method dizinin elemanındaki çift sayıları toplaması için

    }

    private static int sumEvenNumber(int[][] multiArr) {//return type int toplamı almak için
        int sum = 0;
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {//dizinin her bir elemanın çift olup olmadığını kontrol
                if (multiArr[i][j] % 2 == 0) {
                    sum += multiArr[i][j];
                }
            }
        }

        return sum;
    }
}