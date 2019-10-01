//Calcula el numero mayor del array
//SIN TERMINAR

Algoritmo ejemplo3
	
	Definir notas, n_mayor, n_menor como Entero;
	
	Dimension notas[10];
	
	notas[0]<-7
	notas[1]<-6
	notas[2]<-7
	notas[3]<-7
	notas[4]<-10
	notas[5]<-6
	notas[6]<-5
	notas[7]<-8
	notas[8]<-8
	notas[9]<-6
	
	n_mayor<-notas[0];
	n_menor<-notas[0];
	
	Para i<-1 Hasta 9 Hacer
		
		Si notas[i]>n_mayor Entonces
			
			n_mayor<-notas[i];
			
			
		Fin Si
		Si notas[i]<n_menor Entonces
			
			n_menor<-notas[i];
			
		Fin Si
		
	Fin Para
	
	Escribir "El mayor es:", n_mayor;
	Escribir "El menor es:", n_menor;
	
FinAlgoritmo
