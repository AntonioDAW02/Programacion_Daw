//Crea una funci�n EsPar que devuelva el valor l�gico "verdadero" o "falso" 
//seg�n si el n�mero que se indique como par�metro es par o no lo es.

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
		
		Escribir "Es n�mero par";
		
	SiNo
		
		Escribir "Es n�mero impar";
		
	Fin Si
	
FinAlgoritmo
