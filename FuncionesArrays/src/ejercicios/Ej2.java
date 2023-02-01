package ejercicios;

import java.util.Arrays;

public class Ej2 {
/*Diseñar la función: int maximo(int t[]), que devuelva el máximo valor contenido en la tabla t.*/
	public static void main(String[] args) {
		int tabla []=new int[10];
		
		for(int i=0; i<tabla.length;i++) {
			tabla[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(tabla));
		System.out.println("El maximo de la tabla es "+ maximo(tabla));
	}//fin del main
	
	
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
