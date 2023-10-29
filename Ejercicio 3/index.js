/*Crear un programa en Javascript que realice lo siguiente:
Debe solicitar al usuario un número por prompt o por input y guardarlo.
Debe calcular el factorial del número recibido utilizando recursión.
Debe imprimir el resultado por consola o por el DOM.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
5
120.
6
720.
Entrada: 
Salida:
Entrada: 
Salida: 
Pruébalo con los números que se te ocurran.*/

function calcularFactorial() {
    let respuesta = prompt("Introduce un número");
    let numero = parseInt(respuesta);

    if (!isNaN(numero) && numero >= 0) {
        function factorial(num) {
            if (num === 0) {
                return 1; 
            } else {
                return num * factorial(num - 1); 
            }
        }

        let resultado = factorial(numero);
        console.log(`El factorial de ${numero} es ${resultado}`);
       
    } else {

        console.log("Error: Por favor, introduce un número entero no negativo válido.");
        calcularFactorial(); 
    }
}

calcularFactorial();