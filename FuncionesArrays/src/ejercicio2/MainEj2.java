package ejercicio2;

import java.util.Arrays;

public class MainEj2 {

	public static void main(String[] args) {

		int tabla []=new int[10];
		
		for(int i=0; i<tabla.length;i++) {
			tabla[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(tabla));
		System.out.println("El maximo de la tabla es "+ Ej2.maximo(tabla));

	}

}
