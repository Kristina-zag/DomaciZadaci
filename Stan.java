package nekretnine;

import Domaci3.Nekretnina;

public class Stan extends Nekretnina{
	int povr�inaPodruma;
	int povr�inaTerase;
	double iznos;
	
	public Stan() {
	adresa = "Jurija Gagarina 5, Beograd";
	zona = "II zona";
	imePrezime = "Mika Mikic";
	jmbg = "04059882222";
	brLicneKarte = "123456789";
	kvadratura = 90; 
	povr�inaPodruma=50;
	povr�inaTerase=6;
	}
	
	
	public double cena() {
		if(zona=="I zona") {
			iznos = (3000*kvadratura) +((povr�inaPodruma+povr�inaTerase) * 3000 * 33/100);
			
	}
	
	else if (zona=="II zona") {
		iznos = (2000*kvadratura) +((povr�inaPodruma+povr�inaTerase) * 2000 * 33/100);
		
	}
	
	else if (zona=="III zona") {
		iznos = (1000*kvadratura) +((povr�inaPodruma+povr�inaTerase) * 1000 * 33/100);
		
	}
			
	else if (zona=="IV zona") {
		iznos = (500*kvadratura) +((povr�inaPodruma+povr�inaTerase) * 500 * 33/100);	
	}
		return iznos;
}
	
	@Override
	public String toString() {
		return "Vlasnik stana je: " + imePrezime  + " na lokaciji " + adresa + " sa cenom: " +  (new Double(cena()).toString());
	}

}
