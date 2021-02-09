package fr.diginamic.testexceptions;

import listes.Ville;

public class TestReflectionUtils {

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		Ville ville = new Ville("Montpellier", 280_000);
		try {
			ReflectionUtils.afficherAttributs(null);
		} 

		catch (ReflectionException e) {
			System.err.println(e.getMessage());
		}

	}
}
