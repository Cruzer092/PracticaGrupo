package EstructurasControl;

import java.util.Scanner;

public class MayorMenor 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un n�mero entero: ");
		int num = entrada.nextInt();
		if (num < 0)
			System.out.println("El n�mero " + num + " es menor que 0");
		else
			System.out.println("El n�mero " + num + " es mayor que 0");
		
		
	}

}
