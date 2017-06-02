package myjavaProgram;

public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//reverse a string
		String name = "Jyoti Shah";
		String reverse = new StringBuffer(name).reverse().toString();
		System.out.println(reverse);
		
		// reverse a name by words
			String string = "Jyoti Kirtikumar shah Vijay malekar Aditi maleker";
		    StringBuilder stringBuilder = new StringBuilder();
		    String[] words = string.split(" ");

		    for (int j = words.length-1; j >= 0; j--) {
		        stringBuilder.append(words[j]).append(' ');
		    }
		    System.out.println("Reverse words: " + stringBuilder);
		
		
	}

}
