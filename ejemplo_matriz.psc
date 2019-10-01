Algoritmo sin_titulo
	//Solicitar al usuario los datos de una matriz de 4x3  y mostrar la suma de las filas
	
	Definir suma Como Entero;
	
	Dimension filas[3], elementos[4]
	
	Dimension matriz[4,3]
	
	matriz[1,1] = 1
	matriz[1,2] = 2
	matriz[1,3] = 3
	matriz[2,1] = 1
	matriz[2,2] = 2
	matriz[2,3] = 3
	matriz[3,1] = 1
	matriz[3,2] = 2
	matriz[3,3] = 3
	matriz[4,1] = 1
	matriz[4,2] = 2
	matriz[4,3] = 3
	
	//Leer filas
	Para fila<-1 Hasta 4 Con Paso 1 Hacer
		
		suma<-0
		
		Para columna<-1 Hasta 3 Con Paso 1 Hacer
			
			suma<-suma+matriz[fila,columna]
			
		Fin Para
		
		Escribir "La suma de la fila ",i, " es: ",suma
		
	Fin Para
	
FinAlgoritmo
