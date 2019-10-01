Algoritmo ejercicio3
	
	Definir altura, espacio Como Entero;
	
	Escribir "Introduzca la altura del reloj de arena";
	
	Leer altura;
	
	Si altura >= 3 Y altura%2<>0 Entonces
		
		//Escribir "Reloj de arena";
		
		Para contador<-altura Hasta 1 Con Paso -2 Hacer
			
			Para contador2<-1 Hasta contador Con Paso 1 Hacer
				
				Escribir Sin Saltar "* ";
				
			Fin Para
			
			Escribir "";
			
			Para cont_espacio<-1 Hasta espacio Con Paso 1 Hacer
				
				espacio <- (altura-contador)/2;
				
				Escribir Sin Saltar " ";
				
			Fin Para
			
		Fin Para
		
		Para contador<-1 Hasta altura Con Paso 2 Hacer
			
			Para contador2<-1 Hasta contador Con Paso 1 Hacer
				
				Escribir Sin Saltar " ";
				
				Para cont_espacio<-1 Hasta espacio Con Paso 1 Hacer
					
					espacio <- (altura-contador)/2;
					
				Fin Para
				
			Fin Para
			
			Escribir "";
			
		Fin Para
		
	SiNo
		
		Escribir "Error";
		
	Fin Si
	
FinAlgoritmo
