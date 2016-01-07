package org.rima.practicas;

public class SumaPares2 {
	public static void main(String[] args){
		//cualquier número
		int n1=7, n2=13;
		//invoca el método sumatorio para calcular la suma
		int suma=sumatorio(n1,n2);
		System.out.println("La suma es "+suma);
	}

	private static int sumatorio(int s1, int s2) {
		// variables que almacenarán el mayor y el menor de los números
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
		//realiza el cálculo de la suma
		for(int i=menor;i<=mayor;i++){
			//si el número es par se suma
			if(i%2==0){
				suma += i;
			}
		}
		//devuelve la variable que contiene el resultado final de la suma
		return suma;
	}

}
