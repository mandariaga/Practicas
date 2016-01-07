package org.rima.practicas;

public class Ordenamiento {
	public static void main(String[] args){
		//array de enteros
		int [] nums = {2, 34, 19, 5, 7, 28, 55, 3, 45, 21};
		//llama al método que ordena el array
		ordenar(nums);
		//llama la método que muestra el contenido del array
		mostrar(nums);
	}
	//el método no necesita devolver una referencia al array ordenado, dado que
	//ambas referencias , num y m, apuntan al mismo objeto array
	private static void ordenar(int[] m) {
		//variable auxiliar utilizada para el intercambio de datos en el array
		int aux;
		//recorre la posiciones del array
		for(int i=0;i<m.length;i++){
			//el segundo for se utiliza para comparar el valor de la posición
			//actual con las siguientes
			
		for(int j=i+1;j<m.length;j++){
			//si uno de los siguientes valores es inferior al actual, procede al
			//intercambio de las posiciones del array
			if(m[j]<m[i]){
				aux=m[i];
				m[i]=m[j];
				m[j]=aux;
			}
		}
	  }
		
	}

	//se encarga de mostrar el contenido del array
	private static void mostrar(int[] m) {
		// recorre el array utilizando for-each
		for(int num:m){
			System.out.print(num+",");
		}
		
	}

}
