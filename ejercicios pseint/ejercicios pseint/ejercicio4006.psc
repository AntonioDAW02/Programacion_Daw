Algoritmo ejercicio4006
	
	Definir num1, num2, num3 como Numerico;
	
	Escribir "Introduce tres n�meros";
	
	Leer num1, num2, num3;
	
	Si num1 > num2 && num1 > num3 Entonces
		
		Escribir  "El primer n�mero es el mayor y corresponde al n�mero", " ", num1;
		
	SiNo
		Si num2 > num1 && num2 > num3 Entonces
			Escribir  "El segundo n�mero es el mayor y corresponde al n�mero", " ", num2;
		SiNo
			Escribir  "El tercer n�mero es el mayor y corresponde al n�mero", " ", num3;
		Fin Si
	Fin Si
	
FinAlgoritmo
