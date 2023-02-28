package com.ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona = new Persona();
		persona.setEdad(30);
		persona.setNombre("Felix");
		persona.setTelefono(123456789);
		
		System.out.println("El nombre de la persona es: "+ persona.getNombre()+" Con la edad de: "+persona.getEdad() 
							+ " y con telefono: " + persona.getTelefono());

	}

}


class Persona{
	private int edad;
	private String nombre;
	private int telefono;
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getTelefono() {
		return this.telefono;
	}
}
