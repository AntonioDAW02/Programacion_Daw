Proceso ejercicioBucle
	
	Definir num, contador como Entero;
	
	num<-1;
	contador<-0;
	
	Repetir
		Si num%4==0 Entonces
			
			contador<-contador+1;
			Escribir num;
			
		Fin Si
		
		num<-num+1;
		
	Hasta Que contador=30;
	
FinProceso
