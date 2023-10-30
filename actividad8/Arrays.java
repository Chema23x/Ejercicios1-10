package actividad8;
import java.util.Scanner;

/*
 * Crear un programa en Java que realice lo siguiente:
Debe solicitar al usuario 10 números por consola y almacenarlos en un array.
Debe pasar los números que sean primos a las primeras posiciones, desplazando los demás números al final, de tal forma que no se pierda ningún número.
Debe mostrar por consola el array original, mostrando el índice seguido del valor de la posición.
Debe mostrar por consola el array que contiene los números primos al principio, mostrando el índice seguido del valor de la posición. El orden de los números no importa, siempre y cuando los números primos vayan al principio del array.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
Array original mostrando la posición del array más el valor.
0 - 1
1 - 2
2 - 3
3 - 4
4 - 5
5 - 6
6 - 7
7 - 81
8 - 9
9 - 10
Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor.
0 - 2
1 - 3
2 - 5
3 - 7
4 - 1
5 - 4
6 - 6
7 - 8
8 - 9
9 - 10
Entradas: 
Salidas:
Pruébalo con las combinaciones de números que se te ocurran.
Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub y adjunta el link.
 */

public class Arrays {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int[] primo = new int[10];
		int[] noPrimo = new int[10];
		int i;
		int j;
		int primos = 0;
		int noPrimos = 0;
		boolean esPrimo = false;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca 10 números separados por INTRO:");

		for (i = 0; i < 10; i++) {
			numeros[i] = scanner.nextInt();

			// Comprobar si el número es o no primo.
			esPrimo = true;
			for (j = 2; j < numeros[i] - 1; j++) {
				if (numeros[i] % j == 0) {
					esPrimo = false;
				}
			}

			// Si el número es primo, se mete en un array y si no es primo, se mete en otro.
			if (esPrimo) {
				primo[primos++] = numeros[i];
			} else {
				noPrimo[noPrimos++] = numeros[i];
			}
		}

		// Muestra el array original
		System.out.println("\n\nArray original:");
		for (i = 0; i < 10; i++) {
			System.out.println(i + "-" + numeros[i]);
		}

		//Ahora con los números primos  en las primeras posiciones del array original.
		for (i = 0; i < primos; i++) {
			numeros[i] = primo[i];
		}

		// Los números que no son primos se colocan al final.
		for (i = primos; i < primos + noPrimos; i++) {
			numeros[i] = noPrimo[i - primos];
		}

		// Muestra el resultado.
		System.out.println("\n\nArray con los primos al principio:");
		for (i = 0; i < 10; i++) {
			System.out.println(i + "-" + numeros[i]);
		}

		scanner.close();
	}
}