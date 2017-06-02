package myjavaProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class frontTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
}

	public frontTimes() {
		  
		String input="";
        System.out.println("Enter the input string");
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         char[] try1= input.toCharArray();
         
         for (int i=0; i<=try1.length; i++){
        	 System.out.println(try1[0]+try1[1]+try1[3]); 
         }
		  
		}
	//return r;
}
