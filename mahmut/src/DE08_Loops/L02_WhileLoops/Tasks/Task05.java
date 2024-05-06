package DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz
		Örnek : isim = ali kale
		cıktı : A B C D E
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("İsminizi giriniz: ");
		String isim = scanner.nextLine();

		System.out.print("Soyisminizi giriniz: ");
		String soyisim = scanner.nextLine();

		int isimIndex = 0;
		int soyisimIndex = soyisim.length() - 1;

		while (isimIndex <= soyisimIndex) {
			System.out.print(isim.charAt(isimIndex) + " " + soyisim.charAt(soyisimIndex));
			isimIndex++;
			soyisimIndex--;
		}



	}

}
