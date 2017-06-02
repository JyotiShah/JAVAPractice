package myjavaProgram;

public class Promotion {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Promotion ov = new Promotion();
			ov.sum(10, 20);
			ov.sum(10.51, 12.45);
			ov.sum(1.4, 2.5, 3.4);
			
		}

		void sum(int a, long b){System.out.println("Sum of Integers = "+(a+b));} //check data type
		void sum(double a, double b){System.out.println("Sum of Double = "+(a+b));} //check data type
		void sum(double a, double b, double c){System.out.println("Sum of Double = "+(a+b+c));} //check data type
}
