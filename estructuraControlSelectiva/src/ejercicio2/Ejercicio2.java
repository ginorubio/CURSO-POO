
package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
        public static void main (String []args){
	Scanner teclado=new Scanner(System.in);
	System.out.println("Ingresar el primer numero");
	int num1=teclado.nextInt();
	System.out.println("Ingresar el segundo numero");
	int num2=teclado.nextInt();
	int result=0;	

	if(num1>0 && num2>0)
		result=num1*num2;
	else
		result=num1+num2;

	System.out.println("El resultado es :" +result);

    }
    
}
