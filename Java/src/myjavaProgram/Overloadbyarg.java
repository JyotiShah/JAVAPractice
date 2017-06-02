package myjavaProgram;

public class Overloadbyarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloadbyarg arg = new Overloadbyarg();
		arg.sum(10, 20);
		arg.sum(10, 20, 30);
		
	}

	void sum(int a, int b){System.out.println("Sum = "+(a+b));}
	void sum(int a, int b, int c){System.out.println("Sum = "+(a+b+c));}
	
}
