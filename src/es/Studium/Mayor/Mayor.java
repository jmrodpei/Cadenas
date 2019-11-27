package es.Studium.Mayor;

import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String[]tabla=new String[5];
		String cadena = "0";
		
		for (int i=0;i<(tabla.length);i++)
		{
			System.out.println("Escriba la palabra número "+(i+1));
			tabla[i]=teclado.next();
		}
		
		cadena = tabla[0];
		for (int i=0;i<(tabla.length)-1;i++)
		{
			if (tabla[i].compareTo(cadena)>0)
			{
				cadena=tabla[i];
			}
		}
		System.out.println("La cadena alfabéticamente mayor es: " +cadena);
		teclado.close();
}
	
}
