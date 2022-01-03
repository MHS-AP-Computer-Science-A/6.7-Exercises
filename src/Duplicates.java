

public class Duplicates {

	public static void main(String[] args) {

		// Array to hold 20 ints
		int[] numbers = new int[10];

		// Fill array with random numbers
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 50);
		}

		// Sort the list so that binary search can work
		boolean result = findDuplicates(numbers);
		
		//Display the results of the method
		System.out.println("Has duplicates: " + result);

		// Display the list so you can verify your work
		System.out.print("Array values: [");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println("]");

	}
	
	//POST: returns true if arr contains duplicate values
	//      and false otherwise
	public static boolean findDuplicates(int[] arr) {
           //Your code here
	}

}
