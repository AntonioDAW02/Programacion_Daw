//Algoritmo que calcule el valor medio de de un array de 10 numeros.

Algoritmo ejemplo_2
	
	Definir numers, total, media Como Entero;
	
	Dimension numers[10];
	
	numers[0]<-7
	numers[1]<-6
	numers[2]<-7
	numers[3]<-7
	numers[4]<-10
	numers[5]<-6
	numers[6]<-5
	numers[7]<-8
	numers[8]<-8
	numers[9]<-6
		
	Para i<-0 Hasta 9 Hacer
		
		total <- total + numers[i];
		
	Fin Para
	
	Escribir  "la media es: ", total/10;
	
FinAlgoritmo
