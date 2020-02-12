package pregunta3;

import java.util.Scanner;

public class Pregunta3 {
	
	public static void main(String argc[]) {
	
	Scanner teclado= new Scanner(System.in);
	
	String texto1="";
	String texto2="";
	System.out.println("ingresar el texto a evaluar :");
	texto1=teclado.nextLine();

	
	if(texto1.equalsIgnoreCase(texto2) )
		System.out.println("son iguales");
	else
		System.out.println("Son diferentes ");
	
	}
}
