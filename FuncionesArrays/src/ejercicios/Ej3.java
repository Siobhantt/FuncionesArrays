package ejercicios;

import java.util.Arrays;

public class Ej3 {
/*Escribir la función int[] rellenaPares(int longitud, int fin),
 *  que crea y devuelve una tabla ordenada de la longitud especificada,
 *   que se encuentra rellena con números pares aleatorios comprendidos entre 2 hasta fin inclusive*/
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(rellenaPares(5,100)));

	}//fin del main
	public static int[] rellenaPares(int longitud, int fin) {
		
		int tabla[]=new int[longitud];
		
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=(int)(Math.random()*fin-2+1)+1;
		}
		
		return tabla;
	}
}
