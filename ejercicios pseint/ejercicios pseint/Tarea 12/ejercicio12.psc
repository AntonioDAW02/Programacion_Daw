Algoritmo ejercicio12
	
	Definir palabra Como Caracter;
	
	Escribir "Introduce Cadena";
	
	Leer palabra;
	
	Para contador<-longitud(palabra) Hasta 1 Con Paso -1 Hacer
		
		Escribir Sin Saltar subcadena(palabra,contador,contador);
		
	Fin Para
	
FinAlgoritmo
