package DE40InterviewQuestions.Day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};

        arr= Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr));



        }

    }


