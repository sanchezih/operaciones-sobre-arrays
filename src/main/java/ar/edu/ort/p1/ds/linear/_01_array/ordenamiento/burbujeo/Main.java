package ar.edu.ort.p1.ds.linear._01_array.ordenamiento.burbujeo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Inicializamos dos arreglos con los mismos elementos
		int[] numeros1 = { 90, 21, 2, 10, 1, 43, 17, 18, 33, 3, 81 };
		int[] numeros2 = { 90, 21, 2, 10, 1, 43, 17, 18, 33, 3, 81 };

		// Mostramos los arreglos antes de ordenarlos
		System.out.println("Original:");
		System.out.println("Listado 1: " + Arrays.toString(numeros1));
		System.out.println("Listado 2: " + Arrays.toString(numeros2));

		// Aplico el metodo de burbujeo tradicional al primer arreglo
		burbujeo(numeros1);
		System.out.println("\nDespues de burbujeo:");
		System.out.println("Listado 1: " + Arrays.toString(numeros1));

		// Aplico una variante del burbujeo (parecida a seleccion) al segundo arreglo
		burbujeo2(numeros2);
		System.out.println("\nDespues de burbujeo2:");
		System.out.println("Listado 2: " + Arrays.toString(numeros2));
	}

	/**
	 * Metodo que implementa el algoritmo clasico de ordenamiento "burbujeo".
	 * 
	 * Compara elementos adyacentes y los intercambia si estan en el orden
	 * incorrecto.
	 * 
	 * @param listado
	 */
	private static void burbujeo(int[] listado) {

		int i, j, aux;

		// Recorremos el arreglo tantas veces como elementos menos uno
		for (i = 0; i < listado.length - 1; i++) {

			// En cada pasada, comparamos pares adyacentes hasta el final no ordenado
			for (j = 0; j < listado.length - i - 1; j++) {

				// Si el elemento siguiente es menor que el actual, los intercambiamos
				if (listado[j + 1] < listado[j]) {
					aux = listado[j + 1];
					listado[j + 1] = listado[j];
					listado[j] = aux;
				}
			}
		}
	}

	/**
	 * Variante del burbujeo donde se compara un elemento con todos los posteriores.
	 * 
	 * Es similar al ordenamiento por seleccion.
	 */
	private static void burbujeo2(int[] listado) {

		int n = listado.length;
		int aux;

		// Recorremos cada elemento
		for (int i = 0; i < n - 1; i++) {

			// Comparamos el elemento actual con todos los que vienen despues
			for (int j = i + 1; j < n; j++) {

				// Si encontramos un elemento menor, intercambiamos
				if (listado[i] > listado[j]) {
					aux = listado[i];
					listado[i] = listado[j];
					listado[j] = aux;
				}
			}
		}
	}
}
