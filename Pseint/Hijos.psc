Algoritmo Hijos
	
	Definir a,b,z,n,suma Como Entero
	Definir promedio Como Real
	
	a = 0
	b = 0
	z = 0
	suma = 0
	promedio = 0
	
	Mientras a <> 2 Hacer
		Escribir "1 = Ingresar hijos"
		Escribir "2 = Salir"
		Leer a
		
		Si a == 1 o a == 2 Entonces
			Si a == 1 Entonces
				Escribir "Ingresar el numero de hijos"
				Leer n
				Si n < 0 Entonces
					Escribir "Ingresa un numero correcto"
				SiNo
					Si n == 0 Entonces
						b = b + 1
					SiNo
						z = z + 1
					FinSi
					suma = suma + n
					promedio = suma / (b+z)
				FinSi
			FinSi
		SiNo
			Escribir "Ingresa opción correcta"
		FinSi
	Fin Mientras
	
	Escribir "La cantidad de personas sin hijos es: ",b
	Escribir "La cantidad de personas con hijos es ",z
	Escribir "El promedio de hijos es: ",promedio
	
FinAlgoritmo