package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double a = 12;
		double b = 2;

		double calcul = Operations.calculParam(a, b, '+');
		double calcul2 = Operations.calculParam(a, b, '-');
		double calcul3 = Operations.calculParam(a, b, '*');
		double calcul4 = Operations.calculParam(a, b, '/');

		System.out.println("Addition " + a + "+" + b + " = " + calcul);
		System.out.println();
		System.out.println("Soustraction " + a + "-" + b + " = " + calcul2);
		System.out.println();
		System.out.println("Multiplication " + a + "*" + b + " = " + calcul3);
		System.out.println();
		System.out.println("Division de  " + a + "/" + b + " = " + calcul4);

	}

}
