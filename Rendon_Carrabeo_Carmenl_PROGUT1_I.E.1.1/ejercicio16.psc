Algoritmo ejercicio16
	Repetir
		Escribir 'Pulsa 0 cuano quieres salir del programa y 1 si quieres continuar'
		Leer res
		Si res==0 Entonces
		FinSi
		Escribir '-----------------------------------------------------'
		Escribir 'Que tipo de cultivo prefieres '
		Escribir 1,' TOMATES'
		Escribir 2,' REPOLLO'
		Escribir 3,' PATATA '
		Escribir 4,' CEBOLLA'
		Leer cultivo
		Si cultivo=1 Entonces
			Escribir ' elige el tipo de semilla de tomates '
			Escribir 1,' PERA '
			Escribir 2,' ENSALADA'
			Leer semilla
			Si semilla=1 Entonces
				Escribir 'el valor de una semilla de pera es de 15 '
				Escribir 'cuantas quieres'
				Leer numerosemillas
				numerosemillas <- numerosemillas*15
				Escribir 'el costo es de ',numerosemillas
			SiNo
				Escribir 'el valor de los tomates de ensalada es de 20'
				Escribir 'cuantas quieres'
				Leer numerosemillas
				numerosemillas <- numerosemillas*20
				Escribir 'el costo es de ',numerosemillas
			FinSi
		FinSi
		Si cultivo=2 Entonces
			Escribir ' El precio de las semillas de repollo es de 10'
			Escribir 'cuantas quieres'
			Leer numerosemillas
			numerosemillas <- numerosemillas*10
			Escribir 'el costo es de ',numerosemillas
		FinSi
		Si cultivo=3 Entonces
			Escribir 'elige un tipo de semillas de patatas'
			Escribir 1,' criolla '
			Escribir 2,' Pastusa'
			Escribir 3,' Salentuna'
			Leer semilla
			Si semilla=1 Entonces
				Escribir ' las semillas de criolla es de un valor de 8'
				Escribir 'cuantas quieres'
				Leer numerosemillas
				numerosemillas <- numerosemillas*8
				Escribir 'el costo es de ',numerosemillas
			FinSi
			Si semilla=2 Entonces
				Escribir ' las semillas de pastusa es de un valor de 9'
				Escribir 'cuantas quieres'
				Leer numerosemillas
				numerosemillas <- numerosemillas*9
				Escribir 'el costo es de ',numerosemillas
			FinSi
			Si semilla=3 Entonces
				Escribir ' las semillas de salentuna es de 11'
				Escribir 'cuantas quieres'
				Leer numerosemillas
				numerosemillas <- numerosemillas*11
				Escribir 'el costo es de ',numerosemillas
			FinSi
		FinSi
		Si cultivo=4 Entonces
			Escribir ' elige un tipo de semillas de cebolla '
			Escribir 1,' Larga'
			Escribir 2,' Vieja'
			Leer semilla
			Si semilla=1 Entonces
				Escribir 'el valor de la semilla larga es de 15'
				Escribir 'cuantas quieres'
				Leer numerosemillas
				numerosemillas <- numerosemillas*15
				Escribir 'el costo es de ',numerosemillas
			SiNo
				Escribir 'el valor de la semilla vieja es de 13'
				Escribir 'cuantas quieres'
				Leer numerosemillas
				numerosemillas <- numerosemillas*13
				Escribir 'el costo es de ',numerosemillas
			FinSi
		FinSi
	Hasta Que res==0
	Escribir 'deseas finalizar S/N'
	Leer res
FinAlgoritmo

