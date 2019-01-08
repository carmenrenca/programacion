Algoritmo ejercicio6
	Escribir 'Dame tu calificacion'
	Repetir
		Leer nota
		Si nota<0 O nota>10 Entonces
			Escribir 'su nota debe de estar entre 0 y 10'
		FinSi
		Si nota>=9 Y nota<=10 Entonces
			Escribir 'sobre'
		FinSi
		Si nota>=7 Y nota<=8 Entonces
			Escribir 'notable'
		FinSi
		Si nota>=5 Y nota<=6 Entonces
			Escribir 'bien'
		FinSi
		Si nota>=0 Y nota<=4 Entonces
			Escribir 'suspenso'
		FinSi
	Hasta Que nota<0 Y nota>10
	Leer nota
FinAlgoritmo

