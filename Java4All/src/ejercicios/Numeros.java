/** Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma 
	de los dos primeros y el producto del tercero y el cuarto. */


package ejercicios;

import java.util.Scanner;

public class Numeros
{
		@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int num1 = 0; //declaración de las variables que recogeran los numeros
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		int suma = 0;
		int producto = 0;
		Scanner numero_introducido = null; //Crear variable de la clase Scanner e iniciar a null
		
			System.out.println("Introduzca el primer número que desea sumar: ");
			numero_introducido = new Scanner(System.in); //almacenar en la variable auxiliar 
								//"numero_introducido" el valor introducido por teclado
			num1 = numero_introducido.nextInt(); //se almacena en num1, dejando libre la 
												//variable auxiliar
			
			System.out.println("Introduzca el segundo número que desea sumar: ");
			numero_introducido = new Scanner(System.in);
			num2 = numero_introducido.nextInt();
			
			System.out.println("Introduzca el primer número que desea multiplicar: ");
			numero_introducido = new Scanner(System.in);
			num3 = numero_introducido.nextInt();
			
			System.out.println("Introduzca el segundo número que desea multiplicar: ");
			numero_introducido = new Scanner(System.in);
			num4 = numero_introducido.nextInt();
			
			suma = num1 + num2;
			producto = num3 * num4;
			
			System.out.println("La suma de los dos primeros numeros es: " + suma);
			System.out.println("El producto de los dos numeros es: " + producto);		
	}
}
