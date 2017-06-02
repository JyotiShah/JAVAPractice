package myjavaProgram;

class ThisKeyword {

	int empid;
	String ename;
	
	ThisKeyword(int empid, String ename)
	{
		this.empid=empid;
		this.ename=ename;
	}
	
	void display(){System.out.println(ename+" "+empid);}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword k1 = new ThisKeyword(12,"Aditi");
		ThisKeyword k2 = new ThisKeyword(12,"Aditi");
		
		k1.display();
		k2.display();
	}

}
