Algoritmo sin_titulo
	
	Definir anterior, frase Como Caracter
	Definir cont_palabra Como Entero
	
	Escribir "Introduce la frase";
	Leer frase;
	
	anterior<- " ";
	cont_palabra<-0;
	
	Para i<-1 Hasta Longitud(frase) Con Paso 1 Hacer
		
		Si Subcadena(frase, i, i) <> anterior Y anterior = " " Entonces
			
			cont_palabra<-cont_palabra+1;
		
		Fin Si
		
		anterior <- Subcadena(frase,i,i)
		
	Fin Para
	
	Escribir "Numero de palabras: ",cont_palabra;
	
FinAlgoritmo
