package Domaci2;

import java.util.Scanner;

public class BrojStudenata01 {
	public static void main(String[] args) 
    {
        int brojStudenata, max;
        //String imeStudenta;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj studenata:");
        brojStudenata = input.nextInt();
        int a[] = new int[brojStudenata];
        
             
        System.out.println("Uneti broj poena:");
        for(int i = 0; i < brojStudenata; i++)
        {
        	String imeStudenta = input.next();
            a[i] = input.nextInt();
            
        }
        max = a[0];
        for(int i = 0; i < brojStudenata; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maksimalan broj poena:"+max);
    }
	
	
}
