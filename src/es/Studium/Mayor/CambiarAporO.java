package es.Studium.Mayor;

import java.util.Scanner;

public class CambiarAporO
{
	public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
		
		String texto1;
		
		System.out.println("Escribe un texto:");
		
		texto1=teclado.next();
		texto1=texto1.replace('a', 'o');
		
		
		System.out.println("El cambio es:"+texto1);
				
		
	teclado.close();	
	}

}
