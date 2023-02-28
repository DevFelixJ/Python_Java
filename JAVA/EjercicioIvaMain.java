package com.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EjercicioIvaMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un precio: ");
        int precio = teclado.nextInt();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("El precio con IVA es: " + df.format(precio * iva()) + " euros");

    }

    static double iva(){
        double iva = 1.21d;
        return iva;

    }
}
