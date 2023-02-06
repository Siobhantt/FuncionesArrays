package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
	/*
	 * Escribe la función: int buscar(int t[], int clave), que busca de forma
	 * secuencial en la tabla t el valor clave. En caso de encontrarlo, devuelve en
	 * qué posición lo encuentra; y en caso contrario, devolverá -1.
	 */
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
