package org.rima.practicas;

public class SumaPares2 {
	public static void main(String[] args){
		//cualquier n�mero
		int n1=7, n2=13;
		//invoca el m�todo sumatorio para calcular la suma
		int suma=sumatorio(n1,n2);
		System.out.println("La suma es "+suma);
	}

	private static int sumatorio(int s1, int s2) {
		// variables que almacenar�n el mayor y el menor de los n�meros
		int mayor,menor;
		//variable local de sumas parciales
		int suma=0;
		//identifica los extremos
		if(s1>s2){
			mayor=s1;
			menor=s2;
		}
		else{
			mayor=s2;
			menor=s1;
		}
		//realiza el c�lculo de la suma
		for(int i=menor;i<=mayor;i++){
			//si el n�mero es par se suma
			if(i%2==0){
				suma += i;
			}
		}
		//devuelve la variable que contiene el resultado final de la suma
		return suma;
	}

}
