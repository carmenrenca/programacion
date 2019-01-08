Algoritmo ejercicio8
	Definir sumapar, sumaimpar como entero
	sumapar <- 0
	sumaimpar <- 0
	Escribir 'vamos a calcular la suma de los pares del 1 al 100'
	Para contador<-1 Hasta 100 Hacer
		Si contador MOD 2==0 Entonces
			sumapar <- sumapar+contador
		SiNo
			sumaimpar <- sumaimpar+contador
		FinSi
	FinPara
	Escribir 'el numero total de pares es ',sumapar
	Escribir 'el numero total de impares es ',sumaimpar
FinAlgoritmo

