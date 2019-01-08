Algoritmo ejercicio4
	Definir sueldo,ventas,kilometros,desplazamiento,total Como Real
	Repetir
		Escribir 'dime tu sueldo fijo '
		Leer sueldo
		sueldo <- sueldo-(sueldo*0.18)
		Escribir 'dime tus ventas realizadas'
		Leer ventas
		ventas <- ventas+(ventas*0.05)
		Escribir 'cuantos kilometros has realizado'
		Leer kilometros
		kilometros <- kilometros*1
		Escribir 'cuantos dias de desplazamiento has tenido'
		Leer desplazamiento
		desplazamiento <- desplazamiento*60
		total <- sueldo+ventas+kilometros+desplazamiento
		total <- total-150
		Escribir total
		Escribir 'desea hacer otra operacio S/N'
		Leer res
	Hasta Que res=='n'
FinAlgoritmo

