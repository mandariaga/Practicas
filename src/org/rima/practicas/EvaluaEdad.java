package org.rima.practicas;

import java.util.Scanner;

public class EvaluaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresa tu edad");
		
		int edad=entrada.nextInt();
		
		//evalúa edad opción 1
	//	if(edad>=18){
			
	//		System.out.println("Eres mayor de edad");
	//	}
	//	else{
	//		System.out.println("Eres menor de edad");
	//	}
		//evalúa edad opción 2
		
		if(edad<18){
			System.out.println("Eres adolescente");
		}
		else if(edad<40){
			System.out.println("Eres joven");
		}
		else if(edad<65){
			System.out.println("Eres maduro");
		}
		else{
			System.out.println("Cuidate");
		}
	}

}
