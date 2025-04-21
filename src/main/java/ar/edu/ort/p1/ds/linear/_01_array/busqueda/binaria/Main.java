package ar.edu.ort.p1.ds.linear._01_array.busqueda.binaria;

public class Main {

	public static void main(String[] args) {

		// Arreglo ordenado de enteros
		int[] arreglo = { 6, 8, 9, 10, 11, 13, 14, 16, 21, 22, 25, 27, 30, 31, 32, 33, 35, 50 };

		// Valores que queremos buscar en el arreglo
		int valorBuscado1 = 13;
		int valorBuscado2 = 19;

		// Realizamos la busqueda binaria de los dos valores
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
	 * Metodo que implementa busqueda binaria.
	 * 
	 * Busca el valor 'dato' en un arreglo ordenado de enteros.
	 * 
	 * Si lo encuentra, devuelve su posicion. Si no, devuelve -1.
	 * 
	 * @param arreglo
	 * @param dato
	 * @return
	 */
	private static int buscar(int[] arreglo, int dato) {

		int inicio = 0; // Limite inferior de la busqueda
		int fin = arreglo.length - 1; // Limite superior de la busqueda
		int pos; // Posicion del elemento medio

		// Mientras la porcion a buscar sea valida
		while (inicio <= fin) {

			pos = (inicio + fin) / 2; // Calculamos la posicion del medio

			// Si encontramos el valor, devolvemos su indice
			if (arreglo[pos] == dato)
				return pos;

			// Si el valor en el medio es menor al buscado, descartamos la mitad izquierda
			if (arreglo[pos] < dato) {
				inicio = pos + 1;
			} else {

				// Si el valor en el medio es mayor al buscado, descartamos la mitad derecha
				fin = pos - 1;
			}
		}

		// Si salimos del while sin haber encontrado el dato, devolvemos -1
		return -1;
	}
}