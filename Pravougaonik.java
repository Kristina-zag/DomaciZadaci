package geometrijskiOblici;

public class Pravougaonik extends Kvadrat{
	
	int d;
	
	public Pravougaonik(int a, int d) {
		super(a);
		this.d=d;		
	}
	
	@Override 
	public  double obim() {
		return 2 *a + 2 * d;	
	}
	
	@Override
	public double povrsina() {
		return a * d;
	}
	
	@Override
	public String toString() {
		return "Obim pravougaonika je: " + (new Double(obim()).toString()) + ", a " + "povrsina pravougaonika je: " + (new Double(povrsina()).toString());
	}

}
