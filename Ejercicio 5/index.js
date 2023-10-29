/**
 * Crear un programa en Javascript que realice lo siguiente:
Debe pedirle al usuario que intente adivinar el número secreto por prompt o por input, dicho número será del 1 al 100.

Si el usuario no adivina el número secreto, debe mostrar un mensaje por consola o DOM diciendo: “Ups, el número secreto es incorrecto, vuelve a intentarlo. ” y volver a solicitarle que ingrese un número.
Si el usuario adivina el número secreto debe de mostrar un mensaje por consola o DOM diciendo: “Felicidades, adivinaste el número secreto”. Además debe imprimir por consola o DOM la lista de números introducidos antes de adivinar el número secreto.
El número secreto puede ser introducido manualmente o generar un número aleatorio, pero recuerda que debe ser del 1 al 100.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
*/

function aleatorio() {
    return Math.floor(Math.random() * 100) + 1; // Retorna un número aleatorio entre 1 y 100
}

const numeroAleatorio = aleatorio(); // Guarda el número aleatorio para toda la ejecución del programa
console.log(numeroAleatorio);

let intentos = 0;
let adivinado = false;

while (!adivinado) {
    let pregunta = prompt("Adivina el número secreto (1 al 100): ");
    let valorInput = parseInt(pregunta);
    intentos++;

    if (isNaN(valorInput)) {
        alert("Error, dato inválido. Por favor, introduce un número");
    } else {
        if (valorInput === numeroAleatorio) {
            adivinado = true;
            alert(`¡Felicidades, adivinaste el número secreto en ${intentos} intentos!`);
            console.log(`¡Felicidades, adivinaste el número secreto en ${intentos} intentos!`);
        } else {
            console.log(`El ${valorInput} no es el número secreto`);
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo");
        }
    }
}

/*

Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub y adjuntar el link.
Puedes implementar un tipo de ayuda para que el usuario se guíe en caso de que el número introducido sea menor o mayor al número secreto.
 */