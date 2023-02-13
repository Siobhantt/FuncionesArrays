package ejercicio6;

import java.util.Arrays;

public class Ej6 {
	/*
	 * Escribir la función: int[] eliminarMayores(int t[], int valor), que crea y
	 * devuelve una copia de la tabla t donde se han eliminado todos los elementos
	 * que son mayores que valor.
	 */

	public static int[] eliminarMayores(int t[], int valor) {
		//codigo de yeray
		//creo una tabla auxiliar
		int aux[] = new int [0];
		//recorro la tabla principal
		for (int i = 0; i < t.length; i++) {
			//compruebo si lo que esta guardado en ese indice es menor que el valor
			if (t[i]<=valor){
				//en caso de que si sea menor hago la tabla mas grande en 1
				aux = Arrays.copyOf(aux, aux.length+1);
			//y guardo ese valor (que es mas pequeño en la tabla)
			
				aux[aux.length-1] = t[i]; 
			//No estoy eliminando, estoy haciendo una tabla nueva  con los valores mas pequeños 
			}
			}//fin del for
		return aux;
		}
	}// fin del metodo
