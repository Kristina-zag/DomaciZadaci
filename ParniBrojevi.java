package Domaci2;

import java.util.Scanner;

public class ParniBrojevi {
	
	public static void main (String[] args) {
			
	
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Prikazite sve parne brojeve izmedju:");
		int a = scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("Parni brojevi izmedju "+a+" i "+b+" su:");
		
		while(a<=b){
		if(a%2==0){
			System.out.println(a);
		}
		 a++;
		}
		}
}