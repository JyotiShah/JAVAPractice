package myjavaProgram;

public class Overloadingbydatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloadingbydatatype ov = new Overloadingbydatatype();
		ov.sum(10, 20);
		ov.sum(10.51, 12.45);
		ov.sum(1.4, 2.5, 3.4);
		
	}

	void sum(int a, int b){System.out.println("Sum of Integers = "+(a+b));}
	void sum(double a, double b){System.out.println("Sum of Double = "+(a+b));}
	void sum(double a, double b, double c){System.out.println("Sum of Double = "+(a+b+c));}
}
