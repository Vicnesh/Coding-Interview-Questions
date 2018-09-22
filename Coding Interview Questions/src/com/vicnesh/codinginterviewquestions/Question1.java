package com.vicnesh.codinginterviewquestions;

import java.util.Random;

/* Question 1
 * Rotate Array in Java
 * Problem: Rotate an array of n elements to the right by k steps. 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * How many different ways do you know to solve this problem?
 * 
 */

public class Question1 {
	//member variables
		//array
	private int testArray[];
	private int order;
	
	//methods
	//constructor
	public Question1() {
		System.out.println("Question 1");
		System.out.println("Problem: Rotate an array of n elements to the right by k steps.\n"
				+ "For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].\n"
				+ "How many different ways do you know to solve this problem?");
	}
	
	
	public void setOrder(int order) {
		this.order = order;
	}
	
	public void initializeTestArray() {
		Random randomNumber = new Random();
		testArray = new int[7];
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = i+1;
		}
		System.out.println("\nTest Array of size: " + this.testArray.length + " created.");
	}
	
	public void printTestArrayValues() {

		for (int i = 0; i < testArray.length; i++) {
			System.out.print(testArray[i] + " ");
		}
		System.out.print("\n");
	}
	
	public int getArrayValueByElement(int i) {
		return this.testArray[i];
	}
	
	//solution methods
	public void solution1(int counter, int currentArrayElementPointer, int currentArrayElementValue) {
		
		int counterIn = counter;
		int currentValue = currentArrayElementValue;
		int pointer = currentArrayElementPointer;
		
		pointer = pointer + this.order;
		if (pointer >= 7) {
			pointer = pointer - 7;
		}

		int temp = this.testArray[pointer];
		this.testArray[pointer] = currentValue;
		currentValue = temp;
		counterIn = counter +1;

		if (counterIn < this.testArray.length) {
			this.solution1(counterIn, pointer, currentValue);
		}
	}
	
	
}
