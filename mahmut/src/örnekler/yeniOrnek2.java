package örnekler;

public class yeniOrnek2 {
    public static void main(String[] args) {

        int[][] arr = {{2, 3, 1}, {4, 1}, {1, 2, 5, 6, 7}};


        int satirSayisi = arr.length;


        for (int i = 0; i < satirSayisi; i++) {

            int sutunSayisi = arr[i].length;

            int carpim = 1;
            for (int j = 0; j < sutunSayisi; j++) {
                carpim *= arr[i][j];
            }

            System.out.println(carpim);
        }

    }
}
