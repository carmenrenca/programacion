Algoritmo ejercicio7
	contador <- 0
	Escribir 'introduce un numero'
	Repetir
		Leer n
		contador <- 0
		Si n<=0 O contador>n Entonces
			Escribir 'me tienes que dar un numero mas grande q 0'
		FinSi
		Para i<-1 Hasta n Hacer
			Si i MOD 3==0 Entonces
				Escribir i
				contador <- contador+1
			FinSi
		FinPara
		Escribir 'Desde 1 hasta ',n,' hay ',contador,' numeros multiplos de 3'
	Hasta Que n<0 Y contador>0
	Leer n
FinAlgoritmo

