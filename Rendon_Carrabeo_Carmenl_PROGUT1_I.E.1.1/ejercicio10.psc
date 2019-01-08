Algoritmo ejercicio10
	numerosecreto <- azar(100)+1
	Escribir numerosecreto
	Escribir 'vamos a adivinar un numero del 1 al 100'
	Leer n
	contador <- 0
	Repetir
		contador <- contador+1
		Si numerosecreto>n Entonces
			Escribir 'el numero secreo es mayor'
			Leer n
		FinSi
		Si numerosecreto<n Entonces
			Escribir 'el numero secreto es menor jaja'
			Leer n
		FinSi
	Hasta Que numerosecreto=n
	Escribir 'has acertado el numero era ',numerosecreto
	Escribir 'tu numero de intentos son de ',contador
FinAlgoritmo

