package nekretnine;

import Domaci3.Nekretnina;

public class Stan extends Nekretnina{
	int površinaPodruma;
	int površinaTerase;
	double iznos;
	
	public Stan() {
	adresa = "Jurija Gagarina 5, Beograd";
	zona = "II zona";
	imePrezime = "Mika Mikic";
	jmbg = "04059882222";
	brLicneKarte = "123456789";
	kvadratura = 90; 
	površinaPodruma=50;
	površinaTerase=6;
	}
	
	
	public double cena() {
		if(zona=="I zona") {
			iznos = (3000*kvadratura) +((površinaPodruma+površinaTerase) * 3000 * 33/100);
			
	}
	
	else if (zona=="II zona") {
		iznos = (2000*kvadratura) +((površinaPodruma+površinaTerase) * 2000 * 33/100);
		
	}
	
	else if (zona=="III zona") {
		iznos = (1000*kvadratura) +((površinaPodruma+površinaTerase) * 1000 * 33/100);
		
	}
			
	else if (zona=="IV zona") {
		iznos = (500*kvadratura) +((površinaPodruma+površinaTerase) * 500 * 33/100);	
	}
		return iznos;
}
	
	@Override
	public String toString() {
		return "Vlasnik stana je: " + imePrezime  + " na lokaciji " + adresa + " sa cenom: " +  (new Double(cena()).toString());
	}

}
