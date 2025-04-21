package ar.edu.ort.p1.ds.linear._01_array.ordenamiento.apareo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Se crean dos listas de enteros ORDENADAS de forma ascendente
		int[] primeraLista = new int[] { 8, 10, 11, 16, 21, 22, 30, 32, 33, 35, 50 };
		int[] segundaLista = new int[] { 6, 9, 13, 14, 25, 27, 31 };

		// Se imprime el resultado del apareo (unión ordenada) de ambas listas
		System.out.println(Arrays.toString(apareo(primeraLista, segundaLista)));

	}

	/**
	 * Realiza el apareo (merge) de dos listas ordenadas de enteros.
	 * 
	 * Devuelve una nueva lista que contiene todos los elementos de ambas listas,
	 * tambien ordenada.
	 * 
	 * @param primeraLista lista ordenada de enteros
	 * @param segundaLista otra lista ordenada de enteros
	 * @return nueva lista ordenada que resulta de mezclar las dos anteriores
	 */
	private static int[] apareo(final int[] primeraLista, final int[] segundaLista) {

		// i y j son indices para recorrer las listas originales
		// k es el indice para la lista resultante
		int i = 0, j = 0, k = 0;

		// Se crea un arreglo resultado del tamanio combinado de ambas listas
		int[] result = new int[primeraLista.length + segundaLista.length];

		// Mientras no se llegue al final de ninguna de las listas
		while (i < primeraLista.length && j < segundaLista.length) {

			// Se compara el elemento actual de cada lista
			// Se copia el menor al arreglo resultado
			if (primeraLista[i] < segundaLista[j]) {
				result[k] = primeraLista[i];
				i++; // Avanzamos en la primera lista
			} else {
				result[k] = segundaLista[j];
				j++; // Avanzamos en la segunda lista
			}
			k++; // Avanzamos en el arreglo resultado
		}

		// Si quedan elementos en la primera lista, los copiamos al final del resultado
		for (int t = i; t < primeraLista.length; t++) {
			result[k] = primeraLista[t];
			k++;
		}

		// Si quedan elementos en la segunda lista, los copiamos al final del resultado
		for (int t = j; t < segundaLista.length; t++) {
			result[k] = segundaLista[t];
			k++;
		}

		// Devolvemos el arreglo ordenado resultante
		return result;
	}

}