
package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main (String []args){
	Scanner teclado=new Scanner(System.in);
	System.out.println("Ingresar el numero a evaluar :");
	
	int num=teclado.nextInt();
	
	if(num%2==0)
		System.out.println("El numero es par");
	else
		System.out.println("El numero es impar");		
    }
}
