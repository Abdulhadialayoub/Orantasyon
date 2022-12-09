//iki Sayını ortalamasını hesaplayan programa hoşgeldiniz
package Soru10;
import java.util.Scanner;
public class Soru10 {
public static void main(String[]args) {
System.out.println("iki Sayını ortalamasını hesaplayan programa hoşgeldiniz");
Scanner input = new Scanner(System.in);
System.out.println("Birinci Sayı giriniz:");
float x = input.nextFloat();
System.out.println("ikinci Sayı giriniz:");
float y = input.nextFloat();
float z= (x+y)/2;
System.out.println("Cevap:"+z);
 }			
}
