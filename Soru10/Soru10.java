//"Bir dersin not ortalama hesaplayan programa hos geldiniz"
package Soru10;
import java.util.Scanner;
public class Soru10 {
public static void main(String[]args) {
System.out.println("Bir dersin not ortalama hesaplayan programa hos geldiniz");
Scanner input= new Scanner(System.in);
System.out.println("Vize Notu giriniz: ");
float Vize_Notu=input.nextFloat();
System.out.println("Finel Notu giriniz: ");
float Finel_Notu=input.nextFloat();
float Ortalama= (float) ((0.4)*Vize_Notu+(0.6)*Finel_Notu);
if (Ortalama>=95) 
	System.out.print("AA"+" "+"Geçtiniz"+" "+"Ortalama ="+Ortalama);
    
else if(Ortalama>=85) 
	System.out.println("BA"+" "+"Geçtiniz"+" "+"Ortalama ="+Ortalama);	
	
else if (Ortalama>=80) 
	 System.out.println("BB"+" "+"Geçtiniz"+" "+"Ortalama ="+Ortalama);
	
else if (Ortalama>=75) 
		System.out.println("CB"+" "+"Geçtiniz"+" "+"Ortalama ="+Ortalama);
	
else if (Ortalama>=70) 
		System.out.println("CC"+" "+"Geçtiniz"+" "+"Ortalama ="+Ortalama);
	
else if (Ortalama>=65) 
		System.out.println("DC"+" "+"Geçtiniz"+" "+"Ortalama ="+Ortalama);
	
else if (Ortalama>=50) 
		System.out.println("DD"+" "+"Geçtiniz"+" "+"Ortalama ="+Ortalama);
	
else  
	System.out.println("FF"+" "+"Geçmediniz malesef"+" "+"Ortalama ="+Ortalama);
	
 
}
}
