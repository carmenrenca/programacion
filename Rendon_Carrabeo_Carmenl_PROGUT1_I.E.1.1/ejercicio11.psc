Algoritmo ejercicio11
	Escribir 'introduceme dos numeros para ver si son amigos o no '
	Leer n1
	Leer n2
	suma1 <- 0
	suma2 <- 0
	Para contador<-1 Hasta n1 Hacer
		Si n1%contador==0 Entonces
			suma1 <- suma1+contador
		FinSi
	FinPara
	Para contador<-1 Hasta n2 Hacer
		Si n2%contador==0 Entonces
			suma2 <- suma2+contador
		FinSi
	FinPara
	Repetir
		Si suma1=suma2 Entonces
			Escribir n1,' y ',n2,' son amigos '
		SiNo
			Escribir 'no son amigos'
		FinSi
	Hasta Que n1<>n2
FinAlgoritmo

