package org.rima.practicas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mayor,menor,suma;
		int [] nums = {3,4,8,2};
		suma=0;
		menor=nums[0];
		mayor=nums[0];
		//en las variables mator y menor se obtendr� el mayor y le menor de los
		//n�meros buscados, respectivamente. Ambos se reiniciar�n con cualquiera
		//de los valores del array
		
		//recorre el array en busca de  los extremos, acumulado en suma cada uno
		//de los n�meros contenidos en el array
		for(int i=0;i<nums.length;i++){
			if(nums[i]>mayor){
				mayor=nums[i];
			}
			if(nums[i]<menor){
				menor=nums[i];
			}
			suma+=nums[i];
		}
		System.out.println("El mayor n�mero es "+mayor);
		System.out.println("El menor n�mero es "+menor);
		System.out.println("La suma es  "+suma);

	}

}
