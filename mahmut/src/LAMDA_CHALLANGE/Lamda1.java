package LAMDA_CHALLANGE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lamda1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        List<>

        printEachList(list);
        printEach.accept(list);
    }

    // S1:listi aralarinda bosluk birakarak yazdiriniz

    private static  void printEachList(List<Integer>list){
        list.stream().forEach((p)-> System.out.print(p+""));
    }
    static Consumer<List>printEach=(p)->{
        System.out.print(p+"");
    };

// S2: sadece negatif olanlari yazdir

    private  static  void print

            list.stream().filter(t->t<0).forEach(t)
// S3: pozitif olanlardan yeni bir liste olustur
// S4: list in elemanlarin karelerinden yeni bir list olusturalim
// S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
// S6: listin elemanlarini kucukten buyuge siralayalim
// S7: listin elemanlarini buyukten kucuge siralayalim
// S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
// S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
// S10 :list elemanlarini toplamini bulalim
// S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
/*
             peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
            ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
            yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir
*/
// S12 : listede 5 den buyuk  sayi var mi?
// S13 : listenin tum elemanlari sifirdan kucuk mu?
// S14: listenin 100 e esit elemani yok mu ?
// S15: listenin sifira esit elemani yok mu?
// S16:  listenin ilk 5 elemanini topla?
// S17: listenin son bes elemaninin  listele


}
