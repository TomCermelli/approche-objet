package geometrie;

import geometrie.entite.Cercle;
import geometrie.entite.ObjetGeometrique;
import geometrie.entite.Rectangle;

public class TestObjetGeometrique {
	
	public static void main(String[] arg) {
		
		ObjetGeometrique[] tabGeo = new ObjetGeometrique[2]; 
		Cercle circle = new Cercle(5);
		Rectangle rectangle1 = new Rectangle(7,5);
		
		tabGeo[0] = circle;
		tabGeo[1] = rectangle1;
		
		for(int i=0; i<tabGeo.length; i++) {
			System.out.println("Objet de type : " + tabGeo[i].getClass().getSimpleName());
			System.out.println("Le périmètre de l'objet géométrique est de " + tabGeo[i].perimetre());
			System.out.println("La surface de l'objet géométrique est de " + tabGeo[i].surface());
			System.out.println();
		}
	}
}
