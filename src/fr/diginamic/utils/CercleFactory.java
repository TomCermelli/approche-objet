package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	public static Cercle createCircle(double rayons) {
		Cercle circle = new Cercle(rayons);
		return circle;
	}
}
