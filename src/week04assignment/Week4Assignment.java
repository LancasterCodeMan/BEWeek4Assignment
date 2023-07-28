package week04assignment;

import java.util.Arrays;

public class Week4Assignment {

	public static void main(String[] args) {

/*
 1. Create an array of int called ages that contains the following values: 3, 9, * 23, 64, 2, 8, 28, 93.
 */
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
		//declared and initialized array named ages
		
		
		/*
		 * a. Programmatically subtract the value of the first element in the array from
		 * the value in the last element of the array (i.e. do not use ages[7] in your
		 * code). Print the result to the console.
		 */ 
		
		System.out.println("Coding Step 1a: " + (ages[ages.length - 1] - ages[0])); 
		//To get to last element we take length of array - 1 since the first element is 0 to get that value (93). Then we are subtracting the value of first element [0] 
		//where the value is 3. 93 - 3 = 90
		
		
		/*
		 * b. Create a new array with 9 elements (one more than the ages array) Repeat
		 * the step above to ensure it is dynamic (works for arrays of different
		 * lengths).
		 */
		
		int[] ages2 = {4, 10, 24, 65, 3, 9, 29, 94, 105};
		System.out.println("Coding Step 1b: " + (ages2[ages2.length - 1] - ages2[0]));
		//same as above with new array
		
		/*
		 * c. Use a loop to iterate through the array and calculate the average age.
		 * Print the result to the console.
		 */
		int ageHolder = 0; // declare variable to hold age during loop
		int result = 0; // declare variable to hold result of final calculation. Not completely necessary.
		for (int age : ages2) { // loops through array. for each age in age2 array.
			ageHolder += age;	// as it loops through ages 2 array each age is added to ageHolder variable.
		}
		result = ageHolder / ages2.length; //all the ages have been added into ageHolder. Take ageHolder divided by the length of the array to get which is given to the result variable/
		System.out.println("Coding Step 1c: " + result); // print the results.
		
/*
 * 2. Create an array of String called names that contains the following values:
 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
*/	
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//declared and initialized array named names
		
		
		/*
		 * a. Use a loop to iterate through the array and calculate the average number
		 * of letters per name. Print the result to the console.
		 */
		
		double totalLetters = 0; // set variable to hold length of strings through the loop. We will use a double because and average will have decimals
		for(int i = 0; i < names.length; i++){ // we use a loop to go through all the elements taking the length of each element value.
			totalLetters +=  names[i].length(); // we use our totalLetters variable to hold length of each element value and it is added to itself on every loop.
		}
		System.out.println("Coding Step 2a: " + totalLetters / names.length);
		// for the printout we take the total letters variable divided by names.length which is how many elements there are. So 23 letters divided by 6 elements = 3.83
		
		
		/*
		 * b. Use a loop to iterate through the array again and concatenate all the
		 * names together, separated by spaces, and print the result to the console.
		 */
		
		String string = ""; // set an empty string to hold names during the loop
		for (String name : names) { // Create String variable name to loop through names array
			string += name + " "; // use the string variable to a hold each name through the loop. Each time it loops the name is added to the last with a space at the end
		}
		System.out.println("Coding Step 2b: " + string);
		
		
/* 3. How do you access the last element of any array? */
		// If you know the length of the array is one way. Otherwise (array.length - 1) works. since array elements start at 0 you access the last by subtracting one from the length.
		// This would be a dynamic solution.
		
/* 4. How do you access the first element of any array? */
		// The first element of the array is always 0. so... Array[0]
		
/*
 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
 * the previously created names array and add the length of each name to the
 *  * nameLengths array.
*/
		
		int[] nameLengths = new int[names.length]; // create array of int named nameLengths
		for (int i = 0; i < names.length; i++) { // loop through array to create index and element values
		    nameLengths[i] = names[i].length(); // add values to our newly created array nameLenths. At each index in names array the index and string length is added to nameLengths.
		}
		System.out.println("Coding step 5: " + Arrays.toString(nameLengths)); // print our new array NameLenghts on one line.
		
		
		
		
	}

}
