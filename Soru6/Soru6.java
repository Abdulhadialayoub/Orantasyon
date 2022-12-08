package Soru6;
import java.util.Scanner;
public class Soru6 {
	public static void main(String []args) {
		System.out.println("Üçgenin alan ve çevresi hesaplayan programına hoş geldiniz");
		Scanner input=new Scanner(System.in);
		System.out.println("Tabanı uzunluğu giriniz:");
		float x=input.nextFloat();
		System.out.println("Yükseklik uzunluğu giriniz:");
		float y=input.nextFloat();
		System.out.println("hipotinus uzunluğu giriniz:");
		float z=input.nextFloat();
		float Üçgenin_alanı=(x*y)/2; 
		float Üçgenin_Çevrein=x+y+z;
		System.out.println("Üçgenin alanı=  "+Üçgenin_alanı);
		System.out.println("Üçgenin Çevresi=  "+Üçgenin_Çevrein);
		
	}

}
