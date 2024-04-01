

import java.util.*;

class Pr2{

	public static void main(String[]args){
	
		System.out.print("Enter Your Age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age>=0){
		
			if (age>=18 && age<=100){
			
				System.out.println("Voter is Eligible for Voting");
			}else{
			
				System.out.println("Voter is Not Eligible for Voting");
			}
		}else{
		
			System.out.println("Please enter Valid Age");
		}
	}
}
