package ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listaNumeros=new ArrayList<>();
		int random;
		int tamaño;
		int suma=0;
		int media=0;
		int max;
		int min;
		Random rand=new Random();
		random=rand.nextInt(1,101);
		tamaño=rand.nextInt(5,11);
		max=random;
		min=random;
		for(int i=0;i<tamaño;i++){
			listaNumeros.add(random);
			random=rand.nextInt(1,101);
		}
		System.out.println(listaNumeros);
		for(int valor:listaNumeros) {
			suma+=valor;
			media=suma/tamaño;
			if(min>valor){
				min=valor;
			}
			if(max<valor){
				max=valor;
			}
		}
		System.out.print("La suma total es " +suma +" ");
		System.out.print("La media total es "+media+" ");
		System.out.print("El numero mas alto es " +max+" ");
		System.out.print("Y el numero mas pequeño es " +min+" ");
	}

}
