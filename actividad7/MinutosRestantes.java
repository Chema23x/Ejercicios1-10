package actividad7;

import java.util.Scanner;

/*
 * Crear un programa en Java que realice lo siguiente:
Debe solicitar al usuario un día de la semana (de lunes a viernes).
Debe solicitar al usuario una hora (horas y minutos).
Debe calcular cuantos minutos faltan para el fin de semana. Se considera que el fin de semana comienza el viernes a las 15:00 hrs.
Debe mostrar el resultado por consola.
Debe ser capaz de identificar si los datos de entrada son válidos (día de la semana válido, hora válida, minutos válidos), en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
lunes
14
30
Faltan 5730 minutos para el fin de semana.
Entradas: Lunes, 14:30 hrs
Salida:
Pruébalo con las combinaciones que se te ocurran.
Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub y adjuntar el link
 */

public class MinutosRestantes {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        String dia;
        int diaSemana;

        do {
            System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
            dia = scanner.nextLine().toLowerCase();

            switch (dia) {
                case "lunes":
                    diaSemana = 0;
                    break;
                case "martes":
                    diaSemana = 1;
                    break;
                case "miércoles":
                case "miercoles":
                    diaSemana = 2;
                    break;
                case "jueves":
                    diaSemana = 3;
                    break;
                case "viernes":
                    diaSemana = 4;
                    break;
                default:
                    System.out.println("El día introducido no es el correcto. Por favor, introduzca un día válido.");
                    diaSemana = -1; // Establece un valor no válido para que el bucle continúe
                    break;
            }
        } while (diaSemana == -1);

        int horas, minutos;
        do {
            System.out.println("Introduzca la hora y minutos del día");

            System.out.print("Hora: ");
            horas = scanner.nextInt();

            System.out.print("Minutos: ");
            minutos = scanner.nextInt();

            if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
                System.out.println("Hora o minutos no válidos. Por favor, introduzca valores válidos.");
            }

        } while (horas < 0 || horas > 23 || minutos < 0 || minutos > 59);

        int minutosTotales = (4 * 24 * 60) + (15 * 60);
        int minutosActuales = (diaSemana * 24 * 60) + (horas * 60) + minutos;

        System.out.println("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
        scanner.close();
    }
}