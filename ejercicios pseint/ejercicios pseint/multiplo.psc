Algoritmo multiplo
	
	//Muestra por pantalla los divisores de un n�mero solicitado.
	
	Definir num como Entero;
	
	Escribir "Introduce un n�mero";
	
	Leer num;
	
	Para i<-num Hasta 1 Con Paso -1 Hacer
		
		Escribir i;
		
		Si num % i = 0 Entonces
			
			Escribir i, " es divisor de ", num;

		Fin Si
		
	Fin Para
	
FinAlgoritmo
