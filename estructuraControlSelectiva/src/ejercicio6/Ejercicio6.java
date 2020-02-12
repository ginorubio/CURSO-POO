
package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String []args){
        Scanner teclado=new Scanner(System.in);    
        
        System.out.println("Ingresar las tres longitudes :");
        int a=teclado.nextInt();
        int b=teclado.nextInt();
        int c=teclado.nextInt();
        int suma1=a+b,suma2=a+c,suma3=b+c;
        if((suma1>c)&&(suma2>b)&&(suma3>a))
            System.out.println("Se puede formar un triangul0");
        
        if((a==b)&&(b==c))
            System.out.println("Es un triangulo equilatero");
        else 
            if((a==b)||(b==c))
                System.out.println("Es un triangulo isosceles");
            else
                System.out.println("Es un triangulo escaleno");
    }
}
