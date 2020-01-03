package geometrijskiOblici;

public class NejednakostranicniTrougao extends Trougao{
	
	int e;
	int f;
	int hd;
	
	public NejednakostranicniTrougao() {
	super();
	e=4;
	f=2;
	hd=5;
	}
	
	@Override
	public double obim() {
		return b + e + f;
	}

	@Override
	public double povrsina() {
		return (e * hd)/2;
	}
	
	@Override
	public String toString() {
		return "Obim nejednakostranicnog trougla je: " + (new Double(obim()).toString()) + ", a " + "povrsina nejednakostranicnog trougla je: " + (new Double(povrsina()).toString());
	}
}
