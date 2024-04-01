


import java.util.*;

class Pr5{

	public static void main(String[]args){
	
		System.out.print("Enter Number:- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num%16==0 && num!=0){
			System.out.println(num + " is Divisible by 16");
		}
		else{
		
			System.out.println(num + " is Not Divisible by 16");
		}	
	}
}
