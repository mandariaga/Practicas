package org.rima.practicas;

public class SumaPares {
	public static void main(String[] args)
	{
		//cualquier n�mero
		int n1=7, n2=13;
		//variable que acumula la suma
		int suma=0;
		//variables que almacenar�n el meyor y el menor de los n�meros
		int mayor,menor;
		//antes de proceder a la suma es necesario identificar el n�mero de
		//inicio de la suma y el de finalizaci�n de la misma
		if(n1>n2){
			mayor=n1;
			menor=n2;
		}
		else{
			mayor=n2;
			menor=n1;
		}
		//realiza el c�lculo de la suma
		for(int i=menor;i<=mayor;i++){
			//si el n�mero es par se suma
			if(i%2==0){
				suma += i;
			}
		}
		System.out.println("La suma es "+suma);
		//con los n�meros elegidos, el resultado debiera ser 30
	}

}
