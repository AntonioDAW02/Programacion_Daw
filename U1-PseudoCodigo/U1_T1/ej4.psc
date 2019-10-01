Algoritmo ejercicio4
	
	Definir resalta_numero como Entero;
	
	Dimension array_aleatorio[20];
	
	Para i<-0 Hasta 20 Con Paso 1 Hacer
		
		num_aleatorio<-Aleatorio(0,400);
		
		Escribir Sin Saltar num_aleatorio, " ";
		
	Fin Para
	Escribir "";
	Escribir "¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7):"
	
	Leer resalta_numero;
	
	Para j<-0 Hasta 20 Con Paso 1 Hacer
		
		Si resalta_numero =1 Entonces
			multipo_de5 = num_aleatorio%5=0;
			Escribir multipo_de5;
		SiNo
			Si resalta_numero=2 Entonces
				multipo_de7 = num_aleatorio%7=0;
				Escribir multipo_de7;
			Fin Si
		Fin Si
		
	Fin Para
	
FinAlgoritmo
