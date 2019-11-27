package es.Studium.Mayor;

import java.util.Scanner;

public class copiar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena, aux;
		
		System.out.println("Escribe una cadena de texto:");
		cadena=teclado.next();
	
		aux=cadena;
	
		System.out.println("y la nueva cadena asignada es:"+aux);
		teclado.close();
	}


}
