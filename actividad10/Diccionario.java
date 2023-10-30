package actividad10;
//Crear un programa en Java que realice lo siguiente:


//Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
	//Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
	//Utilizar un objeto HashMap para almacenar los pares de palabras.
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
			
			 Random random = new Random();
		        Object[] palabrasEspañol = espIngDiccionario.keySet().toArray();
		        int respuestasCorrectas = 0;
		        int respuestasIncorrectas = 0;
		        
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("¡Bienvenido al juego de traducción español-inglés!");
		        System.out.println("Traduce las siguientes palabras al inglés:");
		        
		      //Escoger al azar 5 palabras en español del mini diccionario.
		        for (int i = 0; i < 5; i++) {
		            int indiceAleatorio = random.nextInt(palabrasEspañol.length);
		            String palabraEspañol = palabrasEspañol[indiceAleatorio].toString();
		            String palabraIngles = espIngDiccionario.get(palabraEspañol);
		            
		          //Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.    
		            System.out.print(palabraEspañol + ": ");
		            String respuestaUsuario = scanner.nextLine();
		            
		            if (respuestaUsuario.equalsIgnoreCase(palabraIngles)) {
		                System.out.println("¡Correcto!");
		                respuestasCorrectas++;
		            } else {
		                System.out.println("Incorrecto. La respuesta correcta es: " + palabraIngles);
		                respuestasIncorrectas++;
		            }
		        }
		        
		        System.out.println("\nResumen:");
		        System.out.println("Respuestas correctas: " + respuestasCorrectas);
		        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

		        scanner.close();
	}

}
