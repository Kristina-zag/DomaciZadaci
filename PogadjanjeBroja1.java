package Domaci1;

import java.util.Scanner;

public class PogadjanjeBroja1  {

		
	 static int pogodiBroj(int pokusaj) {		    
		    int zamisljeniBroj = 1 + (int) (Math.random()*50);
			int razlika = Math.abs(pokusaj - zamisljeniBroj);
			int odstupanje;
			odstupanje = 5;
					
				if (razlika <= odstupanje && razlika != 0)  {
					return 1;
				} else if (razlika > odstupanje) {
					return 2;
				} else {
					return 0;
				}								
		  }
	
	public static void main(String[] args) {		

		int broj = pogodiBroj(25);
		
		if (broj == 1)  {
			System.out.println("Dobar pokusaj, bili ste jako blizu!");
		} else if (broj == 2) {
			System.out.println("Vise srece sledeci put...");
		} else {
			System.out.println("Neverovatno! Pogodili ste tacan broj!");

		}

	}
	
	}



