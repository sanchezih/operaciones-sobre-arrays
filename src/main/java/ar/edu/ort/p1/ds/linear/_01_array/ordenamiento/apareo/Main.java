package ar.edu.ort.p1.ds.linear._01_array.ordenamiento.apareo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] primeraLista = new int[] { 8, 10, 11, 16, 21, 22, 30, 32, 33, 35, 50 };

		int[] segundaLista = new int[] { 6, 9, 13, 14, 25, 27, 31 };

		int[] res = apareo(primeraLista, segundaLista);
		System.out.println(Arrays.toString(res));
		
		
		int[] lista1 = {1, 2, 3};  
		int[] lista2 = {4, 5, 6};
		
		int[] resultado = apareo(lista1, lista2);
		System.out.println(Arrays.toString(resultado));

	}

	 static int[] apareo(final int[] primeraLista, final int[] segundaLista) {
		int i = 0, j = 0, k = 0;
		int[] result = new int[primeraLista.length + segundaLista.length];
		while (i < primeraLista.length && j < segundaLista.length) {
			if (primeraLista[i] < segundaLista[j]) {
				result[k] = primeraLista[i];
				i++;
			} else {
				result[k] = segundaLista[j];
				j++;
			}
			k++;
		}
		for (int t = i; t < primeraLista.length; t++) {
			result[k] = primeraLista[t];
			k++;
		}
		for (int t = j; j < segundaLista.length; t++) {
			result[k] = segundaLista[t];
			k++;
		}
		return result;
	}

}
