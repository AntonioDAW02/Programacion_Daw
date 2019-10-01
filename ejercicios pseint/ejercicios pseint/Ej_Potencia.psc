Algoritmo potencia
	//solicitar 2 números al usuario y
	//calcular "x" elevado a "y" e "y" elevado a "x".
	
	Definir pot, n_x, n_y como Entero;
	
	Escribir "Introduce 2 números";
	
	Leer n_x, n_y;
	
	// A^B = B*(A^(B-1))
	// A^0 = 1
	
	pot<-1;
	
	Para contador<-1 Hasta n_y Con Paso 1 Hacer
		
		pot<-pot*n_x;
		
	Fin Para
	
	Escribir n_x, " elevado a ", n_y, " es : ", pot;
	
	pot<-1;
	
	Para contador<-1 Hasta n_x Con Paso 1 Hacer
		
		pot<-pot*n_y;
		
	Fin Para
	
	Escribir n_y, " elevado a ", n_x, " es : ", pot;
	
FinAlgoritmo
