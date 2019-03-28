package deliverable2;

import java.util.Scanner;

public class Deliverable_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare variables
		String userInput1;
		String userInput2;
		int word1Val = 0;
		int word2Val = 0;
		int diff = 0;
		
		
		//input word 1 from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		userInput1 = scan.nextLine();
		
		//input word 2 from user
		System.out.println("Enter another word:");
		userInput2 = scan.nextLine();
		
		//create loops
		for (int i = 0; i < userInput1.length(); i++) {
			word1Val += userInput1.charAt(i);
			}
		for (int i = 0; i < userInput2.length(); i++) {
			word2Val += userInput2.charAt(i);
		}
		
		//
		diff = Math.abs(word1Val - word2Val);
		
		System.out.println("the difference of value of these two words is: " + diff);
		
	}

}
