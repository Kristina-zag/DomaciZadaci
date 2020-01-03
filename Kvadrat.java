package geometrijskiOblici;

import Domaci3.GeometrijskaSlika;

public class Kvadrat extends  GeometrijskaSlika{
	
	int a;
	
	public Kvadrat() {
		this.a = 3;
	}
	
	public Kvadrat(int a) {
		this.a = a;
	}
	
	public Kvadrat(Kvadrat kv) {
		this.a = kv.a;
	}
	
	@Override
	public double obim() {
		return a * 4;
	}
	
	@Override
	public double povrsina() {
		return a*a;
	}

	@Override
	public String toString() {
		return "Obim kvadrata je: " + (new Double(obim()).toString()) + ", a " + "povrsina kvadrata je: " + (new Double(povrsina()).toString());
	}
}
