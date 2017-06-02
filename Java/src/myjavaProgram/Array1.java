package myjavaProgram;

public class Array1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
	//Print each of the element in array
	
		for(int i=0; i<arr.length; i++){
			//System.out.println(arr[i]);
			
			sum = sum + arr[i];	
		}
		
		System.out.println("Sum = "+sum);
	}
	
}
