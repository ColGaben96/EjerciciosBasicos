package console;

import java.util.Scanner;

/**
 * @author Gabe
 *	Este es el Javadoc de los ejercicios de repaso de Ricardo Camargo
 */
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
					/**
					 * @param default
					 * Se muestra el caso de error, en este caso el caso por defecto.
					 */
					System.out.println("Operacion invalida. Verifica e intenta nuevamente o escribe 'ayuda' para ver mas comandos");
					break;
				case("salir"):
					/**
					 * @param salir
					 * Se sale del programa
					 */
					activo = false;
					return;
				case("ayuda"):
					/**
					 * @param ayuda
					 * Se muestra la ayuda para la aplicacion
					 */
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
							+ "secuencial1 \t  Muestra el punto 1 de los ejercicios basicos secuenciales\n"
							+ "secuencial2 \t  Muestra el punto 2 de los ejercicios basicos secuenciales\n"
							+ "secuencial3 \t  Muestra el punto 3 de los ejercicios basicos secuenciales\n"
							+ "secuencial4 \t  Muestra el punto 4 de los ejercicios basicos secuenciales\n"
							+ "secuencial5 \t  Muestra el punto 5 de los ejercicios basicos secuenciales\n"
							+ "secuencial6 \t  Muestra el punto 6 de los ejercicios basicos secuenciales\n"
							+ "secuencial7 \t  Muestra el punto 7 de los ejercicios basicos secuenciales\n"
							+ "secuencial8 \t  Muestra el punto 8 de los ejercicios basicos secuenciales\n"
							+ "secuencial9 \t  Muestra el punto 9 de los ejercicios basicos secuenciales\n"
							+ "secuencial10 \t  Muestra el punto 10 de los ejercicios basicos secuenciales\n"
							+ "secuencial11 \t  Muestra el punto 11 de los ejercicios basicos secuenciales\n"
							+ "secuencial12 \t  Muestra el punto 12 de los ejercicios basicos secuenciales\n"
							+ "secuencial13 \t  Muestra el punto 13 de los ejercicios basicos secuenciales\n");
					break;
				case("basico1"):
					/**
					 * @param basico1
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
					/**
					 * @param basico2
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
					/**
					 * @param basico3
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
					/**
					 * @param basico4
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
					/**
					 * @param basico5
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
					/**
					 * @param basico6
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
					/**
					 * @param basico7
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
				case("secuencial1"):
					/**
					 * @param secuencial1
					 *  Programa Java que lea dos números enteros por teclado y los muestre por pantalla. 
					 */
					System.out.print("Ingresa un valor para la variable 1: ");
					int S1a = sc.nextInt();
					System.out.print("Ingresa un valor para la variable 2: ");
					int S1b = sc.nextInt();
					System.out.println("Las variables ingresadas son: "+S1a+", "+S1b);
					break;
				case("secuencial2"):
					/**
					 * @param secuencial2
					 *  Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”. 
					 */
					System.out.print("Ingresa su nombre: ");
					String S2name = sc.next();
					System.out.println("Buenos dias "+S2name);
					break;
				case("secuencial3"):
					/**
					 * @param secuencial3
					 * Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble
					 * y el triple de ese número. 
					 */
					System.out.print("Ingresa un numero: ");
					int S3a = sc.nextInt();
					System.out.println("El numero ingresado es "+S3a+", su doble es "+2*S3a+" y su triple es "+3*S3a);
					break;
				case("secuencial4"):
					/**
					 * @param secuencial4
					 * Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula
					 * correspondiente es: F = 32 + ( 9 * C / 5) 
					 */
					System.out.print("Escoje una opcion: [°C -> °F / °F -> °C] [1 / 2] $>  ");
					int S4choose = sc.nextInt();
					if(S4choose == 1)
					{
						System.out.print("Ingresa la temperatura en °C: ");
						double S4CtoF = sc.nextDouble();
						System.out.print(S4CtoF+" °C son ");
						S4CtoF = 32+(9*S4CtoF / 5);
						System.out.println(S4CtoF+" °F");
						break;
					}
					if(S4choose == 2)
					{
						System.out.print("Ingresa la temperatura en °F: ");
						double S4FtoC = sc.nextDouble();
						System.out.print(S4FtoC+" °F son ");
						S4FtoC = (S4FtoC-32)*5/9;
						System.out.println(S4FtoC+" °C");
						break;
						
					}
					else
					{
						System.out.println("Ingresa una opcion valida.");
						break;
					}
				case("secuencial5"):
					/**
					 * @param secuencial5
					 * Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por
					 * pantalla la longitud y el área de la circunferencia. Longitud de la circunferencia = 2*PI*Radio, Area
					 * de la circunferencia = PI*Radio^2
					 */
					System.out.print("Ingresa un radio para la circunferencia: ");
					double S5r = sc.nextDouble();
					double S5longr = 2*(3.1416)*S5r;
					double S5circ = 3.1416*(S5r*S5r);
					System.out.println("La longitud de la circunferencia de un radio "+S5r+" es "+S5longr+"\n"
							+ "El area de la circunferencia"+S5r+" es "+S5circ);
					break;
				case("secuencial6"):
					/**
					 * @param secuencial6
					 *  Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado. 
					 */
					System.out.print("Escoje una opcion: [Km/h -> m/s / m/s -> Km/h] [1 / 2] $> ");
					int S6choose = sc.nextInt();
					if(S6choose == 1)
					{
						System.out.print("Ingresa la velocidad (km/h): ");
						double S6KmtoM = sc.nextDouble();
						System.out.print(S6KmtoM+" km/h son ");
						S6KmtoM = (1000*S6KmtoM)/3600;
						System.out.println(S6KmtoM+" m/s");
						break;
					}
					if(S6choose == 2)
					{
						System.out.print("Ingresa la velocidad (m/s): ");
						double S6MtoKm = sc.nextDouble();
						System.out.print(S6MtoKm+" m/s son ");
						S6MtoKm = (3600*S6MtoKm)/1000;
						System.out.println(S6MtoKm+" Km/h");
						break;
					}
					else
					{
						System.out.println("Ingresa una opcion valida.");
						break;	
					}
				case("secuencial7"):
					/**
					 * @param secuencial7
					 * Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la
					 * hipotenusa según el teorema de Pitágoras
					 */
					System.out.print("Ingresa la longitud del cateto adyacente: ");
					double S7ca = sc.nextDouble();
					System.out.print("Ingresa la longitud del cateto opuesto: ");
					double S7co = sc.nextDouble();
					double S7hi = Math.sqrt((S7ca*S7ca)+(S7co*S7co));
					System.out.println("La longitud de la hipotenusa de los catetos ingresados es "+S7hi);
					break;
				case("secuencial8"):
					/**
					 * @param secuencial8
					 *  Programa que calcula el volumen de una esfera. 
					 */
					
					break;
			}
		}
	}

}
