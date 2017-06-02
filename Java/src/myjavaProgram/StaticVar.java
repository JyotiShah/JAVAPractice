package myjavaProgram;

public class StaticVar {

	int EmpID;
	String ename;
	static String org = "Cybage"; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar s1 = new StaticVar();
		s1.EmpID=1234;
		s1.ename="Jyoti";
		s1.display();
		
		StaticVar s2 = new StaticVar();
		s2.EmpID=1235;
		s2.ename="Aditi";
		s2.display();
	}

	void display(){System.out.println(EmpID +" "+ ename +" "+org);}
	
	
}
