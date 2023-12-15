package SayiTersi;
import java.util.Scanner;

public class TersSayi {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz: ");
		
		int s = scan.nextInt();
		int ters = 0;
		int y = s;
		
		for(; s != 0; s/=10) {
			int bas = s % 10;
			ters = (ters * 10) + bas;
		}
		System.out.println("Sayının Kendisi: " + y + "\nSayının Tersi İse: " + ters);

	}

}
