package fr.diginamic.operations;

public class Operations {

	public static double calculParam(double a, double b, char operateur) {
		
		if(operateur == '+') {
			return a + b;
		}
		
		else if(operateur == '-') {
			return a - b;
		}
		
		else if(operateur == '*') {
			return a * b ;
		}
		
		else if(operateur == '/') {
			return a / b;
		} 
		else {
			return a + b;
		}
	}
}
