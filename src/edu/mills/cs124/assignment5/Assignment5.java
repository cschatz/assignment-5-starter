package edu.mills.cs124.assignment5;
import java.util.ArrayList;
import java.util.Arrays;
public class Assignment5 {

	public static void flavorMixes(ArrayList<String> flavors) {
		
	}
	
	public static void shoppingOptions(int maxItems, int total, ArrayList<Integer> prices) {

	}
	
	private static boolean chainHelper(ArrayList<Domino> sofar, ArrayList<Domino> remain) {
	
		// fake return value - you should replace this!
		return false;
	}
	
	public static void chainFormable(ArrayList<Domino> dominos) {
		ArrayList<Domino> chain = new ArrayList<Domino>();
		if (chainHelper(chain, dominos)) {
			System.out.println("Yes, those can form a chain:");
			chain.forEach((Domino d) -> System.out.print(d));
			System.out.println();
		} else {
			System.out.println("Those CANNOT form a chain.");
		}
	}
	
	
	public static void main(String[] args) {
		// Here is an example test for each task
		
		checkFlavorMixes("lime", "peach", "pineapple");
		
		checkShoppingOptions(3, 10, 1, 2, 2, 3, 4, 5, 7, 9);
		
		checkChainFormable(new Domino(1, 3), new Domino(2, 3), new Domino(1, 5));
	}
	
	// =======================================================
	//   Methods below here are already complete. 
	//   You should not change them.
	// =======================================================
	
	
	public static void checkFlavorMixes(String... originalFlavors) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(originalFlavors));
		System.out.println("All flavor mixes possible: ");
		flavorMixes(list);
	}
	
	public static void checkShoppingOptions(int maxItems, int total, Integer... originalPrices) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(originalPrices));
		System.out.printf("Possible ways to buy up to %d item%s totalling exactly $%d:\n",
				maxItems, (maxItems == 1 ? "" : "s"), total);
		shoppingOptions(maxItems, total, list);
	}
	
	public static void checkChainFormable(Domino... originalDominos) {
		ArrayList<Domino> list = new ArrayList<Domino>(Arrays.asList(originalDominos));
		chainFormable(list);
	}
	
	
	
}

