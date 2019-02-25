package console;

import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	static String com;
	public static void main(String[] args) 
	{
		System.out.println("Ejercicios Basicos Java \n by Gabe\n\n");
		boolean activo = true;
		while(activo == true)
		{
			System.out.println("$> ");
			com = sc.next();
			switch(com)
			{
				default:
					System.out.println("Operacion invalida. Verifica e intenta nuevamente o escribe 'ayuda' para ver mas comandos");
					break;
				case("salir"):
					activo = false;
					return;
				case("ayuda"):
					System.out.println("comando \t descripción \n"
							+ "salir \t Cierra el programa \n"
							+ "ayuda \t Muestra esta ayuda \n"
							+ "punto1 \t  Programa java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuación, muestra por pantalla: El valor de cada variable, la suma de N + A, la diferencia de A - N, el valor numérico correspondiente al carácter que contiene la variable C. ");
					break;
			}
		}

	}

}
