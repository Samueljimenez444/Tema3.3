package ejercicio2;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creacion contador que contabilizara cuantas veces aparace cada letra en la palabra
		int contador=0;
		//TreeMap listaLetras que almacenara las letras que aparecen y las veces que aparecen al ser un diccionario con pares clave valor
		TreeMap<Character,Integer> listaLetras=new TreeMap<>();
		//Creacion scanner lectura
		Scanner lectura=new Scanner(System.in);
		//Variable que almacenara la frase que introduce el usuario
		String frase;
		//Print usuario
		System.out.println("Introduce una frase");
		//frase es igual al input del usuario
		frase=lectura.nextLine();
		/*Creamos un bucle for anidado que recorrera el abecedario y la frase introducida por el usuario*/
		for(char letra='a';letra<'z';letra++){
			for(int i=0;i<frase.length();i++){
				//Si una letra del abecedario coincide con una letra de la frase 
			if(Character.toLowerCase(letra)==Character.toLowerCase(frase.charAt(i))){
				//Se almacena la letra y se aumenta el numero de veces que aparece
				listaLetras.put(letra, ++contador);
			}
			//Si la letra no aparece
			else {
				//Se reinicia el contador
				contador=0;
			}
			}
		}
		//Print de las letras encontradas y el numero de veces que aparecen
		System.out.println(listaLetras);
		//Cierre Scanner
		lectura.close();
	}

}
