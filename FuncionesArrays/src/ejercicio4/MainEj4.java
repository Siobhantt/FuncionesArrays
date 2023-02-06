package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class MainEj4 {

	public static void main(String[] args) {

		int numUser;
		int tabla[] = new int[20];
		Scanner lee = new Scanner(System.in);
		System.out.println("Por favor introduzca el valor que quiere buscar: ");
		numUser = lee.nextInt();

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(tabla));
		
		if(Ej4.buscar(tabla,numUser)>0) {
			System.out.print("El valor que está buscando se encuentra en la posicion: "+Ej4.buscar(tabla, numUser));
		}
		
		else {
			System.out.print("El valor no se encuentra en la tabla: " + Ej4.buscar(tabla, numUser));
		}

	}

}
