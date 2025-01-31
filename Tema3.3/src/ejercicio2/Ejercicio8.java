package ejercicio2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creacion HashMap que almacenara categorias de tareas y un conjunto de tareas
		// pendientes que introduciran el usuario
		HashMap<String, HashSet<String>> listaTareas = new HashMap<>();
		// Creacio variable que almacenara las tareas del usuario
		String tarea;
		// Creacion variable que almaceanra la categoria de las tareas del usuario
		String categoria;
		// Variable que controlara las elecciones del usuario, la inicializamos a -1
		int eleccion = -1;
		// Creacion Scanner
		Scanner lectura = new Scanner(System.in);

		do {
			/* Print menu */
			System.out.println("1 Introduzca una tarea a una categoria");
			System.out.println("2 Mostrar tareas pendientes");
			System.out.println("3 Eliminar tarea pendiente");
			System.out.println("Elija una opcion");

			// Captamos la eleccion numerica del usuario por consola
			eleccion = lectura.nextInt();
			// Limpiamos el buffer
			lectura.nextLine();

			// Condicional multiple en base a la variable eleccion
			switch (eleccion) {
			// Si eleccion==1
			case 1:
				System.out.println("Introduzca el nombre de la categoria");
				// Captamos la categoria por consola
				categoria = lectura.nextLine();
				System.out.println("Introduzca el nombre de la tarea");
				//Captamos el nombre de la tarea por consola
				tarea = lectura.nextLine();
				//Si la listaTareas contiene la categoria introducida
				if (!listaTareas.containsKey(categoria)) {
					//Se añade la categoria y se crea una nueva coleccion
					System.out.println("La categoria ha sido añadida correctamente");
					listaTareas.put(categoria, new HashSet<String>());
				}
				
				else {
					System.out.println("La tarea ya existia");
				}
				//Se añade a la categoria la tarea
				listaTareas.get(categoria).add(tarea);
				break;
				//En case de que el usuario elija 2
			case 2:
				//Se muestran las tareas
				System.out.println("Estas son tus tareas: " + listaTareas);
				break;
				//En caso de que el usuario elija 3
			case 3:
				System.out.println("Introduzca la categoria de la tarea");
				//Se capta la categoria por consola
				categoria = lectura.nextLine();
				System.out.println("Introduzca la tarea que quieres eliminar");
				//Se capta la tarea por consola
				tarea = lectura.nextLine();
				//Se elimina de la categoria la tarea
				listaTareas.get(categoria).remove(tarea);
				break;
			}

		} while (eleccion != 0);
		// Cierre Scanner
		lectura.close();
	}

}
