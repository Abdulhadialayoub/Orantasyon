package Soru5;
import java.util.Scanner;
public class Soru5 {
	public static void main(String []args) {
		System.out.println("üslü sayının hesaplayan programa hoş geldiniz");
		Scanner input=new Scanner(System.in);
		System.out.print("tabanı giriniz");
		double a=input.nextDouble();
		System.out.print("üstü giriniz");
		double b=input.nextDouble();
		double X=Math.pow(a, b);
		System.out.print(X);
	}

}
