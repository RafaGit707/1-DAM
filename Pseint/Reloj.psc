Algoritmo Reloj
	
	contadorSeg <- 0
	contadorMin <- 0
	contadorHora <- 0
	
	Mientras Verdadero Hacer
		
		Limpiar Pantalla
		Escribir contadorHora, ":", contadorMin, ":", contadorSeg
		Esperar 1 Segundos
		
		Si contadorSeg = 59 Entonces
			contadorSeg <- 0
			
			Si contadorMin = 59 Entonces
				contadorMin <- 0
				
				Si contadorMin = 23 Entonces
					contadorHora <- 0
				SiNo
					contadorHora <- contadorHora + 1
				FinSi
				
			SiNo
				contadorMin <- contadorMin + 1
			FinSi
			
		SiNo
			contadorSeg <- contadorSeg + 1
		FinSi
		
	Fin Mientras
	
FinAlgoritmo
