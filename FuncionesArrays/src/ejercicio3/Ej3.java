package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
/*Escribir la función int[] rellenaPares(int longitud, int fin),
 *  que crea y devuelve una tabla ordenada de la longitud especificada,
 *   que se encuentra rellena con números pares aleatorios comprendidos entre 2 hasta fin inclusive*/
	public static int[] rellenaPares(int longitud, int fin) {
		
		int tabla[]=new int[longitud];
		int par;
		for(int i=0;i<tabla.length;i++) {
			par =(int)((Math.random()*(fin-2+1))+2);
			
			while (par%2!=0) {
				par =(int)((Math.random()*(fin-2+1))+2);
			}
			if(par%2==0) {
				tabla[i]= par;
			}
		}
		Arrays.sort(tabla);
		return tabla;
	}
}
