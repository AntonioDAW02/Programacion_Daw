//Crea un procedimiento EscribirCentrado, que reciba como par�metro un texto y lo escriba centrado en pantalla
//(suponiendo una anchura de 80 columnas; pista: deber�s escribir 40 - longitud/2 espacios antes del texto.

Funcion EscribirCentrado ( mensaje )
	
	Definir tam como Entero;
	
	tam = Longitud(mensaje);
	
	Para contador<-1 Hasta (80-tam)/2 Con Paso 1 Hacer
		
		Escribir Sin Saltar "*";
		
	Fin Para
	
	Escribir mensaje;
	
Fin Funcion

Algoritmo ejercicio13
	
	EscribirCentrado("Hola Mundo");
	
FinAlgoritmo
