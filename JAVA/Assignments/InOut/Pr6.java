

import java.util.*;

class Pr6{

	public static void main(String[]args){
	
		System.out.print("Enter Starting Number:- ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.print("Enter Ending Number:- ");
		int num2 = sc.nextInt();

		for (int i=num1; i<=num2; i++){
		
			System.out.print(i + ",");
		}

	}
}
