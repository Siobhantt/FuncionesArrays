package ejercicio5;

import java.util.Arrays;

public class Ej5 {
	/*
	 * Implementar la función: int[] sinRepetidos(int t[]), que construye y devuelve
	 * una tabla de la longitud apropiada, con los elementos de t, donde se han
	 * eliminado los datos repetidos.
	 */
	public static void main(String[] args) {
		
		int tablota[] = new int [9];
		System.out.println(Arrays.toString(sinRepetidos(tablota)));
	}

	public static int[] sinRepetidos(int t[]) {
		// DEBO HACER LA BUSQUEDA EN LA TABLA VACIAAAAAAAAAAA
		int valor = 0;
		int indice = 0;
		int tabla[] = new int[0];
		for (int i = 0; i < t.length; i++) {
			t[i] = (int) (Math.random() * 100);
		}
		while (indice < tabla.length && valor != tabla[indice]) {
			indice++;
		}
		if (indice < tabla.length) {
			t[indice] = valor;
		}
		
		return tabla;
	}// fin del metodo

	public static int busquedaSecuencial[](int t[],int valor){
		
	}
	

}
