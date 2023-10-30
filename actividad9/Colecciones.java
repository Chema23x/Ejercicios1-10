package actividad9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Crear un programa en Java que realice lo siguiente:
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utiliza un objeto HashMap para almacenar los pares de palabras.
Debe solicitar al usuario una palabra en español e imprimir por consola la palabra en inglés.
Si la palabra escrita no se encuentra en el diccionario debe imprimir un mensaje por consola, diciendo que: “La palabra no se encuentra en el diccionario.”.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
gato
cat
Entradas: 
Salida:
Siempre y cuando la palabra se encuentre en el diccionario
Pruébalo con diferentes palabras.
 */

public class Colecciones {
	public static void main(String[] args) {
		// Español a Ingles diccionario
		Map<String,String> espIngDiccionario = new HashMap<String, String>();
		// Colocar información en el diccionario
		espIngDiccionario.put("Lunes", "Monday");
		espIngDiccionario.put("Martes", "Tuesday");
		espIngDiccionario.put("Miércoles", "Wednesday");
		espIngDiccionario.put("Jueves", "Thursday");
		espIngDiccionario.put("Viernes", "Friday");
		espIngDiccionario.put("Sábado", "Saturday");
		espIngDiccionario.put("Domingo", "Sunday");
		espIngDiccionario.put("Enero", "January");
		espIngDiccionario.put("Febrero", "February");
		espIngDiccionario.put("Marzo", "March");
		espIngDiccionario.put("Abril", "April");
		espIngDiccionario.put("Mayo", "May");
		espIngDiccionario.put("Junio", "June");
		espIngDiccionario.put("Julio", "July");
		espIngDiccionario.put("Agosto", "August");
		espIngDiccionario.put("Septiembre", "September");
		espIngDiccionario.put("Octubre", "October");
		espIngDiccionario.put("Noviembre", "November");
		espIngDiccionario.put("Diciembre", "December");
		espIngDiccionario.put("Navidad", "Christmas");
		espIngDiccionario.put("Gato", "Cat");
		
//		// Obtener las palabras del diccionario
//		System.out.println(espIngDiccionario.get("Lunes"));
//		// Imprimir los key 
//		System.out.println(espIngDiccionario.keySet());
//		// Imprimir los valores 
//		System.out.println(espIngDiccionario.values());
//		// Tamaño del diccionario
//		System.out.println("El tamaño del diccionario es " + espIngDiccionario.size());
//		
//		// Debe solicitar al usuario una palabra en español e imprimir por consola la palabra en inglés.
//		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la palabra a traducir: ");
		String respuesta = scanner.nextLine();
		
		if (espIngDiccionario.containsKey(respuesta)) {
		      System.out.print("La palabra " + respuesta + " en ingles es: ");
		      System.out.println(espIngDiccionario.get(respuesta)+".");
		      } else {
		      System.out.print("La palabra introducida no existe en el diccionario.");
		      } 
		scanner.close();
		  }	
	}

