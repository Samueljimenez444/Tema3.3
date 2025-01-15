package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos una lista entera de numeros que iremos almacenando
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		boolean negativo = false;
		Scanner lectura = new Scanner(System.in);
		int numero = 0;
		while (negativo == false) {
			System.out.println("Introduce numeros cuando introduzcas uno negativo el programa terminara");
			numero = lectura.nextInt();
			if (numero < 0) {
				negativo = true;
			} else {
				listaNumeros.add(numero);
			}
		}
		for (int i = 0; i < listaNumeros.size(); i++) {
			numero = listaNumeros.get(i);
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}
		}
		lectura.close();
	}
}
