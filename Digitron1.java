package Domaci1;

import java.util.Scanner;

public class Digitron1 {
	
	
	
	static Scanner ulaz = new Scanner(System.in);
	

	
	
	
	 public static void operacijaSabiranje ( int operator1, int operator2) {
		 int rezultatSabiranja = operator1 + operator2;
    	 System.out.println("Rezultat sabiranja je: " + rezultatSabiranja);
	    }
	 
	 public static void operacijaOduzimanja ( int operator1, int operator2) {
		 int rezultatOduzimanja = operator1 - operator2;
    	 System.out.println("Rezultat oduzimanja je: " + rezultatOduzimanja);
		 
	    }
	 
	 public static void operacijaMnozenje ( int operator1, int operator2) {
		 int rezultatMnozenja = operator1 * operator2;
    	 System.out.println("Rezultat mnozenja je: " + rezultatMnozenja);
		 
	    }
	 
	 public static void operacijaDeljenje ( int operator1, int operator2) {
		 int rezultatDeljenja = operator1 / operator2;
    	 System.out.println("Rezultat deljenja je: " + rezultatDeljenja);
		 
	    }
	
	 
	public static void main (String[] args) {
		
		System.out.println("Uneti dva cela broja: ");
		
		 int operator1 = ulaz.nextInt();
		 int operator2 = ulaz.nextInt();
		 
		 char operacija = 's';
		 
		 if(operacija=='s') 
		 {operacijaSabiranje(operator1, operator2);}
		 
		 else if(operacija=='o') 
		 {operacijaOduzimanja(operator1, operator2);}
		 
		 else if(operacija=='m') 
		 {operacijaMnozenje(operator1, operator2);}
		 
		 else if(operacija=='d') 
		 {operacijaDeljenje(operator1, operator2);}
		 else {	
			 System.out.println("Nevalidna operacija");
			}

		
		
		

		      
		}
	
	

	}



