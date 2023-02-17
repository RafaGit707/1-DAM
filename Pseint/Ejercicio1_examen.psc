Algoritmo Ejercicio1_examen
	
	obtenerDescuento_1 <- 0;
    obtenerDescuento_2 <- 0;
    obtenerDescuento_3 <- 0;
    obtenerDescuento_4 <- 0;
    obtenerDescuento_5 <- 0;
	
    Escribir Sin Saltar "Ingresa el valor de precio unico:";
    Leer solicitaValorPrecioUnico;
	
	Escribir Sin Saltar "Ingresa el numero de asistentes:";
	Leer solicitaValorAsistentes
	
    Repetir
        Escribir Sin Saltar "Ingresa el valor de edad: ";
        Leer solicitaValorEdad;
		
		solicitaValorAsistentes = solicitaValorAsistentes - 1
        descuento <- 0;
		
        Si solicitaValorEdad < 5 Entonces
            Escribir "No puede entrar al teatro";
        FinSi
        Si solicitaValorEdad >= 5 Y solicitaValorEdad < 15 Entonces
            descuento <- solicitaValorPrecioUnico * 0.35;
            obtenerDescuento_1 <- obtenerDescuento_1 + descuento;
        FinSi
        Si solicitaValorEdad >= 15 Y solicitaValorEdadd < 20 Entonces
            descuento <- solicitaValorPrecioUnico * 0.25;
            obtenerDescuento_2 <- obtenerDescuento_2 + descuento;
        FinSi
        Si solicitaValorEdad >= 20 Y solicitaValorEdad < 46 Entonces
            descuento <- solicitaValorPrecioUnico * 0.1;
            obtenerDescuento_3 <- obtenerDescuento_3 + descuento;
        FinSi
        Si solicitaValorEdad >= 46 Y solicitaValorEdad < 66 Entonces
            descuento <- solicitaValorPrecioUnico * 0.25;
            obtenerDescuento_4 <- obtenerDescuento_4 + descuento;
        FinSi
        Si solicitaValorEdad >= 66 Entonces
            descuento <- solicitaValorPrecioUnico * 0.35;
            obtenerDescuento_5 <- obtenerDescuento_5 + descuento;
        FinSi
		
        Escribir "Valor de descuento: ", descuento, " Euros";
		
    Hasta Que solicitaValorAsistentes = 0
    Escribir "Valor de descuentos por categoria 1: ", obtenerDescuento_1, " Euros";
    Escribir "Valor de descuentos por categoria 2: ", obtenerDescuento_2, " Euros";;
    Escribir "Valor de descuentos por categoria 3: ", obtenerDescuento_3, " Euros";;
    Escribir "Valor de descuentos por categoria 4: ", obtenerDescuento_4, " Euros";;
    Escribir "Valor de descuentos por categoria 5: ", obtenerDescuento_5, " Euros";;
	
FinAlgoritmo