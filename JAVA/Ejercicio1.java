package com.ejercicios;

public class Ejercicio1 {
//En este ejercicio se pretende hacer un metodo para realizar la suma de tres valores INT y la creacion de una clase 
//para incrementar el numero de puertas de un coche
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int param1 = 1;
		int param2 = 2;
		int param3 = 3;
		var resultado = suma(param1, param2, param3);
		System.out.println(resultado);
		
		Coche miCoche = new Coche();
		miCoche.AnnadirPuerta();
		miCoche.AnnadirPuerta();
		miCoche.AnnadirPuerta();
		System.out.println(miCoche.puertas);
		
	}//Fin de Main

	public static int suma(int a, int b, int c) {
		return a + b + c;
	}
}//Fin de la clase Ejercicio 1

	class Coche{
	public int puertas = 0;
	public void AnnadirPuerta() {
		this.puertas++;} 
		
}


