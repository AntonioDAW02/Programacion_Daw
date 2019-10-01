Algoritmo ejercicio11_2
	
	//Haz un programa que calcule raíces cuadradas: 
	//el usuario introducirá un número y se le mostrará su raíz cuadrada. 
	//Se repetirá hasta que introduzca el número 0 (para el que no se deberá mostrar su raíz). 
	//Si introduce un valor negativo, se deberá mostrar un aviso en vez de intentar calcular su raíz.
		
	
	Definir num1, raiz_cuadrada como Numerico;
	
	num1<-25;
	
	Mientras num1 != 0 Hacer
		
		Escribir "Introduce un número para calcular su raiz";
		Leer num1;
		
		SI num1 < 0 Entonces
			
			Escribir "No se puede calcular la raiz cuadrada";
			
		SiNo
			SI num1 > 0 Entonces
				
				raiz_cuadrada <- RC(num1);
				
				Escribir "La raiz cuadrada de ",num1," es: ", raiz_cuadrada;
				
			FinSi
			
		FinSi
		
	Fin Mientras
	
FinAlgoritmo
