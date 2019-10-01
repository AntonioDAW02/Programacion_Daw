Funcion resultado <- esMayor ( n1,n2 )
	
	Si n1 > n2 Entonces
		
		resultado<-Verdadero;
		
	SiNo
		
		resultado<-Falso;
		
	Fin Si
	
Fin Funcion

Algoritmo funcion1
	
	Definir num1, num2 Como Entero;
	
	Escribir "Introduce numero 1 y numero 2";
	
	Leer num1, num2;
	
	Si esMayor(num1,num2) Entonces
		
		Escribir "El primero es mayor";
		
	SiNo
		
		Escribir "El segundo es mayor";
		
	Fin Si
	
FinAlgoritmo
