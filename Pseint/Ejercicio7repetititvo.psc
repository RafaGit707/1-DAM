Algoritmo Ejercicio7repetititvo
	
	
	
	Definir num, max Como Entero
	
	
	Escribir "Introduzca numeros (salir=0):"
	
	Repetir
		
		Leer num
		
		Si num <> 0 Entonces
			
			contador <- contador + 1
			acumulador <- acumulador + num
			
			
			Si contador=1 Entonces
				max <- num
				min <- num
			Fin Si
			
			Si num > max Entonces
				max <- num
			Fin Si
			
			Si num < min Entonces
				min <- num
			FinSi
			
		FinSi
		
	Hasta Que num = 0
	
	Escribir "Max ", max
	Escribir "Min ", min
	Escribir "Media ", acumulador / contador
	
FinAlgoritmo