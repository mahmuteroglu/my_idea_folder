package Week1;

public class Ornek4 {
    public static void main(String[] args) {
        //Bir variable tanimlayin sadece declare edin  : x
        //Baska bir variable initialize edin : y
        //x variable initialize edin
        //y variable'ı yeni bir value ile update ediniz.
        // int x;
        // int y=69;
        //Ardından x ve y değerlerini değiştirin.

        int x;
        int y = 69;
        x = 20;
        int t = y;
        y = x;
        x = t;
        System.out.println("x= " + x + "\n" + "y= " + y);


    }
}
