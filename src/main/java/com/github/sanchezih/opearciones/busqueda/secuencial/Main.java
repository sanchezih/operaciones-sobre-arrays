package com.github.sanchezih.opearciones.busqueda.secuencial;

public class Main {

	public static void main(String[] args) {

		// Arreglo desordenado de enteros
		int[] arreglo = { 14, 3, 27, 8, 35, 22, 10, 40, 17, 30 };

		// Valores que queremos buscar en el arreglo
		int valorBuscado1 = 35;
		int valorBuscado2 = 99;

		// Buscamos los valores usando busqueda secuencial
		int resultado1 = buscar(arreglo, valorBuscado1);
		int resultado2 = buscar(arreglo, valorBuscado2);

		// Mostramos el resultado de la primera busqueda
		if (resultado1 != -1) {
			System.out.println("El valor " + valorBuscado1 + " fue encontrado en la posicion " + resultado1);
		} else {
			System.out.println("El valor " + valorBuscado1 + " no fue encontrado en el arreglo.");
		}

		// Mostramos el resultado de la segunda busqueda
		if (resultado2 != -1) {
			System.out.println("El valor " + valorBuscado2 + " fue encontrado en la posicion " + resultado2);
		} else {
			System.out.println("El valor " + valorBuscado2 + " no fue encontrado en el arreglo.");
		}
	}

	/**
	 * Método de busqueda secuencial.
	 * 
	 * Recorre el arreglo desde el principio hasta el final.
	 * 
	 * Si encuentra el valor buscado (dato), devuelve su posicion.
	 * 
	 * Si no lo encuentra, devuelve -1.
	 * 
	 * @param arreglo
	 * @param dato
	 * @return
	 */
	private static int buscar(int[] arreglo, int dato) {

		for (int i = 0; i < arreglo.length; i++) {

			// Compara el valor actual del arreglo con el dato buscado
			if (arreglo[i] == dato) {
				return i; // Retorna la posicion donde se encontro
			}
		}

		// Si termino el recorrido y no encontro el dato, retorna -1
		return -1;
	}
}