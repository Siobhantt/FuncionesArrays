package ejercicios;

import java.util.Arrays;

public class Ej5 {
/*Implementar la función: int[] sinRepetidos(int t[]), que construye y devuelve una tabla de la longitud apropiada, con los elementos de t, 
 * donde se han eliminado los datos repetidos.*/
	public static void main(String[] args) {
		

	}
	public static int[] sinRepetidos(int t[]) {
		//DEBO HACER LA BUSQUEDA EN LA TABLA VACIAAAAAAAAAAA
		
		int pos; 
		for(int i=0;i<t.length;i++) {
			t[i]=(int)(Math.random()*100);
		}
		
	}//fin del metodo
	
		public static int[] borrar(int[] tabla, int indice) {
			if (indice >= 0) {
				System.arraycopy(tabla, indice + 1, tabla, indice, tabla.length - indice - 1);
			}

			tabla = Arrays.copyOf(tabla, tabla.length - 1);
			return tabla;
		}//fin del metodo
	
	
	
}
