package nekretnine;

import Domaci3.Nekretnina;

public class Kuca extends Nekretnina{

	int povrsinaOkucnice;
	double iznos;
	
	
	public Kuca() {
	adresa = "Zablace bb";
	zona = "III zona";
	imePrezime = "Pera Peric";
	jmbg = "04059882222";
	brLicneKarte = "123456789";
	kvadratura = 120; 
	povrsinaOkucnice=300;
	}
	
	
	public double cena() {
		if(zona=="I zona") {
			iznos = (3000*kvadratura) +(povrsinaOkucnice * 3000 * 15/100);
			
	}
	
	else if (zona=="II zona") {
		iznos = (2000*kvadratura) +(povrsinaOkucnice * 2000 * 15/100);
		
	}
	
	else if (zona=="III zona") {
		iznos = (1000*kvadratura) +(povrsinaOkucnice * 1000 * 15/100);
		
	}
			
	else if (zona=="IV zona") {
		iznos = (500*kvadratura) +(povrsinaOkucnice * 500 * 15/100);	
	}
		return iznos;
}
	
	@Override
	public String toString() {
		return "Vlasnik kuce je: " + imePrezime  + " na lokaciji " + adresa + " sa cenom: " +  (new Double(cena()).toString());
	}
}




