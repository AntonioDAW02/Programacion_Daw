Algoritmo ejercicio11_2
	
	//Haz un programa que calcule ra�ces cuadradas: 
	//el usuario introducir� un n�mero y se le mostrar� su ra�z cuadrada. 
	//Se repetir� hasta que introduzca el n�mero 0 (para el que no se deber� mostrar su ra�z). 
	//Si introduce un valor negativo, se deber� mostrar un aviso en vez de intentar calcular su ra�z.
		
	
	Definir num1, raiz_cuadrada como Numerico;
	
	num1<-25;
	
	Mientras num1 != 0 Hacer
		
		Escribir "Introduce un n�mero para calcular su raiz";
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
