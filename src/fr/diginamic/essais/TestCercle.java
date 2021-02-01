package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] arg) {
		Cercle[] tabGeo = new Cercle[2];
		Cercle circle1 = new Cercle(5);
		Cercle circle2 = new Cercle(8);

		tabGeo[0] = circle1;
		tabGeo[1] = circle2;

		for (int i = 0; i < tabGeo.length; i++) {
			System.out.println("Objet de type : " + tabGeo[i].getClass().getSimpleName());
			System.out.println("Le périmètre du cercle est de " + tabGeo[i].perimetre());
			System.out.println("La surface du cercle est de  " + tabGeo[i].surface());
			System.out.println();
		}

		System.out.println();
		Cercle circle3 = CercleFactory.createCircle(10);
		System.out.println("Objet de type : " + circle3.getClass().getSimpleName());
		System.out.println("Le périmètre du cercle est de " + circle3.perimetre());
		System.out.println("La surface du cercle est de  " + circle3.surface());
		System.out.println();
	}
}
