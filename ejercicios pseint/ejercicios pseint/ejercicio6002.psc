Algoritmo ejercicio6002
	
	Definir total, num1, num2, cont como Entero;
	
	Escribir "Introduzca dos números:";
	
	Leer num1,num2;
	
	cont<-0;
	total<-0;
	
	Mientras num1 > 0 && num2 > 0 Hacer
		
		total<-num1+num2;
		
		Escribir "Resultado de la suma", " ", total;
		
		num1<-num1-1;
		num2<-num2-1;
		
	Fin Mientras
	
FinAlgoritmo
