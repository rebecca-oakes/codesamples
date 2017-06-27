import java.util.Arrays;

public class charSearch {

	public static void main(String[] args) {
		String sentence = "abc from fr fm fa ff";
		String word = "f";
		String replace = "m";
		
		//String position = searchString(sentence, word);
		//replaceString(sentence, word, replace, position);
		fast(sentence, word, replace);
	}

	public static String searchString(String sentence, String word){
		int count = 0;
		int jCount = 0;
		String position = "";
		int J=0;
		boolean found=false;
		for(int i = 0; i < sentence.length(); i++){
				if(sentence.substring(i, i+1).equals(word.substring(J, J+1))){
					found=true;
					for(int a=0;a<word.length();a++){
						if (sentence.substring(i+a,i+a+1).equals(word.substring(a,a+1))){
								jCount++;
						}
						else{
							found = false;
							jCount = 0;
							break;
						}
					}
				}
				if(found){
					count++;
					if(count == 1)
						position = "" + i;
					else
						position = position + "," + i;
				}

				found = false;		
		}
		System.out.println("Word Count: " + count);
		System.out.println("Positions: " + position);
		return position;
	}
	
	public static void replaceString(String sentence, String word, String replace, String position){
		String[] split = position.split(",");
		int[] positions = new int[split.length];
				
		for(int a = 0; a < split.length; a++){
			positions[a] = Integer.parseInt(split[a]);
		}
		
		// go to the position in the sentence, remove word, then replace with new word
		for(int x = 0; x < positions.length; x++){
			
		}
	}
	
	public static void fast (String sentence, String word, String replace){
		boolean found = sentence.contains(word);
		String positions = "";
		
		if(found){
			int index = sentence.indexOf(word);
		
			positions = "" + index;
			for (int i = index+1; i < sentence.length();){
				positions = positions + ", " + sentence.indexOf(word, i);
				i = sentence.indexOf(word, i);
			}
		}
		
		System.out.println(positions);
		System.out.println(sentence.replace(word, replace));
	}
}
