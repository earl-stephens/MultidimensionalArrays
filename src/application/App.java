package application;

public class App {

	public static void main(String[] args) {
		// multidimensional array is an array of arrays

		String[][] texts = { 
				{ "one", "two", "three" }, 
				{ "four", "five", "six" }, 
				{ "seven", "eight", "nine" } };
		
		// have to use nested loops to iterate through the arrays

		for(int i = 0; i < texts.length; i++) {
			//this outputs three array object references
			//System.out.println(texts[i]);
			
			String[] subArray = texts[i];
			
			for(int j = 0; j < subArray.length; j++) {
				System.out.printf("%s\t", subArray[j]);
			}
			System.out.println();
		}
	}

}
