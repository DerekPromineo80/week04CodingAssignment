package week04;

public class ZStringBuilderExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** StringBuilder Examples
		 * 
		 */
		
		// First StringBuilder, with Strings to build with:
		String sentenceOne = "This is a sentence. Sentence one.";
		String sentenceTwo = "This is sentence two.";
		
		StringBuilder newStringBuilder = new StringBuilder();
		newStringBuilder.append(sentenceOne);
		newStringBuilder.append(sentenceTwo);
		newStringBuilder.append("0-");
		
		System.out.println(newStringBuilder.toString());
		
		// Adding a " " to the middle of this thing:
		newStringBuilder.insert(sentenceOne.length(), " ");
		
		System.out.println(newStringBuilder.toString());
		

		
		
		
		//
		//
		
	}	// End of Main

}	// End of Class
