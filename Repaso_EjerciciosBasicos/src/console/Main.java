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
			System.out.print("@ejerciciosbasicos $> ");
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
					System.out.println("Los puntos están basados en el documento http://bit.ly/2IAyAAd. Para mayor informacion\n"
							+ "ingresa a la pagina para saber de que se esta hablando\n"
							+ "\nCOMANDO \t DESCRIPCION \n\n"
							+ "salir \t  Cierra el programa \n"
							+ "ayuda \t  Muestra esta ayuda \n"
							+ "\nEJERCICIOS BASICOS INICIALES PARA PRINCIPIANTES\n\n"
							+ "basico1 \t  Muestra el punto 1 de los ejercicios basicos iniciales\n"
							+ "basico2 \t  Muestra el punto 2 de los ejercicios basicos iniciales\n"
							+ "basico3 \t  Muestra el punto 3 de los ejercicios basicos iniciales\n"
							+ "basico4 \t  Muestra el punto 4 de los ejercicios basicos iniciales\n"
							+ "basico5 \t  Muestra el punto 5 de los ejercicios basicos iniciales\n"
							+ "basico6 \t  Muestra el punto 6 de los ejercicios basicos iniciales\n"
							+ "basico7 \t  Muestra el punto 7 de los ejercicios basicos iniciales\n");
					break;
				case("basico1"):
					/*
					 *  Programa java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo
					 *  double y una variable C de tipo char y asigna a cada una un valor. A continuación, muestra por
					 *  pantalla: El valor de cada variable, la suma de N + A, la diferencia de A - N, el valor numérico
					 *  correspondiente al carácter que contiene la variable C. 
					 */
					// Se declaran variables B1 como Basico 1
					int B1n = 3;
					double B1a = 2.5;
					char B1c = 'c';
					double B1sumNA = B1n+B1a;
					double B1minNA = B1n-B1a;
					System.out.println("Variable int N = "+B1n+"\n"
							+ "Variable double A = "+B1a+"\n"
							+ "Variable char C = "+B1c+"\n"
							+ "Suma N+A = "+B1sumNA+"\n"
							+ "Diferencia N-A = "+B1minNA+"\n");
					break;
				case("basico2"):
					/*
					 *  Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y
					 *  M de tipo double y asigna a cada una un valor. A continuación, realiza y muestra por pantalla una
					 *  serie de operaciones entre ellas. 
					 */
					int B2x=2, B2y=3;
					double B2n=4, B2m=5, B2total=0;
					System.out.println("Variable X: "+B2x+"\n"
							+ "Variable Y: "+B2y+"\n"
							+ "Variable N: "+B2n+"\n"
							+ "Variable M: "+B2m+"\n");
					B2total = B2x+B2y;
					System.out.println(B2x+" + "+B2y+" = "+ B2total);
					B2total = 0;
					B2total = B2n * B2m;
					System.out.println(B2n+" * "+B2m+" = "+B2total);
					B2total = 0;
					break;
			}
		}

	}

}
