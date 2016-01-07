package org.rima.practicas;

public class SumaPares {
	public static void main(String[] args)
	{
		//cualquier número
		int n1=7, n2=13;
		//variable que acumula la suma
		int suma=0;
		//variables que almacenarán el meyor y el menor de los números
		int mayor,menor;
		//antes de proceder a la suma es necesario identificar el número de
		//inicio de la suma y el de finalización de la misma
		if(n1>n2){
			mayor=n1;
			menor=n2;
		}
		else{
			mayor=n2;
			menor=n1;
		}
		//realiza el cálculo de la suma
		for(int i=menor;i<=mayor;i++){
			//si el número es par se suma
			if(i%2==0){
				suma += i;
			}
		}
		System.out.println("La suma es "+suma);
		//con los números elegidos, el resultado debiera ser 30
	}

}
