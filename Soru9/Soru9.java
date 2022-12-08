package Soru9;
import java.util.Scanner;
public class Soru9 {
public static void main(String[]args) {
Scanner input = new Scanner(System.in);
System.out.print("iki sayının karşılaştırma programına Hoş geldiniz");
System.out.print("Birinci Sayı giriniz:");
float x =input.nextFloat();
System.out.print("İkinci Sayı giriniz:");
float y =input.nextFloat();
	if (x>y) {
     System.out.println(x+"Sayısı büyük"+y);
     	
	 }
	else if(y>x) {
	     System.out.println(y+"Sayısı büyük"+x);
	     	
		 }
	else {
		System.out.println("her iki sayı eşittir birbirine");
	}
	
	
	
	
  }
}
