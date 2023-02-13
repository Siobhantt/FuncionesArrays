package ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

public class MainEjercicio6 {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		int numUser;
		int t[] = {2,3,4,5,6,7};
		
		System.out.println("Introduce un numero: ");
		numUser = lee.nextInt();
		//para imprimir un metodo que devuelva una tabla tengoq ue usar el Arrays.toString
	System.out.println(Arrays.toString(Ej6.eliminarMayores(t, numUser)));
		System.out.println(Arrays.toString(t));
		
	}

}
