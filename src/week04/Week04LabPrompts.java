package week04;

import java.util.*;

public class Week04LabPrompts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		/** These are the Week 04 Lab Prompts:
		 * 
		 * 
		 */
				// 1. Why would we use a StringBuilder instead of a String?
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
				//
				/* ANSWERS: */
				// We would use a StringBuilder where it needs to be mutable, 
				// Strings are immutable.
				StringBuilder labStringBuilder = new StringBuilder();
				for (int i = 0; i < 10; i++) {
					if (i < 9) {
						labStringBuilder.append(i + "-");
					} else {
						labStringBuilder.append(i);
					}
				}
				System.out.println("Question 1: ");
				System.out.println(labStringBuilder.toString());
				
				
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
				List<String> listNoTwo = new ArrayList<String>();
				listNoTwo.add("Uno Uno Uno");
				listNoTwo.add("Tres Tres Tres");
				listNoTwo.add("Cuatro Cuatro Cuatro Cuatro");
				listNoTwo.add("Dos Dos");
				listNoTwo.add("Cinco Cinco Cinco Cinco Cinco");
				
				System.out.println();
				System.out.println("List Number Two String Element Lengths:");
				for (String itemZ : listNoTwo) {
					System.out.println(itemZ.length());
				}
				
				List<String> listNoThree = new ArrayList<String>();
				listNoThree.add("Bench Testing");
				listNoThree.add("Reading");
				listNoThree.add("Writing!");
				listNoThree.add("Reviewing");
				listNoThree.add("Marsupials of America");
				listNoThree.add("Thinking!!");
				listNoThree.add("Practicing!");
				listNoThree.add("Unit Testing!!!");
				
				System.out.println("");
				System.out.println("Original List Number Three:");
				System.out.println(listNoThree);
				
				List<String> listNoThreeCopy = new ArrayList<String>();
				listNoThreeCopy.add("Bench Testing");
				listNoThreeCopy.add("Reading");
				listNoThreeCopy.add("Writing!");
				listNoThreeCopy.add("Reviewing");
				listNoThreeCopy.add("Marsupials of Australia");
				listNoThreeCopy.add("Thinking!!");
				listNoThreeCopy.add("Practicing!");
				listNoThreeCopy.add("Unit Testing!!!");
				
				System.out.println("");
				System.out.println("List Number Three Copy:");
				System.out.println(listNoThreeCopy);
				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
				System.out.println("");
				System.out.println("Quesiton 3: ");
				System.out.println("Shortest String:");
				System.out.println(methodThree(listNoTwo));
				System.out.println(methodThree(listNoThree));
				
				
				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
				System.out.println("");
				System.out.println("Quesiton 4: ");
				System.out.println(listNoThree);
				System.out.println(methodFour(listNoThree));
				
		
				
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
				System.out.println("");
				System.out.println("Quesiton 5: ");
				System.out.println(methodFive(listNoThreeCopy));
				
				/**
				 * Alternative Method I found working on 6:
				 * Take a list, and add a string to the end of each element in the list,
				 * Then return the list.
				 */
				System.out.println("");
				System.out.println("Quesiton 6 Alt: ");
				System.out.println(methodSixAlt(listNoThreeCopy, "Yeah"));
				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
				// (In other words, you provide a list and a string, and the results show the elements
				// of the list that contain that String.)
				System.out.println("");
				System.out.println("Quesiton 6: ");
				System.out.println(methodSix(listNoThreeCopy, "Reading"));
				
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string


				
				// 9. Create a set of strings and add 5 values

				
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.


				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
			
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set


				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word

			
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)

				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
				

			} // End of Main ********
			
			
			// Method 15:
			
			
			
			// Method 14:
			

			
			// Method 12:
			

			
			// Method 11:
			


			// Method 10:
			

			
			// Method 8:
			

			
			// Method 7:
			

			
			// Method 6:
			// Write and test a method that takes a list of strings and a string 
			// and returns a new list with all strings from the original list
			// containing the second string parameter (i.e. like a search method)
			public static List<String> methodSix(List<String> E, String search) {
				List<String> searchResults = new ArrayList<String>();
				
					
					if (E.contains(search)) {
						for (int i = 0; i < E.size(); i++) {
							searchResults.add(E.get(i));
						}
					}  
						
					
				
				
				return searchResults;
			}
	
	
			
			// Method 5:
			// Write and test a method that takes a list of strings 
			// and returns a string 
			// with all the list elements concatenated to each other,
			// separated by a comma.
			public static String methodFive(List<String> E) {
				String theString = "";
				for (int i = 0; i < E.size(); i++) {
					if (i == E.size() - 1) {
						theString += E.get(i);
					} else {
						theString += E.get(i) + ",";
					}
				}
				return theString;
			}
	
			
			
			// Method 4:				
			// Write and test a method that takes a list of strings 
			// and returns the list with the first and last element switched
			public static List<String> methodFour(List<String> E) {
				List<String> captureList = new ArrayList<String>();
				String capture = E.get(E.size()-1);
				String captureEnd = E.get(0);
				captureList.add(capture);
				E.remove(0);
				E.remove(E.size() - 1);
				for (int i = 0; i < E.size(); i++) {
					captureList.add(E.get(i));
				}
				captureList.add(captureEnd);
	
				return captureList;
			}
			
			
			
			// Method 3:
			// Write and test a method that takes a list of strings 
			// and returns the shortest string:
			public static String methodThree(List<String> E) {
				String nextCapture = "";
				String previousOne = "";
				String shortest = "";

				String firstOne = E.get(0);
				for (int i = 0; i < E.size(); i++) {
					nextCapture = E.get(i);
						if (firstOne.length() <= nextCapture.length()) {
							shortest = firstOne;
							previousOne = nextCapture;
						} else {
							shortest = nextCapture;
							previousOne = firstOne;
						}	
							
						if (shortest.length() <= nextCapture.length()) {
							previousOne = nextCapture;
						} else {
							shortest = nextCapture;
						}
						
						if (nextCapture.length() <= previousOne.length()) {
							shortest = nextCapture;
						} else {
							shortest = previousOne;
						}
					
				}
				
					return shortest;

				
			}   // End of method 3.
			
			
			
			//
			//
			
			// Method 6 Alt:
			// Take a list, and add a string to the end of each element in the list,
			public static List<String> methodSixAlt(List<String> E, String str) {
				List<String> captureList = new ArrayList<String>();
				for (String strList : E) {
					captureList.add(strList + str);
				}
				return captureList;
			}
	
	
	
		//
		//
	

} // End of Class
