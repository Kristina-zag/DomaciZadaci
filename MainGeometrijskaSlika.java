package Domaci3;

import geometrijskiOblici.*;

public class MainGeometrijskaSlika {

	public static void main(String[] args) {
		
		GeometrijskaSlika gs1 = new Krug();
		GeometrijskaSlika gs2 = new Kvadrat(5);
		GeometrijskaSlika gs3 = new Trougao();
		
		GeometrijskaSlika gs4 = new Eklipsa();
		GeometrijskaSlika gs5 = new Pravougaonik(2, 4);
		GeometrijskaSlika gs6 = new NejednakostranicniTrougao();
		
		System.out.println(gs1);
		System.out.println(gs2);
		System.out.println(gs3);
		System.out.println(gs4);
		System.out.println(gs5);
		System.out.println(gs6);

			
}
}