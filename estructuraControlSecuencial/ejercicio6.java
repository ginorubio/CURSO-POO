package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main (String []args){
		Scanner teclado=new Scanner(System.in);
		int num1=0,num2=0;
		
		System.out.println("ingrese el dia de su nacimiento :");
		int dia=teclado.nextInt();
		System.out.println("ingrese el mes de su nacimiento :");
		int mes=teclado.nextInt();
		System.out.println("Ingrese su edad :");
		int edad=teclado.nextInt();
		
		num1=dia*100+mes;
		num2=edad;
		
		int result=(num1*2+5)*50+num2+365-615;
		
		System.out.println("El resultado es: "+result);
		
	}

}
