package myjavaProgram;

interface Status1{
	void Draft();
	void NotStarted();
	void Inprogress();
	void Completed();
}
abstract class statuses implements Status1{ //interface with abstract class
	
	public void Draft(){
		System.out.println("Draft");
	}
}
class Substat extends statuses{
	
	public void NotStarted(){
		System.out.println("NotStarted");
	}
	public void Inprogress(){
		System.out.println("Inprogress");
	}
	public void Completed(){
		System.out.println("Completed");
	}
}
public class MultipleInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status1 obj = new Substat(); //interface with abstract class
		obj.Draft();
		obj.Inprogress();
		obj.NotStarted();
		obj.Completed();
		System.out.println();obj.hashCode();
		
	}

}
