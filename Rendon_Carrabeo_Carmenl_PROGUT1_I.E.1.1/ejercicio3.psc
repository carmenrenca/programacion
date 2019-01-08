Algoritmo ejercicio3
	definir a,b,c,n Como Real
	
	Escribir "dame un numero " 
	leer n
	
	Para a=1 hasta n con paso 1
		
		c=0
		
		Para b=1 hasta a con paso 1 hacer
			
			si a%b=0 entonces
			c=c+1
			FinSi
		FinPara
		
		si c=2 entonces
		
			Escribir a
		FinSi
		
	FinPara

FinAlgoritmo
