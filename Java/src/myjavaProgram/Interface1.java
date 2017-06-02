package myjavaProgram;

interface Print{  
void print();  
}  
  
interface Show{  
void show();  
}

//Multiple interfaces and inheritance

public  class Interface1 implements Print, Show{

	public void print(){
		System.out.println("Printed");
	}
	public void show(){
		System.out.println("Show must go on");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interface1 obj = new Interface1();
		obj.print();
		obj.show();
		
	}

}
