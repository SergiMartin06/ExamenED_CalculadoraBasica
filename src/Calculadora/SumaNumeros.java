package Calculadora;

import java.util.Scanner;
public class SumaNumeros {
	public static void main(String[] args) {
		
		//El programa lo que hace es recibir dos valores y luego los suma para luego imprimir la operacion
		
		//Cambio realizado desde rama Feature
		
		//Comentario despues de realizar fusion entre ramas
		
		
		/**
		 * @author Sergi
		 * @version 1.0
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa el primer número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Ingresa el segundo número: ");
		int numero2 = scanner.nextInt();
		
		int suma = numero1 + numero2;
		
		/**
		 * @param numero1 primer numero
		 * @param numero2 segundo numero
		 * @return la suma de numero1 y numero2
		 */
		
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
	}
}
