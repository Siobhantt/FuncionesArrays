package ejercicio6;

import java.util.Arrays;

public class Ej6 {
/*Escribir la función: int[] eliminarMayores(int t[], int valor), 
 * que crea y devuelve una copia de la tabla t donde se han eliminado todos los elementos que son mayores que valor.*/
	
	public static int [] eliminarMayores(int t[], int valor) {
		int indice = 0;
		while(indice<t.length) {
			
			if (t[indice]>valor) {
				
				t = borrar(t, indice);
				} else {// sin esto NO FUNCIONA
					indice++;
				}//fin del if
		}//fin del while
		return t;
	}//fin del metodo	
	public static int[] borrar(int[] tabla, int indice) {
		if (indice >= 0) {
			System.arraycopy(tabla, indice + 1, tabla, indice, tabla.length - indice - 1);
		}

		tabla = Arrays.copyOf(tabla, tabla.length - 1);
		return tabla;
	}//fin del metodo
}