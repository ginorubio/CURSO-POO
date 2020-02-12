package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main (String []args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese el valor de a:");
		int a=teclado.nextInt();
		System.out.println("Ingrese el valor de b:");
		int b=teclado.nextInt();
		
		int c=0;
		c=a;
		a=b;
		b=c;
		
		System.out.println("el valor de a: "+a);
		System.out.println("El valor de b : "+b);		
	}
}
