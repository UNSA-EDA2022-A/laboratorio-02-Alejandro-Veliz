package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto2(int inicio, int fin, int numero) {
		
		int medio = (inicio + fin) / 2; // Calcula el valor medio de inicio a fin

		if (inicio > fin) // Si numero es negativo o 0, el número no es cuadrado perfecto
			return false;

		if (medio * medio == numero) // Si el valor medio por medio da numero, entonces numero es cuadrado perfecto
			return true;

		else if (medio * medio > numero) // Si medio por medio supera a numero entonces su raíz cuadrada se encuentra más a la izquierda de medio
			return esCuadradoPerfecto2(inicio, medio - 1, numero); // Nueva búsuqeda binaria desde 1 hasta medio - 1

		else // Si medio por medio es menor que numero entonces su raíz cuadrada se encuentra más a la derecha de medio
			return esCuadradoPerfecto2(medio + 1, fin, numero); // Nueva búsqueda binaria desde medio + 1 hasta el valor de numero
		
	}
	
	public boolean esCuadradoPerfecto(int n) {
		return esCuadradoPerfecto2(1, n, n);
	}
}
