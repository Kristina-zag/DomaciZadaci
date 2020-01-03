package geometrijskiOblici;

public class Eklipsa extends Krug {
	
	int c;
	
	public Eklipsa() {
	super();
	c = 3;
	}

	@Override
	public double obim() {
		return r * Math.PI * (9- Math.sqrt(35))/2;
	}
	
	@Override
	public double povrsina() {
		return r * c * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Obim eklipse je: " + (new Double(obim()).toString()) + ", a " + "povrsina eklipse je: " + (new Double(povrsina()).toString());
	}

}


