// Crea un programa que pida dos n�meros enteros al usuario y diga si alguno de ellos es m�ltiplo del otro.
//Crea una funci�n EsMultiplo que te ayude a que el proceso principal sea legible.

Funcion resultado <- esMultiplo ( n1, n2 )
	
	Si n1%n2 == 0 Entonces
		
		resultado<-Verdadero;
		
	SiNo
		
		resultado<-Falso;
		
	Fin Si
	
Fin Funcion


Algoritmo ejercicio13002
	
	Definir num1, num2 como Entero;
	
	Escribir "Introduce numero 1 y numero 2";
	
	Leer num1, num2;
	
	Si esMultiplo(num1, num2) Entonces
		
		Escribir  "Es multiplo";
		
	SiNo
		
		Escribir "No es multiplo";
		
	Fin Si
	
FinAlgoritmo
