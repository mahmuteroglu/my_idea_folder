package DE35_Lamda.TaskMapAndFilter;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan oluşan bir List yapın
    stream yardım ile
   a) Bu list in tek elemanlarına, 1 ekleyin, çift elemalarını ise kaldırın (silin)
   b) aynısını stream içerisinde metot kullanarak yapın

     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            int sayi = (int) (Math.random()*100+1);
            list.add(sayi);
        }
    }
}
