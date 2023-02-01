package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
/*Escribir la función int[] rellenaPares(int longitud, int fin),
 *  que crea y devuelve una tabla ordenada de la longitud especificada,
 *   que se encuentra rellena con números pares aleatorios comprendidos entre 2 hasta fin inclusive*/
	public static void main(String[] args) {
		int longitud;
		int fin;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduzca la longitud y el fin respectivamente:");
		
		longitud=lee.nextInt();
		fin = lee.nextInt();
		System.out.println(Arrays.toString(rellenaPares(longitud,fin)));

	}//fin del main
	public static int[] rellenaPares(int longitud, int fin) {
		
		int tabla[]=new int[longitud];
		int par;
		for(int i=0;i<tabla.length;i++) {
			par =(int)((Math.random()*(fin-2+1))+2);
			
			if(par%2==0) {
				tabla[i]= par;
			}
		}
		Arrays.sort(tabla);
		return tabla;
	}
}
