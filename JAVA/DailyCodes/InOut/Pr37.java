

import java.util.*;

class Pr37{

	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);		//Scanner automatically cleanes the Buffer to take next input from the user 

		System.out.print("Enter Your Name:- ");
		String name = sc.next();

		System.out.print("Enter Society Name:- ");
		String socName = sc.next();
		
		System.out.print("Enter Wing:- ");
		char wing = sc.next().charAt(0);			//method of reading character at index 0 of a string
		
		System.out.print("Enter Flat No.:- ");
		int flatNo = sc.nextInt();

		System.out.println("Name:- "+ name);
		System.out.println("Society:- "+ socName);
		System.out.println("Wing:- "+ wing);
		System.out.println("Flat No.:- "+ flatNo);
	}
}
