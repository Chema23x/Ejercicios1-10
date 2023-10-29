//Crear un programa en Javascript que realice lo siguiente:

/*Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
Entradas: 
4, 4, 2.
Salida:
4, 4, 2.
2, 4, 4.
Entradas: 
4, 2, 4.
Salida:
4, 4, 2.
2, 4, 4.
Entradas: 
2, 4, 4.
Salida:
4, 4, 2.
2, 4, 4.
Pruébalo con las combinaciones de números que se te ocurran*/

let valor1 = prompt("Dime tu primero numero");
let valor2 = prompt("Dime tu segundo numero");
let valor3 = prompt("Dime tu tercer numero");

const valores = [valor1,valor2,valor3];
valores.sort(function(a,b){
    return b-a    
});
console.log(valores);

valores.sort(function (a, b){
    return a - b;
});
console.log(valores);

