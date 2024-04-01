

import java.util.*;

class Pr3{

	public static void main(String[]args){
	
		System.out.print("Enter Number:- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%8==0 && num!=0){
			System.out.println(num + " is Divisible by 8");
		}
		else{
		
			System.out.println(num + " is Not Divisible by 8");
		}	
	}
}
