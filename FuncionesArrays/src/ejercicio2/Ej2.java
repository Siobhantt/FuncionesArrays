package ejercicio2;

import java.util.Arrays;

public class Ej2 {
/*Diseñar la función: int maximo(int t[]), que devuelva el máximo valor contenido en la tabla t.*/	
	public static int maximo(int t[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<t.length;i++) {
			if(max<t[i]) {
				max=t[i];
			}//fin del if
		}//fin del for
		return max;
	}
}
