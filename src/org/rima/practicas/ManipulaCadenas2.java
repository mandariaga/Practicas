package org.rima.practicas;

public class ManipulaCadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		//String frase_resumen=frase.substring(29, 57);
		String frase_resumen=frase.substring(0, 29) + " irse a la playa y olvidarse de todo.."+
		" y "+frase.substring(29, 57);
		System.out.println(frase_resumen);

	}

}
