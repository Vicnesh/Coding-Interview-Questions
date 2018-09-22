package com.vicnesh.codinginterviewquestions;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		Question1 question1 = new Question1();
		question1.initializeTestArray();
		System.out.print("Start: ");
		question1.printTestArrayValues();
		System.out.println("Order to rotate: 3");
		question1.setOrder(3);
		question1.solution1(0, 0, question1.getArrayValueByElement(0));
		System.out.print("Results: ");
		question1.printTestArrayValues();
	}
}
