package com.ejercicios;

import java.util.Iterator;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIf = 2;
		int numeroWhile = 0;
		String estacion = "primavera";
		
		//Primera parte
		if (numeroIf > 0) {
			System.out.println("Este numero es positivo");
			
		}else if(numeroIf == 0) {
			System.out.println("El numero es cero");
		}else {
			System.out.println("El numero es negativo");
		}
		
		//Segunda Parte
		while (numeroWhile < 3) {
			System.out.println("El valor es: " + numeroWhile);
			numeroWhile++;
			
		}
		
		//Tercera Parte
		do {
			System.out.println("El valor del numero en el Do While es: "
								+ numeroWhile);
		} while (numeroWhile < 3);
		
		//Cuarta Parte
		for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println("El valor de numeroFor es:" + numeroFor);
			
		}
		
		//Quinta parte
		switch (estacion) {
		case "primavera":
			System.out.println("Es primavera");
			
			break;
		case "verano":
			System.out.println("Es verano");
			
			break;
		case "otonno":
			System.out.println("Es otonno");
			break;
		case "invierno":
			System.out.println("Es invierno");
			break;

		default:
			System.out.println("No se ha indicado la estacion correcta");
			break;
		}
		
		
		
		
	}

}
