package es.Studium.Mayor;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String texto;
		int contador=0;

		System.out.println("Escriba un texto:");
		texto=teclado.nextLine();
		teclado.close();

for (int i=0;i<texto.length();i++)
		{
			if

			(((int)texto.charAt(i)==65)||((int)texto.charAt(i)==69)||((int)texto.charAt(i)==73)||((int)texto.charAt(i)==79)||((int)texto.charAt(i)==85)||((int)texto.charAt(i)==97)||((int)texto.charAt(i)==101)||((int)texto.charAt(i)==105)||((int)texto.charAt(i)==111)||((int)texto.charAt(i)==117))
			
				contador++;
			
		}
		
System.out.println("El número de vocales existente en el texto es:" +contador);
	}						

}
