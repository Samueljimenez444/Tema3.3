package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

	public static void main(String[] args) {
		///Creamos un arraylist de enteros que almacenara los numeros del 1 al 10
		ArrayList<Integer> listaNumeros=new ArrayList<>();
		//Bucle for que iterara 10 veces
		for(int i=1;i<11;i++){
			//Se añade a listaNumeros el valor de i 10 veces
			listaNumeros.add(i);
		}
		//Print de la lista original sin mezclar
		System.out.println("Esta es la lista original "+listaNumeros);
		//Se mezcla aleatoriamente la lista
		Collections.shuffle(listaNumeros);
		//Se muestra la lista mezclada aleatoriamente
		System.out.println("Esta es la lsita mezclada "+ listaNumeros);
		
	}

}
