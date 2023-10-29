/*
Crear un programa en Javascript que realice lo siguiente:
3
0, 1, 1.
10
0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
Debe solicitar al usuario un número por prompt o por input y guardarlo.
Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8, debe mostrar 8 números de la serie de Fibonacci.
Debe imprimir el resultado por consola o por el DOM.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
Prueba tu programa con las siguientes combinaciones para asegurarte que funcione correctamente:
Entrada: 
Salida: 
Entrada: 
Salida: 
*/


function pregunta() {
    let input = prompt("Introduce un número");
    let numero = parseInt(input);
    if (!isNaN(numero)) {
        return numero;
    } else {
        alert("Introduce un valor válido");
        return pregunta();
    }
}

function fibonacci(numero) {
    const arrFib = [0, 1];
    for (let i = 2; i < numero; i++) {
        arrFib.push(arrFib[i - 1] + arrFib[i - 2]);
    }
    return arrFib;
}

let numero = pregunta();
console.log(`El resultado de Fibonacci es: ${fibonacci(numero)}`);