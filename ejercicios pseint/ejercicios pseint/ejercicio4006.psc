Algoritmo ejercicio4006
	
	Definir num1, num2, num3 como Numerico;
	
	Escribir "Introduce tres números";
	
	Leer num1, num2, num3;
	
	Si num1 > num2 && num1 > num3 Entonces
		
		Escribir  "El primer número es el mayor y corresponde al número", " ", num1;
		
	SiNo
		Si num2 > num1 && num2 > num3 Entonces
			Escribir  "El segundo número es el mayor y corresponde al número", " ", num2;
		SiNo
			Escribir  "El tercer número es el mayor y corresponde al número", " ", num3;
		Fin Si
	Fin Si
	
FinAlgoritmo
