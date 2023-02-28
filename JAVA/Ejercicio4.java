package com.ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Felix");
		cliente.setEdad(31);
		cliente.setTelefono(123456789);
		cliente.setCredito(1500.45);
		System.out.println(
			"El nombre del cliente es: " + cliente.getNombre()+
			", con la edad de: "+ cliente.getEdad()+
			", con telefono: "+cliente.getTelefono()+
			" y con un credito de: " + cliente.getCredito()+" euros."
			);
		
		Trabajador trabajador = new Trabajador();
		trabajador.setNombre("Maria");
		trabajador.setEdad(25);
		trabajador.setTelefono(123456780);
		trabajador.setSalario(1800.50);
		System.out.println(
			"El nombre del trabajador/a es: " + trabajador.getNombre()+
			", con la edad de: "+ trabajador.getEdad()+
			", con telefono: "+ trabajador.getTelefono()+
			" y con un salario de: " + trabajador.getSalario()+" euros."
			);
	}

}

class Persona{
	int edad;
	int telefono;
	String nombre;
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public int getTelefono() {
		return this.telefono;
	}
	public String getNombre() {
		return this.nombre;
	}
}//Fin Persona

class Cliente extends Persona{
	
	double credito;
	
	public void setCredito(double credito) {
		this.credito = credito;
	}

	
	public double getCredito(){
		return this.credito;
	}
}//Fin Cliente

class Trabajador extends Persona{
	double salario;
	
	public void setSalario(double credito) {
		this.salario = credito;
	}

	
	public double getSalario(){
		return this.salario;
	}
	
}//Fin Trabajador



