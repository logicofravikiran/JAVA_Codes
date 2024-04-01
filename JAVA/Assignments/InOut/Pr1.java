

import java.util.*;

class Pr1{

	public static void main(String[]args){
	
		System.out.print("Enter Number:- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%2==0){
			System.out.println(num + " is an Even Number");
		}
		else{
		
			System.out.println(num + " is an Odd Number");
		}	
	}
}
