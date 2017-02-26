/** Escribir un programa que pida al usuario que introduzca una frase por teclado, leer
 * dicha frase y mostrarla por pantalla, quitandole los espacios.  */

package ejercicios;

import java.util.Scanner;

public class Frase 
{
		/** Método que permite leer una frase introducida por teclado
		 * @return la frase introducida por el usuario 	 */
	public static String fraseUsuario ()
	{
		String frase_introducida = null;
		Scanner leer_frase = null; //creo una variable llamada leer_frase,
		// usando la clase Scanner, inicializada en null
		
			leer_frase = new Scanner(System.in);
			// almacenas en la variable leer_frase lo introducido 
			// por teclado haciendo uso de la clase Scanner
			
			frase_introducida = leer_frase.nextLine();
			// Asignas a la variable "frase_introducida" lo almacenado por el Scanner
			// sino pones nextLine() no tendria en cuenta los espacios en blanco
			
		return frase_introducida; 	//devuelve la frase del usuario
	}

	public static void main(String[] args)
	{
		String frase_leida = null;
		
			System.out.println ("Introduzca una frase: ");
			frase_leida = fraseUsuario ();
		 // A la variable String frase_leida se asigna el metodo fraseUsuario ()
		 
		 String frase_junta = frase_leida.replace (" ","");
		 // en la nueva variable frase_junta se guarda la frase leida por teclado
		 // pero remplazando los espacios por no espacios(es decir, quitandolos)
		 
		 System.out.println (frase_junta);
	}
}

