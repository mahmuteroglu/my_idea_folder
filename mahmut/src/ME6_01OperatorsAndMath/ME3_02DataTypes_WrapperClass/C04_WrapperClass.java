package ME6_01OperatorsAndMath.ME3_02DataTypes_WrapperClass;

public class C04_WrapperClass {
    /*
           Note: Java primitive lere method'lar ekleyerek yeni bir
                 yapi olusturdu, bu yapiya "Wrapper Class"
                 Primitive         Wrapper
                    byte     ==>    Byte
                    short    ==>    Short
                    ** int   ==>    Integer
                    long     ==>    Long
                    float    ==>    Float
                    double   ==>    Double
                    boolean  ==>    Boolean
                    ** char  ==>    Character
        */
    public static void main(String[] args) {
        int sayi1 = 25;
        int sayi2 = Integer.MAX_VALUE;


        System.out.println(sayi2);
        System.out.println(Integer.MIN_VALUE);
        int sonuc = Integer.max(sayi1, sayi2);
        System.out.println("Buyuk olan : " + sonuc);
        System.out.println("Buyuk olan : " + Integer.max(sayi1, sayi2));
        System.out.println("Küçük olan : " + Integer.min(sayi1, sayi2));
        int s1 = 11, s2 = 21, s3 = 51, s4 = 6;
        int b1 = Integer.max(s1,s2);
        int b2 = Integer.max(s3,s4);
        int enB = Integer.max(b1,b2);

    }
}
