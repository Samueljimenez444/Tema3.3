package ejercicio2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Conjunto que se ordena por orden de insercion, almacenara 10 numeros aleatorios generados 
		LinkedHashSet<Integer> listaNumeros=new LinkedHashSet<>();
		//Creacio objeto Random
		Random rand=new Random();
		//Creacion entero numero que almacenara los numeros aleatorios
		int numero;
		//Variable booleana que controlara cuando la coleccion tenga 10 numeros almacenados
		boolean salir=false;
		//Mientras salir sea igual a false
		while(salir==false) {
			//numeros es igual a un numero aleatorio generado entre 1 y 20
			numero=rand.nextInt(1,21);
			//Se añade a lista el numero aleatorio generado
			listaNumeros.add(numero);
			//Si la listaNumeros tiene un tamaño igual a 10
			if(listaNumeros.size()==10){
				//salir=true por lo que el bucle finalizara
				salir=true;
			}
		}
		//Print numeros mostrados
		System.out.println(listaNumeros);
	}

}
