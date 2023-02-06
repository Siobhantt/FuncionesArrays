package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
	/*
	 * Implementar la función: int[] sinRepetidos(int t[]), que construye y devuelve
	 * una tabla de la longitud apropiada, con los elementos de t, donde se han
	 * eliminado los datos repetidos.
	 */
	

	public static int[] sinRepetidos(int t[]) {
	int tablaCopy[] = new int[0];

		for (int element : t) {
			if (busquedaSecuencial(tablaCopy, element)==-1) {
				tablaCopy = Arrays.copyOf(tablaCopy, tablaCopy.length+1);
				tablaCopy[tablaCopy.length-1] =element;
			}
		}
		return tablaCopy;
	}// fin del metodo

	public static int busquedaSecuencial(int t[], int valor) {
		int indiceB = 0;
		// mientras no encontremos el valor y no hayamos llegado al final de la tabla
		// incrementaremos el indice (no haremos nada)
		while (indiceB < t.length && valor != t[indiceB]) {
			indiceB++;
		}
		if (indiceB >= t.length || t.length==0) {
			indiceB = -1;
		}

		return indiceB;
	}
}
