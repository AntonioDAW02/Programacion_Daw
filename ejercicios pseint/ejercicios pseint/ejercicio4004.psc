Proceso ejercicio004
	
	Definir num1,num2 Como Entero;
	
	Escribir "Introduzca dos n�meros: ";
	
	Leer num1,num2;
	
	Si num1 > 0 && num2 > 0  Entonces
		Escribir "Los dos n�meros son positivos";
	SiNo
		Si num1 > 0 && num2 < 0 Entonces
			Escribir num1, " es positivo", " ", num2, " es negativo";
		SiNo
			Si num1 < 0 && num2 > 0 Entonces
				Escribir num1, " es negativo", " " ,num2, " es positivo";
			SiNo
				Escribir " Los dos n�meros son negativos";
			Fin Si
		Fin Si
	Fin Si
	
FinProceso
