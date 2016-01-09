package org.rima.practicas;

import java.util.Scanner;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa tu nombre:");
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Ingresa tu edad:");
		int edad=entrada.nextInt();
		System.out.println("Hola "+nombre_usuario+". El próximo año tendrás "+(edad+1)+" años");

	}

}
