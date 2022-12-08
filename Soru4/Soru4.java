package Soru4;
import java.util.Scanner;
public class Soru4 {

	public static void main(String[] args) {
		System.out.println(" Fibonacci programa hoş geldiniz");
        Scanner input = new Scanner(System.in);
        int n , a =0 ,b =0 ,c =1;
        System.out.print("kaç terim istiyorsun çıktı yazdırsın: ");
        n=input.nextInt();
       for (int i = 1;i<=n;i++) {
    	   a=b;
           b=c;
           c=a+b;
           System.out.print(a+" ");
       }
        
        		
	}

}
