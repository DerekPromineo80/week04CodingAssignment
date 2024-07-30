package week04;

public class Week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Week 4 Coding Project
		 *  
		 *  By Derek McGuire
		 *  
		 *  The comments show which question and sub-question the code is answering.
		 *  The prompts are copied from the assignment. 
		 *  
		 *  There are 13 questions in total, plus 8 "sub-questions".
		 *  
		 *  The method bodies are listed below the End of Main.
		 *  
		 *  I also added Print statements to organize the output for the reader.
		 *  
		 */
		
		
		
		
		// Question 1: 
		// Create an array of int called ages 
		// that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//
		// ANSWER:
		// Here I create an int array, initialized with the values provided:
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		
		// Question 1. a.
		// Programmatically subtract the value of the first element in the array 
		// from the value in the last element of the array 
		// (i.e. do not use ages[7] in your code). 
		// Print the result to the console.  
		//
		// ANSWER:
		// I added One print statement, to reference the question:
		System.out.println("Question 1.a. Output: ");
		// Here I combined the "Programmatic Subtraction" with the Print statement:
		System.out.println(ages[ages.length-1] - ages[0]);  // Should be 93 - 3 which would be 90.
		
		
		// Question 1. b.
		// Create a new array of int called ages2 with 9 elements 
		// (ages2 will be longer than the ages array, and have more elements).  
		//
		// ANSWER:
		// Here I made up the values and made sure there were 9 elements:
		int[] ages2 = {10, 20, 30, 40, 50, 60, 70, 80, 99}; 
		
		
		// Question 1. b. i.
		// Make sure that there are 9 elements of type int in this new array.  
		// 
		// ANSWER:
		// I will use ages2.length and print that out to confirm the length of ages2.
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 1.b.i. Output: ");
		// Printing out ages2.length to ensure 9 elements, concatenated with a String statement:
		System.out.println("Length of ages2 = " + ages2.length);
		
		
		// Question 1. b. ii.
		// Repeat the subtraction from Step 1.a. 
		// (Programmatically subtract the value of the first element 
		// in the new array ages2 from the last element of ages2). 
		//
		// ANSWER:
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 1.b.ii. Output: ");
		// Here I did the same thing as before, 
		// putting the arithmetic into the Print statement:
		System.out.println(ages2[ages2.length-1] - ages2[0]);  // Should be 99 - 10 which would be 89.
		
		
		// Question 1. b. iii.
		// Show that using the index values for the elements is dynamic 
		// (works for arrays of different lengths).
		//
		// ANSWER:
		// The code above shows that using the index value is programmatic. 
		// No predetermined value was assigned but rather operations using the index itself. 
		// ages2[0] has 0, which is ALWAYS the first element. 
		// ages2[ages2.length - 1] is ALWAYS going to reference the final element, 
		// no matter how many elements are in the array.
		// There could be 5, 50, or 500 elements, but these will always be first and last.
		// So, arrayName[0] is first, arrayName[arrayName.length - 1] is last.
		// This is demonstrated above in that the same basic code worked for ages and ages2.
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 1.b.iii. Output: ");
		// I copied both lines to show the similarities side-by-side:
		System.out.println(ages[ages.length - 1] - ages[0]);
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		
		
		// Question 1. c.
		// Use a loop to iterate through the array and calculate the average age. 
		// Print the result to the console.
		// 
		// ANSWER:
		// Here I set up an int sumAge to capture the incremental sum of age:
		int sumAge = 0;
		// Here is the loop, an enhanced for loop, or a "for each loop":
		// The loop will take every element in ages and incrementally add it to sumAge, 
		// in each loop iteration:
		for (int age : ages) {
			sumAge += age;
		}
		// I used a double type in order to have a more accurate age average.
		// Note that ints can pass into doubles with no problem, as a property of the data types.
		double ageAvg = sumAge / ages.length;
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 1.c. Output: ");
		// Here is the print statement for 1. c. to show the average:
		System.out.println(sumAge / ages.length);
		
		
		// Question 2: 
		// Create an array of String called names that contains the following values: 
		// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//
		// ANSWER:
		// Here I create the String array with the values provided:
		// I had copied the string but had to replace the double quotation marks.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		
		// Question 2. a.
		// Use a loop to iterate through the array and calculate the average number of letters per name. 
		// Print the result to the console.
		//
		// ANSWER:
		// I initialized a String, an int, and two doubles to help the loop:
		String getName = "";
		int nameLength = 0;
		double nameSum = 0;
		double nameAvg = 0;
		double sum = 0;
		// Below is the loop, a traditional for loop:
		// It has the index start at zero and then be less than the array names length.
		// The iteration of the loop is an increment of the index i.
		// The String 'getName' collects a single String at index i of the array "names".
		// The nameLength is an int that captures the length of the single String element.
		// The nameSum increments with each String element's length (from names array).
		// The nameAvg takes the nameSum, equal to all the lengths (nameLength) added up, 
		// and then is divided by the "names.length" value, 
		// which is the number of elements in the array.
		for (int i = 0; i < names.length; i++) {
//			getName = names[i];				// edited code to make it shorter. 
			sum += names[i].length();
//			nameLength = getName.length();
//			nameSum += nameLength;
//			nameAvg = nameSum / names.length;
		}
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 2.a. Output: ");
		// I set a String Variable to capture the formatted output of the Int Variable.
		// Using a built in String Method: String.format(), to Round the nameAvg output. 
		// I did this to make it easier to read.
		String nameAvgRounded = String.format("%.2f", sum/names.length);
		// nameAvgRounded is a String output of the double nameAvg, for readability.
		System.out.println(nameAvgRounded);
		
		
		// Question 2. b.
		// Use a loop to iterate through the array again and concatenate all the names together, 
		// separated by spaces, and print the result to the console.
		//
		// ANSWER:
		// Here I initialized a String variable that is empty:
		String namesConcatenated = "";
		// Here is the loop, an enhanced for loop to grab each element out of the names array
		// the String namesConcatenated increments with each String element plus a space.
		for (String name : names) {
			namesConcatenated += name + " ";
		}
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 2.b. Output: ");
		// Here is the output of the namesConcatenated String after the for loop is completed:
		System.out.println(namesConcatenated);
		
		
		// Question 3:
		// How do you access the last element of any array?
		// 
		// ANSWER: For an array called arrayName, you take the arrayName.length - 1.
		// So, the last element in arrayName would be arrayName[arrayName.length - 1].
		// In the array names, it would be as follows:
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 3. Output: ");
		// Here I use the array "names" to show how to print out the last element in that array:
		System.out.println(names[names.length - 1]);
		
		
		// Question 4:
		// How do you access the first element of any array?
		//
		// ANSWER: For an array called arrayName, you take the index of 0.
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 4. Output: ");
		// So, the first element in arrayName would be arrayName[0].
		// In the array names, it would be as follows:
		System.out.println(names[0]);
		
		
		// Question 5:
		// Create a new array of int called nameLengths. 
		// Write a loop to iterate over the previously created names array 
		// and add the length of each name to the nameLengths array.
		//
		// ANSWER:
		// I created the int Array nameLengths before the loop:
		int[] nameLengths = new int[names.length];
		// Here is the loop to iterate over the names array:
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		// No output requested in Question 5.
		
		
		// Question 6:
		// Write a loop to iterate over the nameLengths array 
		// and calculate the sum of all the elements in the array. 
		// Print the result to the console.
		//
		// ANSWER:
		// the int lengthSum captures all the length increments
		int lengthSum = 0;
		// Here is a for each loop, the enhanced for loop, to take one length out of nameLengths at a time,
		// and add it to an incremental total of the int lengthSum:
		for (int length : nameLengths) {
			lengthSum += length;
		}
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 6. Output: ");
		// The result of lengthSum after the loop is finished is printed:
		System.out.println(lengthSum);
		
		
		// Question 7:
		// Write a method that takes a String, word, and an int, n, as arguments 
		// and returns the word concatenated to itself n number of times. 
		// (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		//
		// ANSWER: See the Method body below "End of Main"
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 7. Output: ");
		// Invoking the method here:
		// The method takes a String and an int and returns the concatenated String:
		System.out.println(questionSeven("Hello", 3));
		// Just for fun, another test:
		System.out.println(questionSeven("Echo", 5));
		
		
		// Question 8:
		// Write a method that takes two Strings, firstName and lastName, 
		// and returns a full name 
		// (the full name should be the first and the last name as a String separated by a space).
		//
		// ANSWER: See the Method body below "End of Main"
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 8. Output: ");
		// Invoking the method here:
		// The method takes two Strings, first and last names, and concatenates them into one String output:
		System.out.println(questionEight("James", "Gosling"));
		// Using String variables as arguments:
		String nameEight1 = "Larry";
		String nameEight2 = "Ellison";
		// Invoking the method using predetermined String arguments:
		System.out.println(questionEight(nameEight1, nameEight2));
		
		
		// Question 9:
		// Write a method that takes an array of int 
		// and returns true if the sum of all the ints in the array is greater than 100.
		//
		// ANSWER: See the Method body below "End of Main"
		// I created three int arrays to run three tests, i.e. to invoke the method three times:
		int[] q9ArrayLarge = {11, 22, 33, 44, 55, 66, 77, 88};
		int[] q9ArraySmall = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] q9ArrayExact = {10, 90};
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 9. Output: ");
		// Invoking the method here:
		// The method takes in an array in the method's parameter.
		// I did three tests, i.e. three different arguments,
		// to show that the method is working correctly for multiple test cases:
		System.out.println(questionNine(q9ArrayLarge));
		System.out.println(questionNine(q9ArraySmall));
		System.out.println(questionNine(q9ArrayExact));
		
		
		// Question 10:
		// Write a method that takes an array of double 
		// and returns the average of all the elements in the array.
		// 
		// ANSWER: See the Method body below "End of Main"
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 10. Output: ");
		double[] q10Array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
		// Invoking the method here:
		System.out.println(questionTen(q10Array));
		// Adding 1 through 8 gives 36, dividing 36 by 8 gives 4.5.
		
		
		// Question 11:
		// Write a method that takes two arrays of double 
		// and returns true 
		// if the average of the elements in the first array 
		// is greater than the average of the elements in the second array.
		// 
		// ANSWER: See the Method body below "End of Main"
		// I needed two double arrays to test the method:
		double[] q11Array1 = {111.0, 222.0, 333.0, 444.0, 555.0, 666.0, 777.0, 888.0};
		double[] q11Array2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8};
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 11. Output: ");
		// Invoking the method here:
		System.out.println(questionEleven(q11Array1, q11Array2));
		// Invoking in reverse argument order to test that it should be 'false':
		// The instructions clearly state the averages of the elements of
		// the first array being larger than the second array yields true:
		System.out.println(questionEleven(q11Array2, q11Array1));
		
		
		// Question 12:
		// Write a method called willBuyDrink 
		// that takes a boolean isHotOutside, and a double moneyInPocket, 
		// and returns true 
		// if it is hot outside and if moneyInPocket is greater than 10.50.
		// 
		// ANSWER: See the Method body below "End of Main"
		// Invoking the method here:
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println();
		System.out.println("Question 12. Output: ");
		// Setting up two variables for the first test case:
		boolean isHotOutside = true;
		double moneyInPocket = 10.52;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket)); // should be true
		// Invoking the method again to try out other cases:
		System.out.println(willBuyDrink(false, 11.50)); // should be false
		System.out.println(willBuyDrink(true, 10.50)); // should be false
		System.out.println(willBuyDrink(false, 5.00)); // should be false
		
		
		// Question 13:
		// Create a method of your own that solves a problem. 
		// In comments, write what the method does and why you created it.
		//
		// ANSWER:
		// PROBLEM OF MY OWN: 
		// Method: "Bread, Cheese, Coffee & a Trip To the Store"
		// Write a method that takes in three booleans, and returns a String.
		// In the method, A fourth boolean variable is set that controls the String return.
		// If two or more (of the three) are true, you do Not need to go to the Store.
		// If you have two items out of bread, cheese, and coffee, print "Do not go to the store".
		// Otherwise, if you do not have two out of the three items, print "You need to go to the store".
		// If only one or none of the three boolean inputs are true, 
		// return false, because you need to go to the store.
		// Return a String that says one or the other outcome.
		// 
		// ANSWER OF MY OWN: See the Method body below "End of Main"
		// Setting up three boolean variables to run a test:
		// The parameters of the method are three booleans, here are three arguments:
		boolean hasBread = false;
		boolean hasCheese = false;
		boolean hasCoffee = true;
		// I added Two print statements, one to make a space, one to reference the question:
		System.out.println("");
		System.out.println("Question 13. Output: ");
		// Invoking the method here:
		System.out.println(questionThirteen(hasBread, hasCheese, hasCoffee));
		// To make sure this worked, I created a table of 8 outcomes.
		// I changed the hasBread, hasCheese, and hasCoffee to test all 8 possibilities.
		// Recreating the results of that here:
		System.out.println();
		System.out.println(questionThirteen(true, true, true));    // Should be: do not go to store
		System.out.println(questionThirteen(true, true, false));   // Should be: do not go to store
		System.out.println(questionThirteen(true, false, true));   // Should be: do not go to store
		System.out.println(questionThirteen(true, false, false));  // Should be: Yes go to store
		System.out.println(questionThirteen(false, true, true));   // Should be: do not go to store
		System.out.println(questionThirteen(false, true, false));  // Should be: Yes go to store
		System.out.println(questionThirteen(false, false, true));  // Should be: Yes go to store
		System.out.println(questionThirteen(false, false, false)); // Should be: Yes go to store
		
		
		
	}	// End of Main
	
	// Begin Method Bodies Here:
	
	
	// Question 7 Method:
	// Method Signature matches the question it is answering:
	public static String questionSeven(String word, int n) {
		// Initializing a String to collect the words to concatenate, and to be returned.
		String wordConcat = "";
		// Traditional for loop initialized at 0, a condition to stop less than the n provided,
		// iterates by 1.
		for (int i = 0; i < n; i++) {
			wordConcat += word;
		}
		// The method returns a String:
		return wordConcat;
	}
	
	
	// Question 8 Method:
	// Method Signature matches the question it is answering:
	public static String questionEight(String firstName, String lastName) {
		// Initializing a String that also performs the concatenation:
		return firstName + " " + lastName;
		// Returns the string, once it's been concatenated, concatenation within the return.
		
	}
	
	// Question 9 Method:
	// Method Signature matches the question it is answering:
	public static boolean questionNine(int[] intArray) {
		// Initializing the int arraySum to be used in and after the loop:
		int arraySum = 0;
		// Enhanced for loop to take each num (int element) within the intArray:
		for (int num : intArray) {
			// Incrementing the sum by each element, in each iteration of the loop:
			arraySum += num;
		}
		// Conditional If statement, with the condition that 
		// IF the arraySum is greater than 100,
		// return true, else false:
		return (arraySum > 100); 
		
	}
	
	// Question 10 Method:
	// Method Signature matches the question it is answering:
	public static double questionTen(double[] doubleArray) {
		// Initializing a double called arraySum to capture the sum:
		double arraySum = 0.0;
		for (double num : doubleArray) {
			arraySum += num;
		}
		// Initializing a double and performing the average calculation:
		double arrayAvg = arraySum / doubleArray.length;
		// Returning the double arrayAvg:
		return arrayAvg;
				
	}
	
	// Question 11 Method:
	// Method Signature matches the question it is answering:
	public static boolean questionEleven(double[] array1, double[] array2) {
		// creating two double variables to initialize them for the subsequent loops.
//		double array1Sum = 0.0;
//		double array2Sum = 0.0;
//		// Here this enhanced for loop sums up the individual numbers, num, for the first array:
//		for (double num : array1) {
//			array1Sum += num;
//		}
//		// Here this enhanced for loop sums up the individual numbers, num, for the second array:
//		for (double num : array2) {
//			array2Sum += num;
//		}
		// This if statement controls what will be returned. The method returns a boolean:
		//return (array1Sum > array2Sum); 
		return (questionTen(array1) > questionTen(array2)); } // Reusing the questionTen method to return average.
	
	
	// Question 12 Method:
	// Method Signature matches the question it is answering:
	// In this problem, the method signature is provided:
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		// Creating a conditional IF statement that combines required logic,
		// Depending on the two inputs, the method will return a boolean true or false:
		return ((isHotOutside) && (moneyInPocket > 10.50)); 
	}		
				
				
	// Question 13 Method:
	// See full explanation above, where the method is invoked in the main body.
	// Method Signature matches the question it is answering:
	public static String questionThirteen(boolean bread, boolean cheese, boolean coffee) {
		boolean goToStore = true; // initializing the boolean that will control the print statement.
		// First If Statement to break down the logic into smaller parts:
		// Given "having bread" = false, then only one other needs to be false to go to the store:
		if (!bread) {
			if ((!cheese) || (!coffee)) { // the ! means 'not', and if "not bread" means "bread == false"
				goToStore = true;
			// If bread is false but the other two are true, also do not need to go to the store.
			} else if ((cheese == true) && (coffee == true)) {
				goToStore = false;
			}
		// Once it is determined that one element is True, then only one other condition would 
		// make the overall result false, and that is if the other two are false & false.
		} else if (bread == true) {
			if ((cheese == false) && (coffee == false)) {
				goToStore = true;
			} else {
				goToStore = false;
			}
		}
		// Initializing two possible String outcomes, to prepare the return statement:
		String goToStoreYes = "You need to go to the store.";
		String goToStoreNo = "Do not go to the store.";
		// Final check to take the results of the logic above and decide the print statement:
		if (goToStore == true) {
			return goToStoreYes;
		} else {
			return goToStoreNo;
		}
	}
	
	// End of Method Bodies
	
} // End of Class

