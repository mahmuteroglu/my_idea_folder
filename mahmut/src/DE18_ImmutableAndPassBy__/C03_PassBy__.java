package DE18_ImmutableAndPassBy__;

import java.util.Arrays;

public class C03_PassBy__ {
    public static void main(String[] args) {
        // System.identityHashCode()
        int[] dizi = new int[10];
        System.out.println("dizi ref= "+System.identityHashCode(dizi));
        metotDizi(dizi);
        System.out.println("dizi ref= "+System.identityHashCode(dizi));
        System.out.println(Arrays.toString(dizi));
        metotDizi2(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println("clear comutu referansı ");



    }

    private static void metotDizi(int[] ss) {
        System.out.println("ss   ref= "+System.identityHashCode(ss));
        for (int i = 0; i <ss.length ; i++) {
            ss[i] = i*i;
        }
        System.out.println("ss   ref= "+System.identityHashCode(ss));
    }
    private static void metotDizi2(int[] ss) {
        System.out.println("ss2  ref= "+System.identityHashCode(ss));
        ss[0] = 4754;
        ss = new int[10];// buradan itibaren çağrıldığı yerle irtibatı kopuyor
        System.out.println("ss2  ref= "+System.identityHashCode(ss));
        for (int i = 0; i <ss.length ; i++) {
            ss[i] = 100+i;
        }
        System.out.println("ss2  ref= "+System.identityHashCode(ss));
        System.out.println(Arrays.toString(ss));
    }

/* Aklımızda kalması gereken,
dizileri ve StrinBulder ları bir metota yolladığımızda , orada dizide yaptığımız değişiklikler
ana kısımdaki (metotun çağrıldığı yerdeki) diziyide bağlar,
 ancak bu diziye yeni refreans atanırsa( yani new lenirse, yani dizi = new int[n] veya list=new ArrayList<>();),
bu refarans atamasından sonraki değişiklikler yukarıyı(metotun çağrıldığı yeri) bağlamaz
bu durum mutable class olan varable için geçerlidir
(Arrays, List, set , Map, StringBulder, Queue)

bunlar için ise geçerli değildir (int,double,byte,short,char,wappers, long,float,String)
 */

}
