package geometrijskiOblici;

import Domaci3.GeometrijskaSlika;

public class Trougao extends GeometrijskaSlika {
	
	int b;
	
	public Trougao() {
		this.b = 3;
	}
	
	public Trougao(int b) {
		this.b = b;
	}
	
	public Trougao(Trougao t) {
		this.b = t.b;
	}
	

	@Override
	public double obim() {
		return b*3;
	}
	
	@Override
	public double povrsina() {
		return b * b * Math.sqrt(3) / 4;
	}
	
	@Override
	public String toString() {
		return "Obim trougla je: " + (new Double(obim()).toString()) + ", a " + "povrsina trougla je: " + (new Double(povrsina()).toString());
	}
}
