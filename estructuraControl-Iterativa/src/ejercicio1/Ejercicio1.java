package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String []args) {
		Scanner teclado=new Scanner(System.in);
		int c=0,cont=0;
		System.out.println("Ingrese los dos numeros a evaluar : ");
		int a=teclado.nextInt();
		int b=teclado.nextInt();
		int[] divisores =new int[a];
		//numero de repeticiones
		if(a<b)
			c=a;
		else
			c=b;
		//evaluar divisores en comun y guardarlos en el arreglo
		for(int i=1;i<=c;i++) {
		if((a%i==0)&&(b%i==0)) {
			divisores[i-1]=i;
			cont=cont+1;
			}
		}
		//mostrar los divisores en comun
		for(int i=0;i<cont+1;i++) {
			System.out.println("Los divisores en comun son : ");
			System.out.println(divisores[i]);
		}
	}
}
