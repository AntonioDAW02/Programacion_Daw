Algoritmo multiplo
	
	//Muestra por pantalla los divisores de un número solicitado.
	
	Definir num como Entero;
	
	Escribir "Introduce un número";
	
	Leer num;
	
	Para i<-num Hasta 1 Con Paso -1 Hacer
		
		Escribir i;
		
		Si num % i = 0 Entonces
			
			Escribir i, " es divisor de ", num;

		Fin Si
		
	Fin Para
	
FinAlgoritmo
