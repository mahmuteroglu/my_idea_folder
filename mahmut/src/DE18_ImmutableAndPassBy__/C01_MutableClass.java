package DE18_ImmutableAndPassBy__;

public class C01_MutableClass {
    public static void main(String[] args) {
        int sayi=10;
        System.out.println(System.identityHashCode(sayi));
        sayi++;
        System.out.println(System.identityHashCode(sayi));
        int sayi2=10;
        System.out.println(System.identityHashCode(sayi2));
        System.out.println("------");
        String str1 = "Hasan";
        System.out.println(System.identityHashCode(str1));
        String str2 = "Hasan";
        System.out.println(System.identityHashCode(str2));
        if (str1 == str2) System.out.println("eşittir");
        else System.out.println("eşit değildir");
        String str3="Ha";
        str3 = str3 +"san";
        if (str1 == str3) System.out.println("eşittir");
        else System.out.println("eşit değildir");
        System.out.println(System.identityHashCode(str3));
        int sayi5=11;
        System.out.println(System.identityHashCode(sayi5));
        sayi5=sayi5-1;
        System.out.println(System.identityHashCode(sayi5));
    }
}
