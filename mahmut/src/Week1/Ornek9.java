package Week1;

import java.util.Scanner;

public class Ornek9 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int s1= scanner.nextInt();
        double s2= scanner.nextDouble();

        System.out.println("enB: "+(Double.max(s1,s2)));
    }
}
