Algoritmo factorial
	
	Definir num, resultado como Entero;
	
	resultado<-1;
	
	Escribir "introduce un numero";
	
	Leer num;
	
	Para i<-num Hasta 2 Con Paso -1 Hacer
		
		resultado<-resultado*i;
		
	Fin Para
	
	Escribir "El factorial de ", num, " es ", resultado;
	
FinAlgoritmo
