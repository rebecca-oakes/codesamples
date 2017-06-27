
public class Substring {

	public static void main(String[] args) {
		String n = "Newport";
		String nn = "I am from Stirling.";

		getSubstring(n);
		subStringCount(nn);
		getWordCount(nn);
		stringEquals();
		printWords(nn);
	}
	
	public static void getSubstring(String n){ // get a substring of an input
		for(int i = 0; i < n.length(); i++)
			System.out.println(n.substring(i, n.length()));
	}
	
	public static void getWordCount(String n){ // Count number of words in a String
		int count = 0;
		int len = n.length()-1;
		boolean word = false;
		
		for(int i = 0; i < n.length(); i++){
			if (Character.isLetter(n.charAt(i)) && i != len) { // char is a word, word = true
	            word = true;
	        } else if (!Character.isLetter(n.charAt(i)) && word) { // char isn't letter but there have been letters before
	        	word = false;
	            count++;
	        } else if (Character.isLetter(n.charAt(i)) && i == len) { // end of the string
	            count++;
	        }
		}
		System.out.println("Word count = " + count);
	}
	
	public static void subStringCount(String n){ // count words using substring
		int counter = 0;
		
		for(int i = 0; i < n.length(); i++){
			if(n.substring(i, i+1).equals(" "))
				counter++;
		}
		
		System.out.println("Word Count : " + (counter + 1));
	}
	
	public static void stringEquals(){ // Check if Strings are equal
		String a = "Newport";
		String b = "Stirling";
		
		if(a.equals(b))
			System.out.println("The two strings are the same.");
		else
			System.out.println("The two strings are different.");
	}
	
	public static void printWords(String n){
		int len = n.length();		
		
		for(int i = 0; i < len; i++){
			if(n.substring(i, i + 1).equals(" ")){System.out.print("\n");}
			else{System.out.print(n.substring(i, i+1));}
		}		
	}
}
