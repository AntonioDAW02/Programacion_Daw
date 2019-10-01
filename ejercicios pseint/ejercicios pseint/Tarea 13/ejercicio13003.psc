//Crea una función EsPar que devuelva el valor lógico "verdadero" o "falso" 
//según si el número que se indique como parámetro es par o no lo es.

Funcion resultado <- esPar ( n1 )
	
	Si n1%2 == 0 Entonces
		
		resultado<-Verdadero;
		
	SiNo
		
		resultado<-Falso;
		
	Fin Si
	
Fin Funcion

Algoritmo ejercicio13003
	
	Definir num1 como Entero;
	
	Escribir "Introduce un numero";
	
	Leer num1;
	
	Si esPar(num1) Entonces
		
		Escribir "Es número par";
		
	SiNo
		
		Escribir "Es número impar";
		
	Fin Si
	
FinAlgoritmo
