package örnekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class yeniOrnek {
    public static void main(String[] args) {
        List<Integer> sayiList =new ArrayList<>( Arrays.asList(16,21,33,54,15,45,58));


// DataType  dataName : data kaynagı
        for (Integer deger : sayiList) {//Integer type'de deger'a sayıList'in her bir elemanı atandı
            System.out.println(deger);
        }
        System.out.println();
// listin bir kısmını tarama ?
// litenin ilk 5 elemanını yazdıralım
        for (Object eleman : ((ArrayList<?>) sayiList).subList(0,5)){
            System.out.print(eleman+ " ");
        }
// for each kullanarak liteyi,başka bir liste ters-çevirin



        }


        }




