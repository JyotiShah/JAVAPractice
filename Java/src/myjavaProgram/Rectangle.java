package myjavaProgram;

public class Rectangle {

public static void main(String[] args){
		
		Rectangle R1 = new Rectangle();
		Rectangle R2 = new Rectangle();
		
		R1.insert(11, 15);
		R2.insert(18, 16);
		
		R1.area();
		R2.area();
		
	}

	int length, breadth;
	
	void insert(int l, int b)
	{
		length = l;
		breadth = b;
	}

	void area(){System.out.println("area = " +(length*breadth));}
	
	
	
}

