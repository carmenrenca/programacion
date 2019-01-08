Algoritmo ejercicio18
	definir n,a,b,sumauno,sumados como entero
	Escribir 'dime hasta donde quieres calcular el centro de un numero'
	Leer n
	Para contador<-1 Hasta n Hacer
		Para a<-0 Hasta contador-1 Hacer
			sumauno <- sumauno+a
		FinPara
		b <- contador+1
		Mientras sumados<=sumauno Hacer
			sumados <- sumados+b
			Si sumados==sumauno Entonces
				Escribir contador,' es un centro numerico'
			FinSi
			b <- b+1
		FinMientras
		sumados <- 0
		sumauno <- 0
	FinPara
FinAlgoritmo

