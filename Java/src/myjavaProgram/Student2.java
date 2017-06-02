package myjavaProgram;

public class Student2 {

	int rollno;
	String name;
	
	void insertRecord(int r, String n) //method to insert records
	{
		rollno = r;
		name = n;
	}
	
	void displayinformation() //method to print information
	{
		System.out.println(name +" " +rollno);
	}
	
	public static void main(String[] args) //main method to create objects
	{
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		
		s1.insertRecord(123,"Jyoti");
		s2.insertRecord(154, "Vijay");
		
		s1.displayinformation();
		s2.displayinformation();
	}
}
