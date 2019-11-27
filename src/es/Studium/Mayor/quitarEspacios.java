package es.Studium.Mayor;

import java.util.Scanner;

public class quitarEspacios {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena;

		System.out.println("Introduzca una cadena:");
		
		cadena=teclado.next();
		
		cadena=cadena.replaceAll(" ", "");
		
		System.out.println("El resultado del cambio es:"+cadena);
	
	teclado.close();
	}

}