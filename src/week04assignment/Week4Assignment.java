package week04assignment;

import java.lang.reflect.Array;
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
		
/*
 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
 * of all the elements in the array. Print the result to the console
*/	
		int arrayLength = 0; //initialize variable to hold length of each element during loop
		for (int num : nameLengths) { // loop through nameLengths array grabbing element value
			arrayLength += num; // add element (integers) to arrayLength on each loop giving total sum when loop ends
		}
		System.out.println("Coding step 6: " + arrayLength); //print arrayLength variable which now hold sum of all the elements in nameLengths loop.
	
	
/*
 * 7. Write a method that takes a String, word, and an int, n, as arguments and
 * returns the word concatenated to itself n number of times. (i.e. if I pass in
 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
*/
		
		System.out.println("Coding step 7 using loop: " + repeatWord("Hello", 5));
		System.out.println("Coding step 7 using repeat method: " + easyRepeatWord("Hello", 5));

/*
 *  * 8. Write a method that takes two Strings, firstName and lastName, and returns
 * a full name (the full name should be the first and the last name as a String
 * separated by a space).
*/
		System.out.println("Coding step 8: " + createFullName("Tony", "Kuligowski"));
		
/*
 * 9. Write a method that takes an array of int and returns true if the sum of
 * all the ints in the array is greater than 100.
*/
		int[] test1 = {3, 9, 23, 64, 2, 8, 28, 93}; //sum greater than 100
		int[] test2 = {1, 5, 9, 10}; // sum less than 100
		
		System.out.println("Coding step 9 test1: " + sumTrueOrFalse(test1));
		System.out.println("Coding step 9 test2: " + sumTrueOrFalse(test2));

/*
 * 10. Write a method that takes an array of double and returns the average of
 * all the elements in the array.
*/
		double[] testDouble1 = {1.5, 5.3, 9.8, 10.2}; //average 6.7
		double[] testDouble2 = {3.5, 5.2, 6.9, 15.9}; //average 7.875
		System.out.println("Coding step 10: " +returnAverage(testDouble1));
		
/*
 * 11. Write a method that takes two arrays of double and returns true if the
 * average of the elements in the first array is greater than the average of the
 * elements in the second array.
 */	
		System.out.println("Coding step 11: "+ compareArrayAverage(testDouble1, testDouble2)); //returns false 6.7 is not greater than 7.875
		
		
/*
 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
 * a double moneyInPocket, and returns true if it is hot outside and if
 * moneyInPocket is greater than 10.50.
 */		
		boolean isHotOutside = true;
		double moneyInPocket = 10.55;
		System.out.println("Coding step 12: " + willIGetADrink(isHotOutside, moneyInPocket)); 


/*
 * 13. Create a method of your own that solves a problem. In comments, write
 * what the method does and why you created it.
 */
		double[] rainFall2022 = {4.3, 5.1, 0.4, 2.3, 5.8, 11.2, 10.1, 2.3, 5.7, 6.9, 2.7, 1.5};
		System.out.println("Coding step 13: In 2022 this month had the most rain: "+ (whichMonthHadMostRain(rainFall2022)));
		//This method takes 12 months of rain fall and returns the month that has the greatest rain amount. I chose this because I like weather and 
		//wanted to see if I could line up an array of strings and an array of numbers with the same length and pull them using a common index number. 
		
	}// end of main method
	
	
		//Method 13
	public static String whichMonthHadMostRain(double[]array) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		double max = array[0];
		int maxIndex = 0;
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
		}
		return months[maxIndex];
	}
		
	//Method 12	
	public static boolean willIGetADrink(boolean isHotOutside, double moneyInPocket) { //create method that returns boolean with boolean and double input parameters
		if(isHotOutside = true && moneyInPocket > 10.50) { // check both conditions for using if statement for true or false return
			return true;
		}
			return false;
	}
	
	//Method 11
	public static boolean compareArrayAverage(double[]array1, double[]array2) { //create method that returns boolean and has two array of double for input parameters
		double sumArray1 = 0; //initialize sum variable for Array1
		double sumArray2 = 0; //initialize sum variable for Array2
		for(double num : array1) { //  loop through array1 and add each number to sumArray variable
			sumArray1 += num;
		}
		for(double num : array2) {//  loop through array2 and add each number to sumArray variable
			sumArray2 += num;
		}
		if((sumArray1 / array1.length) > (sumArray2 / array2.length)) { //compare averages of array1 and array 2
			return true;
		}
			return false;
	}
		
		//Method 10
	public static double returnAverage(double[] array) {
		double sum = 0; //create and initialize sum variable to hold values as they are added to sum during loop
		for(double num : array) { //create loop to add total of all array to sum variable
			sum+= num; //add each number of array to sum variable until loop ends
		}
		return sum /array.length; // return the sum of the array of double divided by the length for average
	}
		
		//Method 9
	public static boolean sumTrueOrFalse(int[] numbers) { //create boolean method, pass in Array of int and return true or false
		int sum = 0; // initialize sum variable which hold sum of the integers as the loop iterates. Each loop the next integer is added to the total. 
		for(int num : numbers) { // Each loop the next integer is added to the sum variable.
			sum += num;
		}
		if(sum > 100) { // if statement to compare if sum is greater or less than 100
			return true; // return true if sum is greater than 100
		}
			return false;// return false if sum is less than 100
	}
	
		
	//Method 8
	public static String createFullName(String firstName, String lastName) { // create method that takes first name and last name as parameters
		String fullName = firstName + " " + lastName; // create and initialize fullName string variable that combines first and last name with space in middle
		return fullName; // return fullName
	}//end creatFullName method
		
	//Method 7
	public static String repeatWord(String word, int n) { //create method returning a string with a string and integer as input parameters
		String result = ""; //assign empty sting to variable. This will hold our word as it repeats.
		for (int i = 0; i < n; i++) { // run loop the same times as variable n
			result += word;  // result holds the word and adds the word to it again each time until the loop ends.
		}
		return result;	// this is not a void method so it returns the result
	
	}//end repeatWord method
	
	public static String easyRepeatWord(String word, int n) {
		String repeatedWord = word.repeat(n); // instead of using loop use string repeat method. Pass in value or int variable for how many times to repeat.
		return repeatedWord;
	}// end easyRepeatWord method
	
} // end of class
