Algoritmo ejercicio12
	Definir cara1,cara2,cara3,cara4,cara5,cara6 Como Real
	Escribir 'vamos a tirar un dado'
	Escribir 'dime el numero de veces que quieres tirarlo'
	Leer n
	Para i<-1 Hasta n Hacer
		dado <- azar(6)+1
		Segun dado  Hacer
			1:
				cara1 <- cara1+1
			2:
				cara2 <- cara2+1
			3:
				cara3 <- cara3+1
			4:
				cara4 <- cara4+1
			5:
				cara5 <- cara5+1
			6:
				cara6 <- cara6+1
		FinSegun
	FinPara
	Escribir 'el porcentaje de veces que a salido  la cara 1 es ',(cara1/n)*100,'%'
	Escribir 'el porcentaje de veces que a salido  la cara 2 es ',(cara2/n)*100,'%'
	Escribir 'el porcentaje de veces que a salido  la cara 3 es ',(cara3/n)*100,'%'
	Escribir 'el porcentaje de veces que a salido  la cara 4 es ',(cara4/n)*100,'%'
	Escribir 'el porcentaje de veces que a salido  la cara 5 es ',(cara5/n)*100,'%'
	Escribir 'el porcentaje de veces que a salido  la cara 6 es ',(cara6/n)*100,'%'
FinAlgoritmo

