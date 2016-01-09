package org.rima.practicas;

public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Ricardo";
		
		System.out.println("Mi nombre es "+nombre);
		System.out.println("Mi nombre tiene "+nombre.length()+ " letras");
		System.out.println("La primera letra de "+nombre+ " es la "+nombre.charAt(0));
		
		//se crea variable para que funcione con cualquier nombre, sin importar su largo
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("Y la última letra es la "+nombre.charAt(ultima_letra-1));

	}

}
