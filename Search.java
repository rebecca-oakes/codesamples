
public class Search {  // DOESN'T WORK

	public static void main(String[] args) {
		String sentence = "I am from Stirling. I am, I am.";
		String word = "a";
		
		searchString(sentence, word);
	}

	public static void searchString(String sentence, String word){
		int count = 0;
		int jCount = 0;
		String position = "";
		boolean same = false;
		int len = word.length();
		
		for(int i = 0; i < sentence.length(); i++){
			for(int j = 0; j < word.length(); j++){
				if(sentence.charAt(i) == word.charAt(j)){
					same = true;
					jCount++;
					break;
				}
				else{
					same = false;
					jCount = 0;
				}
				
				if(jCount == len && same == true){
					count++;
					if (count > 1)
						position = position + ", " + i;
					else
						position = "" + i;
					jCount = 0;
				}
			}	
		}
		
		System.out.println("Word Count: " + count);
		System.out.println("Word Position(s): " + position);
	}
}
