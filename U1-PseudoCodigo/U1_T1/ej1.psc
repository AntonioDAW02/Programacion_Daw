Algoritmo ejercicio1
	
	Definir n_horas_trabajadas como Entero;
	Definir sueldo_semanal, sueldo_semanal_actualizado Como Numerico;
	
	Escribir "Introduzca el numero de horas trabajadas durante la semana";
	Leer n_horas_trabajadas;
	
	Si n_horas_trabajadas <= 40 Entonces	
		
		
		sueldo_semanal<- 10*n_horas_trabajadas;
		
	SiNo
		
		sueldo_semanal<- (n_horas_trabajadas-40)*15+400;
		
	Fin Si
	
	Escribir sueldo_semanal;
	
FinAlgoritmo
