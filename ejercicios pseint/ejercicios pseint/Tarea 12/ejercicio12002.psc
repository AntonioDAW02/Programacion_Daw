Algoritmo ejercicio12_2
	
	// Crea un programa que pida su nombre al usuario y lo escriba alternando
	//letras mayúsculas y minúsculas (por ejemplo, "nAcho" se mostraría como "NaChO".
	
	Definir palabra Como Caracter;
	
	Escribir "Introduce Cadena";
	
	Leer palabra;
	
	Para contador<-longitud(palabra) Hasta 1 Con Paso 1 Hacer
		
		Si contador%2=0 Entonces
			
			Escribir Sin Saltar SUBCADENA(palabra,MAYUSCULAS(1));
			
		SiNo
			
			Escribir Sin Saltar SUBCADENA(palabra,MINUSCULAS());
			
		Fin Si
		
	Fin Para
	
FinAlgoritmo
