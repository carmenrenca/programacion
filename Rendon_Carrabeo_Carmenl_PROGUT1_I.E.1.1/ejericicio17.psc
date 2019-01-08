Algoritmo ejercicio17
	Definir baliza,n,ncomparador,sumamayor,sumamenor,total Como Entero
	Escribir 'introduce el numero baliza'
	Leer baliza
	Escribir 'introduce la cantidad de numeros a compara con baliza'
	Leer n
	Para contador<-1 Hasta n Hacer
		Leer ncomparador
		// esto es para la suma de todos lo mayores que baliza
		Si ncomparador>baliza Entonces
			total <- total+ncomparador
		FinSi
		// esto es para que vaya sumando uno cuando el numero que metemos sea mas grade que baliza
		Si ncomparador>n Entonces
			sumamayor <- sumamayor+1
		SiNo
			// esto es para que vaya sunmando uno cuando el numero que metemos sea mas chico que baliza
			Si ncomparador<n Entonces
				sumamenor <- sumamenor+1
			FinSi
		FinSi
		Escribir 'hay ',sumamenor,' numeros menores que baliza, Y ',sumamayor,' mayores'
	FinPara
	Escribir 'la suma de los mayores es de ',total
FinAlgoritmo

