Algoritmo ejercicio11
	
	//Crea un programa que genere un número al azar entre el 1 y el 100.
	//El usuario tendrá 7 oportunidades para adivinarlo.
	//Tras cada intento, se le dirá si se ha pasado o se ha quedado corto.
	
	Definir n_azar, n_usuario, contador como Entero;
	Definir encontrado como LOGICO;
	
	n_azar<-azar(100)+1;
	Escribir n_azar;
	encontrado<-FALSO;
	contador<-0;
	
	Mientras contador<7 Y NO(encontrado) Hacer
		
		Escribir "Introduce un número";
		
		Leer n_usuario;
		
		SI n_usuario = n_azar Entonces
			
			encontrado <- VERDADERO;
			Escribir "HAS GANADO";
			
		SiNo
			SI n_usuario < n_azar Entonces
				
				Escribir "El numero secreto es mayor. Te quedan: ", 6-contador," intentos.";
				
			SiNo
				Escribir "El numero secreto es menor. Te quedan: ", 6-contador," intentos.";
				
			FinSi
			
		FinSi
		
		contador<-contador+1;
		
	Fin Mientras
	
	SI NO(encontrado) Entonces
		
		Escribir "HAS PERDIDO";
		
	FinSi
	
FinAlgoritmo
