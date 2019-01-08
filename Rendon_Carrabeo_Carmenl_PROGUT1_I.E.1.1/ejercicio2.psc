Algoritmo sin_titulo
	// Realiza un programa en el que le pidas al usuario un número de 4 cifras y
	// muestre por pantalla cada una de las cifras que lo forman.
	Repetir
		Escribir 'dame un numero de 4 cifras'
		Leer n
	Hasta Que n>=1000 Y n<=9999
	Escribir 'La primera cifra es: ',trunc(n/1000)
	Escribir 'La segunda cifra es: ',trunc((n MOD 1000)/100)
	Escribir 'la tercera cifra es ',trunc((n MOD 100)/10)
	Escribir 'la cuerta cifra es ',trunc(n MOD 10)
FinAlgoritmo

