package Soru2;
import java.util.Scanner;
public class Soru2 {

	public static void main(String[] args) {
	 System.out.println("𝑎𝑥2+𝑏𝑥+𝑐=0denklemin köklerini bulan programına Hoş geldiniz");
	 Scanner input= new Scanner(System.in);
	 System.out.println("a Sayını değerini giriniz:");
	 double a = input.nextDouble();
	 System.out.println("b Sayını değerini giriniz:");
	 double b = input.nextDouble();
	 System.out.println("c Sayını değerini giriniz:");
	 double c = input.nextDouble();
	 double Delta=(b*b)-(4*a*c);
	  if (Delta>0) {
		 double x1= (-1*(b)-Math.sqrt(Delta))/2*a;
		 double x2= (-1*(b)+Math.sqrt(Delta))/2*a;
		 System.out.println("x1: "+ x1 + "x2: "+ x2 );
	}
	   if (Delta<0) {
	 System.out.println("Denklemin Gerçel Kökü Yoktur");	
	}
	
	   if (Delta==0) {
		   double x= (-1*b)/(2*a);
		   System.out.println("Çakışık kökü var x1= x2="+ x);
		   
	   }
	
	
	
	}

}
