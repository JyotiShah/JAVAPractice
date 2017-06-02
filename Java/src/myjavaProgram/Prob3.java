package myjavaProgram;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args){
		
		int i=18;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = scanner.nextInt();
		
		if (i<age){
			
			System.out.println("Adult");
		}
		else{
				System.out.println("Non-Adult");	
		}
		
	}
}
