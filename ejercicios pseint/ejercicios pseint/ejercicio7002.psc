Algoritmo ejercicio7002
	
	Definir num1, num2, suma Como Entero;
	
	Escribir "Introduce dos números";
	
	Leer num1, num2;
	
	//error al introducir numeros diferentes, entra en bucle infinito
	
	Repetir
		
		suma <- num1 + num2;
		
		num1 <- num1 - 1;
		num2 <- num2 - 1;
		
		Escribir suma;
		
	Hasta Que num1 == 0 && num2 == 0
	
FinAlgoritmo
