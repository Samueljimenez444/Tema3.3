package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos un HashMap que contendra un par clave,valor donde la clave sera el
		// nombre de un producto y el valor sera el precio de ese mismo producto
		HashMap<String, Double> productos = new HashMap<>();
		// Creacion objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Variable booleana que controlara la entrada y salida del bucle
		boolean salir = false;
		// variable que controlara la eleccion del usuario en base a las opciones del
		// menu
		int eleccion;
		// variable que almacenara el precio del producto que introduzca el usuario
		double precio;
		// Variable que almacenara el nombre del producto que introduzca el usuario
		String nombreProducto = "";
		// Boleana que controlara si el producto se encuentra en el diccionario y
		// controlara el while que continuara preguntando al usuario hasta que este
		// introduzca valores rapidos
		boolean encontrar = false;
		// Bucle while que iterera hasta que el usuario decida salir del programa
		while (salir == false) {
			// redefinimos el valor de encontrar en false en caso de que el usaurio haya
			// realizado una baja de productos
			encontrar = false;
			/* Print del menu */
			System.out.println("PRODUCTOS");
			System.out.println("1 Alta del Producto");
			System.out.println("2 Baja del Producto");
			System.out.println("3 Listar Existencias del Producto");
			System.out.println("0 Salir del programa");
			// Eleccion equivale al input del usuario
			eleccion = lectura.nextInt();
			// Limpiado del buffer
			lectura.nextLine();
			// Si eleccion es igual a 1
			if (eleccion == 1) {
				/* Se le pregunta al usuario que introduzca un nombre de producto y un precio */
				System.out.println("Introduce el nombre del producto");
				nombreProducto = lectura.nextLine();
				System.out.println("Introduce el precio del producto");
				precio = lectura.nextDouble();
				// Se añaden el par clave,valor en el diccionario
				productos.put(nombreProducto, precio);
				// Si la eleccion del usuario es 2
			} else if (eleccion == 2) {
				/* Se le pide al usuario que introduzca el nombre de un producto y su precio */
				System.out.println("Introduce el nombre del producto");
				nombreProducto = lectura.nextLine();
				System.out.println("Introduce el precio del producto");
				precio = lectura.nextDouble();
				// Limpiamos el buffer
				lectura.nextLine();
				// Se iguala la variable encontrar a el metedo .remove de productos donde si se
				// devuelve true los productos han sido eliminados correctamente pero si se
				// devuelve false se entrara en el bucle while
				encontrar = productos.remove(nombreProducto, precio);
				// Si no se ha eliminado el producto (encontrar=false)
				while (encontrar == false) {
					/* Se le pide al usuario que introduzca un nombre y precio correctos */
					System.out.println("Introduce un nombre correcto");
					nombreProducto = lectura.nextLine();
					System.out.println("Introduce el precio correcto");
					precio = lectura.nextDouble();
					// Limpiamos el buffer
					lectura.nextLine();
					// Se iguala encontrar al metodo remove
					encontrar = productos.remove(nombreProducto, precio);
				}
				// Si la eleccion es igual a 3 se muestran los productos
			} else if (eleccion == 3) {
				// Printo productos
				System.out.println(productos);
				// Si eleccion es igual a 0 salir=true y el programa finalizara
			} else if (eleccion == 0) {
				salir = true;
				// Si no se elige una opcion valida se le pide al usuario una opcion correcta
			} else {
				System.out.println("Introduce una opcion Correcta");
			}
			// Si encontar es igual a true se le indica al usuario que el producto ha sido
			// eliminado
			if (encontrar == true) {
				System.out.println("El producto se ha eliminado correctamente");
			}
		}
		// Cierre Scanner
		lectura.close();
	}
}
