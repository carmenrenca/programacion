Algoritmo ejercicio13
	Definir dia1,horasalida,min1,dia2,horallegada,min2 Como Real
	Escribir 'vamos a calcular el tiempo que vas a tardar'
	Repetir
		Escribir 'dame un dia valido de salida del 1 al 31'
		Leer dia1
	Hasta Que dia1>=1 Y dia1<=31
	Repetir
		Escribir 'dame la hora de salida valida desde las 1h hasta las 24'
		Leer horasalida
	Hasta Que horasalida>=1 Y horasalida<=24
	Repetir
		Escribir 'dame los minutos de salida de 1 a 60'
		Leer min1
	Hasta Que min1>=1 Y min1<=60
	Escribir '-----------------------------------------------'
	Repetir
		Escribir 'dame un dia valido de llegada del 1 al 31'
		Leer dia2
		Si dia1>dia2 Entonces
			Escribir 'dame un dia mas grande que el de salida'
			dia2 <- 32
		FinSi
	Hasta Que dia2>=1 Y dia2<=31
	Repetir
		Escribir 'dame la hora de llegada valida desde las 1h hasta las 24'
		Leer horallegada
		Si dia1==dia2 Y horasalida>horallegada Entonces
			Escribir 'no es posible'
			horallegada <- 25
		FinSi
	Hasta Que horallegada>=1 Y horallegada<=24
	Repetir
		Escribir 'dame los minutos de llegada de 1 a 60'
		Leer min2
	Hasta Que min2>=1 Y min2<=60
	dia1 <- dia1*1440
	dia2 <- dia2*1440
	horasalida <- horasalida*60
	horallegada <- horallegada*60
	min1 <- min1
	min2 <- min2
	sumasalida <- dia1+horasalida+min1
	sumallegada <- dia2+horallegada+min2
	total <- sumallegada-sumasalida
	escribir trunc(total/1440) "numeros de dias"
	total= trunc (total%1440) //resto de minutos al descontarle los dias
	Escribir trunc(total/60) "numero horas"
	
	escribir trunc(total%60) "los minutos"
	
FinAlgoritmo

