Algoritmo ejercicio15
	Definir mayor1,mayor2,n,num,aux Como Real
	mayor1 <- -324445325523652345
	mayor2 <- -324445325523652345
	Escribir 'dime los numeros que quieras poner '
	Leer n
	Para contador<-1 Hasta n Hacer
		Leer num
		Si num>mayor1 Entonces
			aux <- mayor1
			mayor1 <- num
			mayor2= aux
		FinSi
		Si num>mayor2 Y num=mayor1 Entonces
			num <- aux
		FinSi
	FinPara
	Escribir 'El primer numero mas grande es ',mayor1
	Escribir 'El segundo mayor es ',mayor2
FinAlgoritmo

