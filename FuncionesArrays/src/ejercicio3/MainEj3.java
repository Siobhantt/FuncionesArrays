package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class MainEj3 {

	public static void main(String[] args) {
		int longitud;
		int fin;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduzca la longitud de la tabla: ");
		longitud=lee.nextInt();
		System.out.println("Introduzca el fin de la tabla: :");
		fin = lee.nextInt();
		System.out.println(Arrays.toString(Ej3.rellenaPares(longitud,fin)));

	}

}
