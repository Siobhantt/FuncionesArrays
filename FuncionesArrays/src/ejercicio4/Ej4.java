package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
	/*
	 * Escribe la función: int buscar(int t[], int clave), que busca de forma
	 * secuencial en la tabla t el valor clave. En caso de encontrarlo, devuelve en
	 * qué posición lo encuentra; y en caso contrario, devolverá -1.
	 */
	public static void main(String[] args) {

		int numUser;
		int tabla[] = new int[20];
		Scanner lee = new Scanner(System.in);
		System.out.println("Por favor introduzca el valor que quiere buscar: ");
		numUser = lee.nextInt();

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(tabla));
		
		if(buscar(tabla,numUser)>0) {
			System.out.print("El valor que está buscando se encuentra en la posicion: "+buscar(tabla, numUser));
		}
		
		else {
			System.out.print("El valor no se encuentra en la tabla: " + buscar(tabla, numUser));
		}
	}// fin del main

	public static int buscar(int t[], int clave) {
		int indiceB = 0;
		while (indiceB < t.length && clave != t[indiceB]) {
			indiceB++;
		} // fin del while
		if (indiceB >= t.length) {
			indiceB = -1;
		}
		return indiceB;
	}
}
