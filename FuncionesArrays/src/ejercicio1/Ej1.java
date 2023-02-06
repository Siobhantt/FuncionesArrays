package ejercicio1;

public class Ej1 {
/*Realiza una función que reciba como parámetro una tabla de enteros y devuelva la suma de todos los valores almacenados en la tabla.
 *  Prueba el comportamiento de la función en un método main.*/
	public static int sumaTabla(int tabla[]) {
		int resultado=0;
		for (int i=0;i<tabla.length;i++) {
		resultado += tabla[i];	
		}//fin del for
		return resultado;
	}
}
