package pregunta4;

public class Pregunta4 {
	
	
	
	public static void main (String []argc) {
		int result=0;
		FISIPoo1[] objs=new FISIPoo1[3];
		objs[0]=new FISIPoo1();
		objs[1]=new FISIPoo2();
		objs[2]=new FISIPoo3();
		
		for(int i=0;i<3;i++) {
			result+=objs[i].Calcula();

		}
	System.out.println(result)	;
	}

}
class FISIPoo1{
	public static int Calcula() {
		return 1;
	}
}

class FISIPoo2 extends FISIPoo1{
	public static int Calcula() {
		return 2;
	}
}

class FISIPoo3 extends FISIPoo2{
	public static int Calcula() {
		return 3;
		
	}
}


