package ejercicio1;

import java.util.Arrays;

public class MainEj1 {

	public static void main(String[] args) {
			int tablota[] = new int[10];
			
			for(int i=0; i<tablota.length;i++) {
				tablota[i]=(int)(Math.random()*100);
			}
			System.out.println(Arrays.toString(tablota));
			System.out.println("La suma de los elementos del array es: "+Ej1.sumaTabla(tablota));

		}//fin del main

}
