//logritma hesaplan programa hoş geldiniz
package Soru7;
import java.util.Scanner;
public class Soru7 {
 public static void main(String[]args) {
 	Scanner input = new Scanner(System.in);
 	System.out.print("logritma hesaplan programa hoş geldiniz");
 	System.out.print("a ve b Sayıları giriniz:");
	int a = input.nextInt();
	int b=  input.nextInt();
	double cevap= Math.log10(b)/Math.log10(a);
	System.out.println("Cevap:"+cevap);
	
	
	
 }
}
