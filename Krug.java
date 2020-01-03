package geometrijskiOblici;

import Domaci3.GeometrijskaSlika;

public class Krug extends GeometrijskaSlika{
	
	int r;
	
	public Krug() {
		this.r = 3;
	}
	
	public Krug(int r) {
		this.r = r;
	}
	
	public Krug(Krug kr) {
		this.r = kr.r;
	}
	
	@Override
	public double obim() {
		return 6 *r * Math.PI;
	}
	
	@Override
	public double povrsina() {
		return r *r * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Obim kruga je: " + (new Double(obim()).toString()) + ", a " + "povrsina kruga je: " + (new Double(povrsina()).toString());
	}
}

