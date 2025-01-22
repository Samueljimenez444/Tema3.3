package ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos una variable entera que creara numeros aleatorios con el objeto rand
		int numeros;
		// Lista de numeros arrayList entera que almacenara los numeros en orden de
		// introducion
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		// Creamos el objeto rand para generar numeros aleatorios
		Random rand = new Random();
		// Numeros es igual a un numero aleatorio entre esos valores sin incluir 10
		numeros = rand.nextInt(-1000000, 10);
		// Bucle for que iterara 20 veces
		for (int i = 0; i < 20; i++) {
			// Añadimos el valor de numero a la lista
			listaNumeros.add(numeros);
			// Volvemos a randomizar el valor de numero
			numeros = rand.nextInt(-1000000, 10);
		}
		// Print de la lista
		System.out.println(listaNumeros);

	}

}
