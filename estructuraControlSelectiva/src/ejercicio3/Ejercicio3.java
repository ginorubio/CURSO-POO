
package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main (String []args){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingresar los tres numeros a evaluar : ");
        int num1=teclado.nextInt();
        int num2=teclado.nextInt();
        int num3=teclado.nextInt();
        
        int mayor=0,result=0;
        
        if(num1>num2)
            if(num1>num3){
                 mayor=num1;
                if(num2>num3)
                    result=num2;
                else
                    result=num3;
            }else
                result=num1;
         System.out.println("El numero con valor inermedio es: "+result);
    }
}
