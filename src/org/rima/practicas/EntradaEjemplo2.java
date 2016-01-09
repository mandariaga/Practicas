package org.rima.practicas;

import javax.swing.JOptionPane;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario=JOptionPane.showInputDialog("Ingresa tu nombre");
		String edad=JOptionPane.showInputDialog("Ingresa tu edad");
		
		int edad_usuario=Integer.parseInt(edad);
		
		//edad_usuario++;   otra alternativa 
		
		System.out.println("Hola "+nombre_usuario+". El año que viene tendrás "+(edad_usuario+1)+" años");

	}

}
