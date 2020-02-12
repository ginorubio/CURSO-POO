package edu.pe.fisi.poo;

public class Ejercicio2 {

	public static void main (String argc[]) {
		
		Animal[] animales = new Animal[10];
		animales[0] = new Hombre();
		animales[1] = new Perro();
		animales[2] = new Gato();
		
		for(int i = 0;i<animales.length;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(animales[j].hablar());//consultar al profe , sobre buenas practicas
			}
		}
	}
}
