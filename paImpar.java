package EstructurasControl;

import java.util.Scanner;

public class paImpar 
{

	public static void main(String[] args)
	{
	// Introduce por teclado un número entero. Visualizar en pantalla si es par o impar.
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un número entero:");
		int num = entrada.nextInt();
		if (num %2 == 0 )
			System.out.println("El número " + num + " es par");
		else
			System.out.println("El número " + num + " es impar");
		
		
	
	
	
	
	
	
	}

}
