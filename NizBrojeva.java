package Domaci2;

import java.util.Scanner;
import java.util.Arrays; 

public class NizBrojeva {
	public static void main(String[] args) 
    {
        int brojElementaNiza, max;
        //String imeStudenta;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj elementa niza:");
        brojElementaNiza = input.nextInt();
        int a[] = new int[brojElementaNiza];
        
             
        System.out.println("Uneti elemente niza:");
        for(int i = 0; i <brojElementaNiza; i++)
        {

            a[i] = input.nextInt();
                     
        }
        Arrays.sort(a);
        System.out.println("Prvih 5 elemenata niza");
        
        for (int i=0; i<5; i++) {
        	System.out.println(a[i]);
            
        }
        
}
	
}
