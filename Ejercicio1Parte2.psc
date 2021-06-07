//202030799 Manuel Rojas
//Solicitar al usuario que ingrese un número entero N, luego generar en forma aleatoria 
//N números enteros comprendidos entre 1 y 100 y determinar cuántos son pares y cuántos impares.
Proceso Ejercicio1Parte2
	Escribir "Ingrese un numero entero"
	Leer num
	contadorPar <- 0
	contadorImpar <- 0
	
	Mientras num <> 0 Hacer
		num <- num -1
		random <- Aleatorio(1, 100)
		Si (random%2) == 0 Entonces
			contadorPar <- contadorPar + 1
		SiNo
			contadorImpar <- contadorImpar +1
		FinSi
	FinMientras
	
	Escribir "Se generaron ", contadorPar, " numeros pares y ", contadorImpar, " numeros impares."
FinProceso
