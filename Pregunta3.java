package pregunta3;

public class Pregunta3 {
	
	public static void main (String argc[]) {
		double x=1.0;
		double y=0.0;
		double z=2.0;
		
		boolean w=x*y<z/x||x/y>z*x&&z*y<x&&(++y<x||--z>y);//verdadero
		
		if(w)
			System.out.println("Verdadero");
		else
			System.out.println("falso");
		
		
	}

}
