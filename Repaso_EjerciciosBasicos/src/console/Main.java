package console;

import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	static String com;
	public static void main(String[] args) 
	{
		System.out.println("Ejercicios Basicos Java \nby Gabe\n"
				+ "Escribe 'ayuda' para obtener mayor informacion\n\n");
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
							+ "basico7 \t  Muestra el punto 7 de los ejercicios basicos iniciales\n"
							+ "\nEJERCICIOS BASICOS CON ESTRUCTURA SECUENCIAL\n\n"
							+ "secuencial1 \t  Muestra el punto 1 de los ejercicios basicos secuenciales\n");
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
				case("basico3"):
					/*
					 * Programa Java que declare una variable entera N y asígnale un valor. A continuación, escribe las
					 * instrucciones que realicen lo siguiente: Incrementar N en 77, Decrementarla en 3, Duplicar su
					 * valor.
					 */
					int B3n = 0;
					System.out.println("Variable N = "+B3n);
					B3n+=77;
					B3n-=3;
					B3n*=2;
					System.out.println("Variable N + 2 - 3 * 2 = "+B3n);
					B3n = 0;
					break;
				case("basico4"):
					/*
					 *  Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor acada una. A
					 *  continuación, realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de
					 *  A, A tome el valor de D, D tome el valor de B. 
					 */
					int B4a=1, B4b=2, B4c=3, B4d=4;
					B4b = B4c;
					B4c = B4a;
					B4a = B4d;
					B4d = B4b;
					System.out.println(B4a+", "+B4b+", "+B4c+", "+B4d);
					break;
				case("basico5"):
					/*
					 *  Programa Java que declare una variable A de tipo entero y asígnale un valor. A continuación
					 *  muestra un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) dentro del
					 *  println para resolverlo. 
					 */
					int B5a = 4;
					if(B5a % 2 == 0)
					{
						System.out.println(B5a+" es un numero par");
						break;
					}
					System.out.println(B5a+"es un numero impar");
					break;
				case("basico6"):
					/*
					 *  Programa Java que declare una variable B de tipo entero y asígnale un valor. A continuación
					 *  muestra un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como
					 *  positivo. Utiliza el operador condicional (? : ) dentro del println para resolverlo. 
					 */
					int B6b1 = 3, B6b2 = -6;
					if(B6b1 >= 0)
					{
						System.out.println(B6b1+" es un numero positivo");
					}
					else if(B6b1 < 0)
					{
						System.out.println(B6b1+" es un numero negativo");
					}
					if(B6b2 >= 0)
					{
						System.out.println(B6b2+" es un numero positivo");
					}
					else if(B6b2 < 0)
					{
						System.out.println(B6b2+" es un numero negativo");
					}
					break;
				case("basico7"):
					/*
					 *  Programa Java que declare una variable C de tipo entero y asígnale un valor. A continuación
					 *  muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es
					 *  múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como
					 *  positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo. 
					 */
					int B7c = 20;
					if(B7c >= 0)
					{
						System.out.println(B7c+" es un numero positivo");
					}
					else if(B7c < 0)
					{
						System.out.println(B7c+" es un numero negativo");
					}
					if(B7c % 2 == 0)
					{
						System.out.println(B7c+" es un numero par");
					}
					else if(B7c % 2 != 0)
					{
						System.out.println(B7c+" es un numero impar");
					}
					if(B7c / 5 >= B7c % 5)
					{
						System.out.println(B7c+" es multiplo de 5");
					}
					if(B7c / 10 >= B7c % 10)
					{
						System.out.println(B7c+" es multiplo de 10");
					}
					break;
			}
		}

	}

}
