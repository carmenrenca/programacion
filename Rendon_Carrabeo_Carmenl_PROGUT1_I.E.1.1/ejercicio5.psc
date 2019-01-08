Algoritmo ejercicio5
	// Leer 10 números por teclado y a continuación realizar la media de los números
	// positivos, la media de los negativos y contar el número de ceros.
	Definir n,sumacero,sumaposi,sumaneg Como Real
	Escribir 'dame 10 numeros '
	sumacero <- 0
	Para contador<-1 Hasta 10 Hacer
		Leer n
		Si n>0 Entonces
			sumaposi <- sumaposi+n
		SiNo
			Si n<0 Entonces
				sumaneg <- sumaneg+n
			FinSi
			Si n==0 Entonces
				sumacero <- sumacero+1
			FinSi
		FinSi
	FinPara
	Escribir 'las media de los positivos es ',sumaposi/10
	Escribir 'las media de los negativos es ',sumaneg/10
	Escribir 'el numero de 0 es ',sumacero
FinAlgoritmo

