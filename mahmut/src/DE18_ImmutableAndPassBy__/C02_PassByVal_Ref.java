package DE18_ImmutableAndPassBy__;

public class C02_PassByVal_Ref {
    public static void main(String[] args) {
       // System.identityHashCode()
        int s1=10;
        System.out.println("s1 ref= "+System.identityHashCode(s1));
        metot(s1);
        System.out.println("s1 ref= "+System.identityHashCode(s1));
        System.out.println(s1);


    }



    private static void metot(int ss) {
        System.out.println("ss ref= "+System.identityHashCode(ss));
        ss++;
        System.out.println("ss ref= "+System.identityHashCode(ss));
    }


}
