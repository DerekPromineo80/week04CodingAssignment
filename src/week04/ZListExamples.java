package week04;

import java.util.List;
import java.util.*;

public class ZListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		/** From Week 04, these are List Examples
		 * 
		 */
		
		// First List:
		System.out.println("List: week4ch1Parts");
		List<String> week4ch1Parts = new ArrayList<String>();
		week4ch1Parts.add("StringBuilder");
		week4ch1Parts.add("Lists");
		week4ch1Parts.add("Collections");
		week4ch1Parts.add("Menu App");
		
		System.out.println("For Loop: ");
		for (int i = 0; i < week4ch1Parts.size(); i++) {
			System.out.println(week4ch1Parts.get(i));
		}
		
		System.out.println("");
		System.out.println("Enhanced For Loop: ");
		for (String part : week4ch1Parts) {
			System.out.println(part);
		}
		
		// Second List:
		System.out.println("");
		System.out.println("List: chores");
		List<String> chores = new ArrayList<String>();
		chores.add("Sweep Floors");
		chores.add("Scrub Toilet");
		chores.add("Vacuum Rug");
		chores.add("Take Trash Out");
		chores.add("Wash Clothes");
		chores.add("Clean The Shower");
		chores.add("Make Bed");
		chores.add("Put Groceries Away");
		
		for (String chore : chores) {
			System.out.println(chore);
		}
		
		
		// Third List:
		System.out.println("");
		System.out.println("List: sweepFloors");
		List<String> sweepFloors = new ArrayList<String>();
		sweepFloors.add("Get Broom");
		sweepFloors.add("Get Dustpan");
		sweepFloors.add("Clear Objects From Area");
		sweepFloors.add("Commence Sweeping");
		
		for (int i = 0; i < sweepFloors.size(); i++) {
			System.out.println(sweepFloors.get(i));
		}
		
		
		// Fourth List:
		System.out.println("");
		System.out.println("List: scrubToilet");
		List<String> scrubToilet = new ArrayList<String>();
		scrubToilet.add("Flush Toilet");
		scrubToilet.add("Find Toilet Brush");
		scrubToilet.add("Use Clorox Toilet Bowl Cleaner");
		scrubToilet.add("Commence Scrubbing");
		
		for (String scrub : scrubToilet) {
			System.out.println(scrub);
		}
		
		// Fifth List:
		System.out.println("");
		System.out.println("List: vacuumRug");
		List<String> vacuumRug = new ArrayList<String>();
		vacuumRug.add("Find Vacuum");
		vacuumRug.add("Move Vacuum To Location");
		vacuumRug.add("Remove Obstructions From Area");
		vacuumRug.add("Plug Vacuum In");
		vacuumRug.add("Commence Vacuuming");
		
		for (int v = 0; v < vacuumRug.size(); v = v + 2) {
			System.out.println(vacuumRug.get(v));
		}
		
		// Sixth List:
		System.out.println("");
		System.out.println("List: takeTrashOut");
		List<String> takeTrashOut = new ArrayList<String>();
		takeTrashOut.add("Locate All Trash");
		takeTrashOut.add("Put All Trash Into Trash Bags");
		takeTrashOut.add("Tie Trashbags Closed");
		takeTrashOut.add("Take All Trashbags Outside");
		takeTrashOut.add("All Trashbags Go To Landfill");
		
		System.out.println("List Size = " + takeTrashOut.size());
		System.out.println(takeTrashOut.get(0));
		System.out.println(takeTrashOut.get(1));
		System.out.println(takeTrashOut.get(2));
		System.out.println(takeTrashOut.get(3));
		System.out.println(takeTrashOut.get(4));
		// End of Sixth List Prints
		
		// Seventh List:
		System.out.println("");
		System.out.println("List: washClothes");
		List<String> washClothes = new ArrayList<String>();
		washClothes.add("Collect Dirty Clothes");
		washClothes.add("Take Dirty Clothes To Washing Machine");
		washClothes.add("Put All Dirty Clothes In Washing Machine");
		washClothes.add("Add Laundry Detergent In Proper Area");
		washClothes.add("Start Washing Machine");
		
		for (String step : washClothes) {
			System.out.println(step);
		}
		System.out.println(washClothes);
		
		// Eighth List:
		// Copying Question 6:
		System.out.println("");
		System.out.println("List: newChars");
		List<Character> newChars = new ArrayList<>();
		newChars.add('a');
		newChars.add('b');
		newChars.add('c');
		newChars.add('d');
		newChars.add('e');
		
		char letter = newChars.remove(3);
		System.out.println(letter);
		
		// Ninth List:
		// Copying Question 7:
		System.out.println("");
		System.out.println("List: intSevenList");
		// Given
		int numSeven1 = 9;
		int numSeven2 = 27;
		int numSeven3 = 243;
		int numSeven4 = 2187;
		// "My Code":
		int numSum1to4 = numSeven1 + numSeven2 + numSeven3 + numSeven4;
        List<Integer> intSevenList = new ArrayList<>();
        intSevenList.add(numSeven1);
        intSevenList.add(numSeven2);
        intSevenList.add(numSeven3);
        intSevenList.add(numSeven4);
        intSevenList.add(numSum1to4);
        System.out.println(intSevenList);
        
		// Tenth List:
        // Copying Question 12:
        System.out.println("");
		System.out.println("List: twelveInts");
        List<Integer> twelveInts = new ArrayList<>();
        twelveInts.add(894);
        twelveInts.add(-1);
        twelveInts.add(1077);
        twelveInts.add(43);
        twelveInts.add(54329);
        
        Collections.sort(twelveInts);
        System.out.println(twelveInts);
        
        // Eleventh List:
        // Copying Question 15:
        System.out.println("");
		System.out.println("List: alphabet");
        List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
		    alphabet.add((char) i);
		}
		for (int i = 0; i < alphabet.size(); i++) {
			System.out.println(alphabet.get(i));
		}
		System.out.println("");
		System.out.println(alphabet.get(13));
        System.out.println(alphabet.indexOf('n'));
		
        // Question 16:
        System.out.println("");
        alphabet.remove(0);
        System.out.println(alphabet);
        
        
        // Twelfth List:
        // Copying Question 17:
        // This was the body of a static void method called "factors"
        System.out.println("");
        System.out.println("List: factorNum");
        int userNumber = 88;
        List<Integer> factorNum = new ArrayList<>();
        for (int i = 1; i <= userNumber; i++) {
            if (userNumber % i == 0) {
                factorNum.add(i);
            }
        }
        System.out.println(factorNum);
        
        
        // Thirteenth List:
        // Copying Question 18:
        // This was the body of a static void method called "factors"
        System.out.println("");
        System.out.println("List: measurements");
        List<Double> measurements = new ArrayList<>();
        measurements.add(1.12);
        measurements.add(6.9);
        measurements.add(14.25);
        measurements.add(20.84);
        System.out.println(measurements.contains(14.25));
        
		//
		//
	}	// End of Main

}		// End of Class
