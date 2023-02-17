Algoritmo piramide2
	
	//Escribe una funeión en paeudocódigo que dibuje una pirdmide invertida en
	//pantalla como la de la figura. La altura se pasard como paránetro.
	//Si se pasa una altura -0 o negativa,
	//la función devolverd -1; en caso contrario devolverá o (éxito)
	
	
	Escribir "Introduzca altura"
	Leer alt_
	
	Si piramideInvertida(alt_1) <> 0 Entonces
		Escribir "LO LOGRO!"
	Sino
		Escribir "ERROR"
	FinSi
	
FinProceso

Funcion exitos = piramideInvertida(altura)
	j = 1
	anchura = 2 * altura
	Blanco = ""
	Mientras i < altura Hacer
		estrella = ""
		i = 1
		Mientras i <= anchura Hacer
			estrella = estrella + "*"
			i = i + 1
		Fin Mientras
		blanco = blanco + " "
		linea = blanco + estrella
		Escribir linea
		anchura = anchura-2
		j = j+1
	Fin Mientras
	
	Si altura >= 1 Entonces
		exitos = 0
	Sino
		exitos = -1
	Fin Si
FinFuncion