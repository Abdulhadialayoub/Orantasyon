//Daireni alanı ve çevresini hesaplayan programa Hoş geldiniz
package Soru1;
	import java.util.Scanner;
	public class Soru1 {
		public static void main(String[] args) {
	     Scanner r = new Scanner(System.in);
	     final double Pİ_SAYISI= 3.14159;
	     //PI SAYISINI tanımlamasını yaptık
	     System.out.println("Daireni alanı ve çevresini hesaplayan programa Hoş geldiniz");
	   //daireni alanı ve çevresini hesaplayan programı ekrana yazdıran komudu.
	     System.out.println("Lütfen yarıçapı (r) giriniz ");
	     double Yarıcap= r.nextDouble();
	     double Daire_alanı=Yarıcap*Yarıcap*Pİ_SAYISI;
	     double Daire_cevre=2*Yarıcap*Pİ_SAYISI;
	     System.out.println("Daire alanı için 1'e basınız dairenin Çevresi için 2");
	     int input=r.nextInt();
	     switch(input) {
	     case 1:	System.out.println("Dairenin Alanı="+Daire_alanı); break;
	     
	     case 2:	System.out.println("Dairenin Çevresi"+Daire_cevre); break;
	     
	     default: System.out.println("lütfen geçerli bir sayı giriniz 1 için alan 2 için çevre");
	     		  System.exit(1);
	     
	     
	     
	     
	     }
	     
	     
	     
	     


		
		
		
		
		
		
		
		
		
		}

	}
