Algoritmo ejercicio1
	// Realiza un programa en el que le pidas al usuario las notas de las 6 asignaturas
	// del Ciclo de DAM y te calcule la nota media del curso
	suma <- 0
	Repetir
		Escribir 'Por favor, introduzca la nota de Programaci�n '
		Leer n
		suma <- suma+n
	Hasta Que n>=0 Y n<=10
	Repetir
		Escribir 'Introduzca la nota de Lenguajes de Marcas: '
		Leer n
		suma <- suma+n
	Hasta Que n>=0 Y n<=10
	Repetir
		Escribir 'Introduzca la nota de Bases de Datos: '
		Leer n
		suma <- suma+n
	Hasta Que n>=0 Y n<=10
	Repetir
		Escribir 'Introduzca la nota de Entornos de Desarrollo: '
		Leer n
		suma <- suma+n
	Hasta Que n>=0 Y n<=10
	Repetir
		Escribir 'Introduzca la nota de Sistemas Inform�ticos: '
		Leer n
		suma <- suma+n
	Hasta Que n>=0 Y n<=10
	Repetir
		Escribir 'Por �ltimo, introduzca la nota de Formaci�n y Orientaci�n Laboral: '
		Leer n
		suma <- suma+n
	Hasta Que n>=0 Y n<=10
	suma <- suma/6
	Escribir 'Su nota media del curso es de: ',suma
FinAlgoritmo

