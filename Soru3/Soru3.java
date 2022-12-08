package Soru3;
import java.util.Scanner;
public class Soru3 {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Sayı çift mi tek kontrol eden programa hoş geldiniz");
	System.out.println("Sayı giriniz: ");
	int Sayi=input.nextInt();
		if (Sayi%2==0) {
			System.out.println("girdiniz sayı "+ Sayi +"çifttir.");
		}
		 if (Sayi%2==1) {
			 System.out.println("girdiniz sayı "+ Sayi + "tektir.");
			
		}
		
		
	}

}
