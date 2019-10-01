Algoritmo suma_numeros
	
	//Realizar un algoritmo que sume todos los numeros pares 
	//y todos los numeros impares menos que 1000
	
	Definir num, n_par, n_impar Como Entero;
	
	n_par<-0;
	n_impar<-0;
	
	Para contador<-0 Hasta 1000 Con Paso 1 Hacer
		
		Si contador%2=0 Entonces
			n_par<-n_par+contador;
		SiNo
			n_impar<-n_impar+contador;
		Fin Si
		
	Fin Para
	
	Escribir "Suma de números pares", n_par;
	Escribir "Suma de números impares", n_impar;
	
	
	
FinAlgoritmo
