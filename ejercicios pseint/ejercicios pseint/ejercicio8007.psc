Algoritmo ejercicio8007
	
	//Ejercicio8-7: A partir del ejemplo que dibuja un rect�ngulo de asteriscos,
	//crea un que dibuje un cuadrado (deber� pedir s�lo un dato, el lado,
	//y ambas �rdenes "para" deber�n tener ese valor como l�mite).
	
	Definir lado como Entero;
	
	Escribir "Inroduce el lado del cuadrado";
	
	Leer lado;
	
	Para i<-1 Hasta lado Hacer
		
		Para j<-1 Hasta lado Hacer
			
			Escribir Sin Saltar "* ";
			
		Fin Para
		
		Escribir ""; //Avance de linea tras cada fila.
		
	Fin Para
	
FinAlgoritmo
