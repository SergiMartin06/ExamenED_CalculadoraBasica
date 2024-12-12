package Calculadora;

import java.util.Scanner;
public class SumaNumeros {
	public static void main(String[] args) {
		
		//El programa lo que hace es recibir dos valores y luego los suma para luego imprimir la operacion
		
		//Cambio realizado desde rama Feature
		
		//Comentario despues de realizar fusion entre ramas
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa el primer número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Ingresa el segundo número: ");
		int numero2 = scanner.nextInt();
		
		int suma = numero1 + numero2;
		
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
	}
}
