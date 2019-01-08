Algoritmo ejericio9
	Definir n1,n2,suma,resta,multiplicacion,division,res Como Real
	Escribir 'introduce un numero'
	Leer n1
	Escribir 'dame otro'
	Leer n2
	Repetir
		Escribir 'introduce un numero del 1 al 5 para hacer una operacio.     '
		Escribir '1.- Sumar los números.'
		Escribir '2.- Restar los números.'
		Escribir '3.- Multiplicar los números.'
		Escribir '4.- Dividir los números.'
		Escribir '5.- Salir del programa.'
		Leer res
		Si res==1 Entonces
			suma <- n1+n2
			Escribir 'la suma entre los numeros es ',suma
		FinSi
		Si res==2 Entonces
			resta <- n1-n2
			Escribir 'la resta entre los numeros es ',resta
		FinSi
		Si res==3 Entonces
			multiplicacion <- n1*n2
			Escribir 'La multiplicacion de los numeros es ',multiplicacion
		FinSi
		Repetir
			Si res==4 Y n1==0 Entonces
				Escribir 'introducir otro divisor que no sea 0'
				Leer n1
			FinSi
		Hasta Que n1<>0
		Si res==4 Y n1<>0 Entonces
			division <- n1/n2
			Escribir 'la division entre los dos numeros es de ',division
		FinSi
	Hasta Que res==5
	Escribir 'adioss'
FinAlgoritmo

