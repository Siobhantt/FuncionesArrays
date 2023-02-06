package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class MainEj5 {

	public static void main(String[] args) {

		int tablota[] = new int[9];
		Scanner lee = new Scanner (System.in);
		
		System.out.println("Por favor introduzca numeros separados por enter: ");
		for(int i=0; i<tablota.length;i++) {
			tablota[i]= lee.nextInt();
		}
		System.out.println("Tabla original: "+Arrays.toString(tablota));
		System.out.println("Tabla con elementos sin repetir: "+Arrays.toString(Ej5.sinRepetidos(tablota)));
	

	}

}
