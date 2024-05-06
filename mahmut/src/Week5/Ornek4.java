package Week5;

public class Ornek4 {
    public static void main(String[] args) {


        /*
         * {{1,2,3}, {2,3,-8} , {5,2,5} , {-12,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min numberı ve dizinin her bir elemanı kaç diziden olştuğunu yazdırın
         */

        int arr[][] = {{1, 2, 3}, {-5, 3, 1}, {5, -12, 5}, {2, -1}};

        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) { //outer for
            System.out.println("arr [" + i + "]. length i : " + arr[i].length);
            for (int j = 0; j < arr[i].length; j++) { //inner for
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("min = " + min);
    }
}
