package ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos la variable entera numero que almacenara los numeros aleatorios
		// generados
		int numeros;
		// Creamos un arraylist entera que guardara un conjunto de numeros
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		// Creamos el objeto rand para crear numeros aleatorios
		Random rand = new Random();
		// Definimos el valor de numeros en un numero aleatorio entre 1 y 10
		numeros = rand.nextInt(1, 11);
		// Bucle for que iterara 30 veces
		for (int i = 0; i < 30; i++) {
			// Se añade un numero a la coleccion
			listaNumeros.add(numeros);
			// Se redefine el numero aleatorio
			numeros = rand.nextInt(1, 11);
		}
		// Ordenamos la lista en base a su valor numerico
		listaNumeros.sort(null);

		// Print de la coleccion
		System.out.println(listaNumeros);

	}

}
